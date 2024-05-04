#!/bin/sh
JAVA_OPTS="-Xmx600m -Xms128m -XX:+UseStringDeduplication -XX:GCTimeRatio=19 -XX:MaxGCPauseMillis=500 -XX:+ParallelRefProcEnabled -XX:ParallelGCThreads=12"
exec java -server $JAVA_OPTS -jar app.jar