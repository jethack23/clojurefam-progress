(fn [x y]
  (loop [x x
         y y
         ret []]
    (if (or (empty? x) (empty? y))
      ret
      (recur (rest x) (rest y) (conj (conj ret (first x)) (first y))))))
