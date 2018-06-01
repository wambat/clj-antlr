(defproject d0x-mike/clj-antlr "0.2.7-SNAPSHOT"
  :description "Clojure bindings for the ANTLR 4 parser library."
  :url "http://github.com/wambat/clj-antlr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.antlr/antlr4-runtime "4.7.1"]
                 [org.antlr/antlr4 "4.7.1"]]
  :profiles {:dev {:dependencies
                   [[criterium "0.4.4"]
                    [cheshire "5.6.3"]
                    [org.clojure/test.check "0.9.0"]
                    [instaparse "1.4.2"]]}}
  :java-source-paths ["src/java/"]
  :test-selectors {:default (complement :perf)
                   :perf :perf
                   :all  (fn [_] true)}
  :global-vars {*warn-on-reflection* true})
