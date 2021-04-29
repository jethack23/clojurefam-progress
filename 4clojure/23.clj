(fn [seq]
  (loop [seq seq
         ret '()]
    (if (empty? seq)
      ret
      (recur (rest seq) (conj ret (first seq))))))
