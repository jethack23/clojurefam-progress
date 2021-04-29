(fn [seq]
  (loop [seq seq
         cnt 0]
    (if (empty? seq)
      cnt
      (recur (rest seq) (inc cnt)))))
