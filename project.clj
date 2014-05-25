(defproject startingclojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.3.0-RC1"]
                 [compojure "1.1.8"]
                 [enlive "1.1.5"]]
  :main ^:skip-aot startingclojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
