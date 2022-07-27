//For jwt Token
java -jar jwtenizr.jar
//For payara micro
java -jar payara-micro-5.2022.2.jar --deploy MSAApp/artifact/MSAApp.war --port 8585
java -jar payara-micro-5.2022.2.jar --deploy MSAClient/artifact/MSAClient.war --port 8586
