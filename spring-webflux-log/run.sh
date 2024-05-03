#!/bin/sh
JAVA_OPTS="-Xmx1g -Xms1g -XX:+UseStringDeduplication -XX:GCTimeRatio=19 -XX:MaxGCPauseMillis=500 -XX:+ParallelRefProcEnabled -XX:ParallelGCThreads=12"
exec java -server $JAVA_OPTS -jar app.jar