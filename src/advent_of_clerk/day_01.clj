;; # 🎄 Advent of Clerk: Day 1
(ns advent-of-clerk.day-01
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [nextjournal.clerk :as clerk]))

(def input
  (slurp (io/resource "day_1.txt")))

;; ## Part 1
(def calories-sums
  (->> (str/split-lines input)
       (mapv parse-long)
       (partition-by nil?)
       (take-nth 2)
       (map #(reduce + %))))

(reduce max calories-sums)

;; ## Part 2
(->> calories-sums
     (sort-by -)
     (take 3)
     (reduce +))

