#!/bin/bash
touch src/clj/deck36/storm/clj/lein_trigger.clj && lein with-profile dev compile && lein uberjar

