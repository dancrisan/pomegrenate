# pomegrenate
Cloud write to ClusterPoint DB (node.js) + Mobile read from DB (java) 

Go to https://www.clusterpoint.com/, create a free account and then a database

*To read from the DB and display data in your command line :* 

*Check version of your Java SDK : java -version

If SDK 7 then use 

*javac -cp cps2-java-api-java-7.jar testJavaToClusterPoint.java

*java -cp .:cps2-java-api-java-7.jar testJavaToClusterPoint

If SDK 8 then use 

*javac -cp cps2-java-api-java-8.jar testJavaToClusterPoint.java

*java -cp .:cps2-java-api-java-8.jar testJavaToClusterPoint

*To write to your DB with a node.js application* 

*(after installing node) npm install cps-api

*node blueMixToDB.js



