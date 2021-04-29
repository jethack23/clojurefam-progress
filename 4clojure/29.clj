(fn [s]
  (reduce str
          (filter (fn [c]
                    (Character/isUpperCase c))
                  s)))
