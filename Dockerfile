FROM openjdk:jre-alpine

COPY axon /
WORKDIR /

EXPOSE 8081
CMD ["bin/AxonIvyEngine"]

