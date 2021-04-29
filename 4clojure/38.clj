(fn [& args]
  (loop [lst args
         ret 0]
    (if (empty? lst)
      ret
      (recur (rest lst)
             (let [val (first lst)]
               (cond
                 (nil? ret) val
                 (> val ret) val
                 :else ret))))))
