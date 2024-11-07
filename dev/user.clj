(ns user
  (:require [l-clip.system :as system]
            [juxt.clip.repl :refer [start stop reset set-init! system]]))

(set-init! #(system/system-config :dev))
