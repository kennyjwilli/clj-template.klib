(ns clj.new.klib
  (:require
    [clj.new.templates :as templates]))

(defn klib
  [name & _]
  (let [render (templates/renderer "klib")
        data (templates/project-data name)]
    (println "Generating fresh 'clj new' clj-template.klib project.")
    (templates/->files data
      [".gitignore" (render "gitignore" data)]
      ["deps.edn" (render "deps.edn" data)]
      ["LICENSE" (render "LICENSE" data)]
      ["tests.edn" (render "tests.edn" data)]
      ["build.clj" (render "build.clj" data)]
      ["bin/kaocha" (render "kaocha" data)]
      [".circleci/config.yml" (render "config.yml" data)]
      ["src/{{nested-dirs}}.clj" (render "core.clj" data)]
      ["test/{{nested-dirs}}_test.clj" (render "test.clj" data)])))

(comment
  (let [render (templates/renderer "library")]
    (render "config.yml" {}))
  )
