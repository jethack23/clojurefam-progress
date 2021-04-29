(fn [i]
  (take i
        (map first
             (iterate
              (fn [vec]
                [(+ (first vec)
                    (second vec))
                 (first vec)])
              [1 0]))))
