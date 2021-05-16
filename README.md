# OpenWeatherAPI

This Java program is designed for providing weather forecast within 5-days period in Sydney. More specifically, It present to users the number of days that has temperature over 20 degrees Celsuis within the time period, as well as the number of sunny days.

## Getting Started

### Dependencies

* Operation System: Windows 8/Windows 10
* Download and install the latest (or recent) version of Git - [Git download link](https://git-scm.com/downloads)
* Download and install the latest (or recent) version of Maven - [Maven download link](https://maven.apache.org/download.cgi)
* Download and Install a Java 1.8 (or higher) JDK - [JDK download Link](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) and set system variables - [How to set JDK path](https://java.com/en/download/help/path.html)

### Installing & Executing program

* Open CLI, go to the directory where you want to put the repository & run below command:
```
git clone https://github.com/IceMeetsCoke/OpenWeatherAPI.git
```
* Under the project directory, change directory to OpenWeatherAPI/core using below first command, then run 2nd line command to generate executable jar file:
```
cd OpenWeatherAPI/core
mvn clean package assembly:single
```
* Under core directory, change directory to target using below first command, then run 2nd command to execute the java program
```
cd target
java -jar core-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```
* After executing the jar file, the weather report will be presented in the CLI in the form of text