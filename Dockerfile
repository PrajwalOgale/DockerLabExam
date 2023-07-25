FROM openjdk:latest

WORKDIR /app

COPY . /app

RUN javac /app/DockerExam/src/com/exam/Exam.java

CMD [ "java","/app/DockerExam/bin/com/exam/Exam" ]
