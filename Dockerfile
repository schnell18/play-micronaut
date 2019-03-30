FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/bravotest*.jar bravotest.jar
CMD java ${JAVA_OPTS} -jar bravotest.jar