(fn [lst]
  (loop [lst lst
         dummy nil
         ret nil]
    (if (empty? lst)
      ret
      (recur (rest lst) (first lst) dummy))))
