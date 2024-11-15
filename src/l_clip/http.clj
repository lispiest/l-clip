(ns l-clip.http
  (:require [yada.yada :refer [resource listener]]
            [datomic.client.api :as d]))

(defn listen
  [handler port]
  (listener handler {:port port}))

(defn find-seed-resource
  [conn]
  (resource {:methods {:get {:produces ["application/json"]
                             :response (fn [ctx]
                                         (d/q '[:find ?title
                                                :where
                                                [?e :movie/title ?title]]
                                              (d/db conn)))}}}))
