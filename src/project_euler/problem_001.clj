(ns project-euler.problem-001)

(defn multiple-of-three-five [x]
  (or (zero? (mod x 3)) (zero? (mod x 5))))

(defn sum-of-multiples [limit]
  (reduce + (filter multiple-of-three-five (range limit))))

(defn -main []
  (println "Summe der Vielfachen von 3 und 5 unter 1000:" (sum-of-multiples 1000)))
