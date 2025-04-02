@echo off
echo Adding Maven Wrapper to the project...
powershell -Command "& {Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar' -OutFile '.mvn/wrapper/maven-wrapper.jar'}"
powershell -Command "& {Invoke-WebRequest -Uri 'https://raw.githubusercontent.com/takari/maven-wrapper/master/mvnw.cmd' -OutFile 'mvnw.cmd'}"
powershell -Command "& {Invoke-WebRequest -Uri 'https://raw.githubusercontent.com/takari/maven-wrapper/master/mvnw' -OutFile 'mvnw'}"
echo Maven Wrapper added successfully!
pause 