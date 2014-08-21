(ns {{name}}.core
  (:require [cljs.nodejs :as node]))

(def express (node/require "express"))
(def morgan (node/require "morgan"))
(def http (node/require "http"))

(defn -main [& args]
  (let [app (express)]
    (doto app
      (.use (morgan "combined"))
      (.get "/" (fn [req res]
                  (.send res "Hello, World!\n"))))
    (let [server (.createServer http app)]
      (.listen server 3000)
      (println (str "Express server started on port:"
                    (.-port (.address server)))))))

(node/enable-util-print!)
(set! *main-cli-fn* -main)
