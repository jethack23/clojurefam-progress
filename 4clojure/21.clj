(fn [seq i]
  (loop [seq seq
         i i]
    (if (= i 0)
      (first seq)
      (recur (rest seq) (dec i)))))
