(ns l-clip.http
  (:require [yada.yada :refer [resource]]
            [datomic.client.api :as d]))

(defn find-seed-resource
  [conn]
  (resource {:methods {:get {:produces ["application/json"]
                             :response (fn [ctx]
                                         (d/q '[:find ?title
                                                :where
                                                [?e :movie/title ?title]]
                                              (d/db conn)))}}}))
