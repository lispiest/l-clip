(ns l-clip.db
  (:require [juxt.clip.core :as clip]
            [datomic.client.api :as d]
            [l-clip.util :refer [read-edn]]))

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
