FILES= Pong.kt GameField.kt Bool.kt Player.kt Rocket.kt
KC= kotlinc
FLAGS= -include-runtime -d
JAR= pong.jar

all:
	${KC} ${FILES} ${FLAGS} ${JAR}
run:
	java -jar ${JAR}
clean:
	rm -rf ${JAR}