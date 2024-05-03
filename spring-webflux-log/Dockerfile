FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY run.sh .
COPY build/libs/spring*SNAPSHOT.jar app.jar
ENV JAVA_OPTS="-Xmx6g -Xms6g -XX:+UseStringDeduplication -XX:GCTimeRatio=19 -XX:MaxGCPauseMillis=500 -XX:+ParallelRefProcEnabled -XX:ParallelGCThreads=12"
ENTRYPOINT ["/bin/bash", "-c", "java -server $JAVA_OPTS -jar app.jar"]
ENTRYPOINT ["run.sh"]