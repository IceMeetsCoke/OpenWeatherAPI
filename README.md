# OpenWeatherAPI

This Java program is designed for providing weather forecast within 5-days period in Sydney. More specifically, It present to users the number of days that has temperature over 20 degrees Celsuis within the time period, as well as the number of sunny days.

This tiny service is built on top of the OpenWeather API, which is a free API service specialized in providing real-time weather information, please check their website for more information - [OpenWeather API website](https://openweathermap.org/api)

## Getting Started

### Dependencies

* Operation System: Windows 8/Windows 10
* Download and install the latest (or recent) version of Git - [Git download link](https://git-scm.com/downloads) & [How to install Git](https://phoenixnap.com/kb/how-to-install-git-windows)
* Download and install the latest (or recent) version of Maven - [Maven download link](https://maven.apache.org/download.cgi) and add set system variables - [How to set Maven path](https://www.baeldung.com/install-maven-on-windows-linux-mac)
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
* After executing the jar file, the weather report will be presented in the CLI in the form of text looks like below (the numbers are dynamic according to the API response)
```
Weather Forecast for the next five days:
Number of days over 20 degrees Celsius: 2
Number of sunny days: 0
```