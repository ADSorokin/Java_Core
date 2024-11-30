FROM openjdk:8-jdk-alpine //Используется образ openjdk:8-jdk-alpine, который включает компилятор Java.

COPY /src /app/src //Копируются все необходимые файлы из директории src в директорию app/src

RUN mkdir -p /app/out /app/doc //Создаем необходимые директории в контейнере

RUN javac -sourcepath /src/Main.java -d /app/out app/src/Main.java -encoding utf-8 && javadoc -d /app/doc app/src/Main.java -encoding utf-8 -subpackages src компилируем и документируем

WORKDIR /app //назначаем рабочую директорию

VOLUME /app/out //Объявляются тома для /app/out, /app/src и /app/doc как каталоги для дальнейшей работы с ними

VOLUME /app/src

VOLUME /app/doc

RUN echo "Directory app was successfully created."

CMD ["sh", "-c", "java -classpath /app/out src.Main"] //запускаем наш скомпилированный класс

//создаем локальный контейнер и запускаем

docker build -t java-core-dz1 .

docker run java-core-dz1

//работает

//пушим на докерхаб

docker login

docker build -t alexsksd/java-core-dz1 .

docker push alexsksd/java-core-dz1:latest

https://hub.docker.com/repository/docker/alexsksd/java-core-dz1
