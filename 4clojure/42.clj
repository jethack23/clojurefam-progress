(fn [n]
  (loop [n n
         ret 1]
    (if (= n 1)
      ret
      (recur (dec n) (* ret n)))))
