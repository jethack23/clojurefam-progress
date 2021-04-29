(fn [vec]
    (loop [vec vec
           ret nil]
      (if (empty? vec)
        ret
        (recur (rest vec) (first vec)))))
