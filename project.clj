(defproject cloj_test "0.1.0-SNAPSHOT"
  :description "Testing capabilities of clojure"
  :url "https://github.com/AlgirdasV/testing_clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot cloj-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
