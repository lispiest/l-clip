(ns l-clip.core
  (:require [juxt.clip.core :as clip]
            [datomic.client.api :as d]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))

(defn read-edn
  [path]
  (edn/read-string (slurp (io/resource path))))

(defn client
  []
  (d/client {:server-type :datomic-local
             :system "db"}))

(defn create
  [client db-name]
  (d/create-database client {:db-name db-name}))

(defn connect
  [client db-name]
  (d/connect client {:db-name db-name}))

(defn seed
  [conn]
  (let [schema (read-edn "db/schema.edn")
        data (read-edn "db/data.edn")
        xact #(d/transact conn {:tx-data %})]
    (xact schema)
    (xact data)))
