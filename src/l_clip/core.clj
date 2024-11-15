(ns l-clip.core
  (:require [l-clip.system]
            [juxt.clip.core :as clip]))

(def system nil)

(defn -main
  [& _]
  (let [system (clip/start (l-clip.system/system-config :dev))]
    (alter-var-root #'system (constantly system))
    (println "Starting up on port" (:port (:http system))))
  @(promise))
