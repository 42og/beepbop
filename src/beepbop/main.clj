(ns beepbop.main
  "Main namespace"
  (:gen-class)
  (:require [clojure.tools.logging :as log])
  (:use [beepbop.kernel]))

(defn -main []
  "Application entry point"
  (log/info "Application started")
  (beepbop.kernel/start-kernel))