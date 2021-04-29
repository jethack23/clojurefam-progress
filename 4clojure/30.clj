(fn [x]
  (loop [lst x
         ret []]
    (if (empty? lst)
      ret
      (recur (rest lst)
             (let [val (first lst)]
               (if (= (last ret) val)
                 ret
                 (conj ret val)))))))
