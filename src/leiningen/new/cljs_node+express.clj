(ns leiningen.new.cljs-node+express
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-node+express"))

(defn cljs-node+express
  "Generate a new ClojureScript project using Node.js and Express."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cljs-node+express project.")
    (->files data
             [".gitignore" (render "gitignore" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)])))
