(defproject beepbop "0.1.0-SNAPSHOT"
  :description "42og group manager bot for newcomer. "
  :url "https://github.com/42og/beepbop"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [tentacles-fork "0.6.0-SNAPSHOT"]]
  :main ^:skip-aot beepbop.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
