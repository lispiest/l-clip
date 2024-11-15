(ns l-clip.system
  (:require [l-clip.util :refer [read-edn]]))

(defn system-config
  [profile]
  (read-edn (str "system/" (name profile) ".edn")))
