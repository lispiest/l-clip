(ns l-clip.system
  (:require [l-clip.core :refer [read-edn]]))

(defn system-config
  [profile]
  (read-edn (str "system/" (name profile) ".edn")))
