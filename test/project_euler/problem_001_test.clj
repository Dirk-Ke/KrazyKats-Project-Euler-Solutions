(ns project-euler.problem-001-test
  (:require [clojure.test :refer :all]
            [project-euler.problem-001 :refer :all]))

(deftest test-sum-of-multiples
  (testing "Summe der Vielfachen von 3 und 5 unter 10"
    (is (= (sum-of-multiples 10) 23)))
  (testing "Summe der Vielfachen von 3 und 5 unter 1000"
    (is (= (sum-of-multiples 1000) 233168))))
