(ns beepbop.kernel
  "Kernel runner namespace"
  (:require [clojure.core.async :as a :refer [<! timeout chan go go-loop]]
            [clojure.tools.logging :as log]))

(defn ^:private compute-main []
  "Current thread kernel, will be executed
   every intervals"
  (log/info "Hello World !"))

;; Thread delay interval
(def ^:private interval 10000)

(def ^:private acond (atom true))
(defn ^:private cref []
  "Simple condition wrapper"
  @acond)

(defn start-kernel []
  "Start monothilic runner"
  (log/info "Booting up kernel")
  (go
    (while (cref)
      (<! (timeout interval))
      (compute-main))))