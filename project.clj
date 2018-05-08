(defproject beepbop "0.1.0-SNAPSHOT"
  :description "42og group manager bot for newcomer. "
  :url "https://github.com/42og/beepbop"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.clojure/core.async "0.4.474"]
                 [tentacles-fork "0.6.0-SNAPSHOT"]]
  :main ^:skip-aot beepbop.main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
