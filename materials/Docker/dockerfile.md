# Dockerfile
Dockerfile располагается в корне проекта, без расширения
Обязательное название - Dockerfile

#   Описание Dockerfile

Имя image который используется в проекте 

    FROM имя_образа : версия
    FROM openjdk:17 - Образ java17
    FROM openjdk:latest - Образ Java последняя версия
    FROM openjdk - Образ Java последняя версия
файлы которые нужно добавить в образ

    COPY файлы_проекта дирректория_в_образе
    COPY . /java - скопировать в образ все файлы из текущей дирректории
    COPY Main.java - скопировать в обрас файл Main.java
    COPY /java/ - скопировать в образ файлы из папки java

    WORKDIR
    CMD
    RUN

---------------
# Команды 
    
    docker build -t name_image .

    docker run -d name_image 

    