FROM centos

COPY . /workspace

WORKDIR /workspace

RUN yum install -y maven

WORKDIR /workspace/build/libs

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "locationtracker-0.0.1-SNAPSHOT.jar" ]