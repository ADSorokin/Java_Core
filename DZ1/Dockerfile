FROM openjdk:8-jdk-alpine
COPY /src /app/src
RUN mkdir -p /app/out /app/doc
RUN javac -sourcepath /src/Main.java -d /app/out app/src/Main.java -encoding utf-8 && javadoc -d /app/doc app/src/Main.java -encoding utf-8 -subpackages src
WORKDIR /app
VOLUME /app/out
VOLUME /app/src
VOLUME /app/doc
RUN echo "Directory app was successfully created."
CMD ["sh", "-c", "java -classpath /app/out src.Main"]
