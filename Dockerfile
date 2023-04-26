FROM alpine
RUN apk add openjdk11
ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin

WORKDIR /usr/share/jady1

ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs

ADD testng.xml testng.xml

ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* org.testng.TestNG testng.xml