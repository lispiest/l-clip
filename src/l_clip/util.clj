(ns l-clip.util
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]))

(defn read-edn
  [path]
  (edn/read-string (slurp (io/resource path))))
