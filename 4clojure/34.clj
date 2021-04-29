(fn [l r]
  (loop [i l
         ret []]
    (if (= i r)
      ret
      (recur (inc i)
             (conj ret i)))))
