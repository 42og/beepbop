(ns beepbop.main
  "Main namespace"
  (:gen-class)
  (:require [clojure.tools.logging :as log])
  (:use [beepbop.kernel :as k]))

(defn -main []
  "Application entry point"
  (log/info "Application started")
  (k/boot-kernel))