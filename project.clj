(defproject deck36-storm-backend-nodejs "0.0.1-SNAPSHOT"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :aot :all
   
  :plugins [[lein-git-deps "0.0.1-SNAPSHOT"] [lein-idea "1.0.1"]]


  :resource-paths [
  "resources/nodejs/"
  "resources/config/storm.yml"
  "resources/config/storm_dev.yml"
  "resources/config/storm_prod.yml"
  ]

  :git-dependencies [
                        ["https://github.com/steschas/storm-rabbitmq.git"]
                        ["https://github.com/steschas/storm-json.git"]
                    ]

  :dependencies [
                    [commons-collections/commons-collections "3.2.1"]
                    [com.googlecode.json-simple/json-simple "1.1"]
                    [redis.clients/jedis "2.0.0"]
                    [com.rabbitmq/amqp-client "3.3.1"]
                    [io.latent/storm-rabbitmq "0.5.11-SNAPSHOT"]
                    [com.rapportive/storm-json "0.0.1"]
                    [com.jayway.jsonpath/json-path "0.9.1"]
                 ]
              
  :exclusions [org.slf4j/slf4j-log4j12 storm/storm]

  :profiles {:dev {:dependencies [[storm "0.9.0.1"]]}}

  :min-lein-version "2.0.0"

)


