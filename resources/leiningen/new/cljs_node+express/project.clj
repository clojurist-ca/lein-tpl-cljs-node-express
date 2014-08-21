(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]
  :plugins [[lein-npm "0.4.0"]
            [lein-cljsbuild "1.0.3"]]
  :node-dependencies [[express "4.x"]
                      [morgan "~1.2.3"]]
  ;; Any package.json keys other than name, description, version and
  ;; dependencies should be added to the :nodejs map.
  :nodejs {:private "true"}
  :source-paths ["src"]
  :cljsbuild {:builds [{:id "{{name}}"
                        :source-paths ["src"]
                        :compiler {:output-to "app.js"
                                   :output-dir "out"
                                   :target :nodejs
                                   :optimizations :simple}}]})
