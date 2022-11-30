;; # 🎄 Advent of Clerk: Day 1
(ns advent-of-clerk.day-01
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [nextjournal.clerk :as clerk]))

(def input
  (slurp (io/resource "day_1.txt")))

(->> (str/split-lines input)
     (partition-by str/blank?)
     (filterv #(not= % [""]))
     (mapv (fn [xs] (mapv #(Integer/parseInt %) xs)))
     (map #(reduce + %))
     (apply max))

