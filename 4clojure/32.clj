(fn [v]
  (loop [v v
         ret []]
    (if (empty? v)
      ret
      (recur (rest v)
             (let [val (first v)]
               (conj (conj ret val) val))))))
