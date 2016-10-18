# LogGenerator
This Application generates logs

Update log4j.properties under /src/main/resources/log4j.properties to the path where you want to generate the log file.: 

log4j.appender.file.File=/Users/username/Documents/demo/logs1/application.log

Build :

mvn assembly:assembly

It creates the LogGenerator-1.0-SNAPSHOT.jar jar under target folder.

Run:
java -cp LogGenerator-1.0-SNAPSHOT.jar com.demo.HelloExample 1

1 - number of logs needs to be generated (1 *50 threads) -  50 records.
