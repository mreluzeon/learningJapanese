(require '[lumo.build.api :as b])

(println "wow")

(b/build
  (b/inputs "src")
  {:output-dir "out"
   :output-to "out/main.js"
   :main 'japaneseLearning.core})

(comment
  :watch-fn (fn []
              (println "wow")))
