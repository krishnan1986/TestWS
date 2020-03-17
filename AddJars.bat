%%mvn clean install

SET PATH=%PATH%;./target/dependencies

java -cp "%PATH%/*" fitnesseMain.FitNesseMain -p 9092 -d ./src/main/resources -e 0