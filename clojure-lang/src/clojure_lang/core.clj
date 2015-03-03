(ns clojure-lang.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


;; Prob 1 
(defn multipleOf3Or5 [x]
	(or (= (mod x 3) 0) (= (mod x 5) 0)))

(defn prob1 []
	(reduce + (filter multipleOf3Or5 (take 1000 (range)))))