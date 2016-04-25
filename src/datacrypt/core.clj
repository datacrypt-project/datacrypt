(ns datacrypt.core
  (:require [hitchhiker.redis :as redis]
            [hitchhiker.tree.core :as core]
            [hitchhiker.tree.messaging :as msg]
            [datascript.core :as d])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
