# Storm Topologies for the "Plan9 From Outer Space" Tutorial Game

## 1. Setup project

	# make sure you have maven
	# sudo apt-get install maven
	./prepare.sh

## 2. Within the "deck36-api-backend" project, make sure, you created your production files in the `target/resources` directory. 

## 3. Compile and build deployable jar file

	./build.sh


## Run Locally (for testing)

In our vagrant enviroment, Storm is installed in `/opt/storm`. We can thus execute the topology locally by:

	/opt/storm/bin/storm jar target/deck36-storm-backend-nodejs-0.0.1-SNAPSHOT-standalone.jar deck36.storm.plan9.nodejs.HighFiveStreamJoinTopology dev

Note: To run the topology in dev mode within the vagrant, make sure your node binary and javascript paths in the yaml files (see resources/config)  are correct and don't differ due to your local development machine setup.


### Deploy to Cluster 

Deploying to a cluster is very simple as well, because all the cluster config is handled by the `storm` command. We thus just need to switch `dev` to `prod`:

	/opt/storm/bin/storm jar target/deck36-storm-backend-nodejs-0.0.1-SNAPSHOT-standalone.jar deck36.storm.plan9.nodejs.HighFiveStreamJoinTopology prod


