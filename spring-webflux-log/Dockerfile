FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /app
RUN groupadd -r javausersgroup && useradd --system --shell /bin/false javauser && usermod -G javausersgroup javauser
WORKDIR /app
COPY build/libs/spring-*SNAPSHOT.jar app.jar
RUN chown -R javauser:javausersgroup /app
USER javauser
ENV JAVA_TOOL_OPTIONS=""
ENV JAVA_OPTS="-Xmx6g -Xms6g -XX:+UseStringDeduplication -XX:GCTimeRatio=19 -XX:MaxGCPauseMillis=500 -XX:+ParallelRefProcEnabled -XX:ParallelGCThreads=12"
ENTRYPOINT ["/bin/bash", "-c", "java -server $JAVA_OPTS -jar app.jar"]
