(ns beepbop.kernel
  "Kernel runner namespace"
  (:require [clojure.core.async :refer [<! <!! timeout chan go go-loop]]
            [clojure.tools.logging :as log])
  (:use [beepbop.github :as gh]))

(defn ^:private compute-main []
  "Current thread kernel, will be executed
   every intervals"
  (log/info "New main thread spawned")
  (gh/invite-user "trosa"))

;; Thread delay interval
(def ^:private interval 10000)

(def ^:private acond (atom true))
(defn ^:private cref []
  "Simple condition wrapper"
  @acond)

(defn ^:private chan-interface []
  "Channel interface runner"
  (go (while (cref)
        (<! (timeout interval))
        (compute-main))))

(defn boot-kernel []
  "Start runnable kernel"
  (let [ch (atom nil)]
    (log/info "Booting up kernel")
    (reset! ch (chan-interface))
    (while (cref)
      (<!! @ch))))