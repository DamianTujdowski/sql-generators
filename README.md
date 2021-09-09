<h1 align="center">Query generator</h1>
<h3 align="center">CLI application that generates SQL INSERT queries</h3>

Purpose of this CLI is to generate queries which fill my Baby diet app's MySQL database with partly random data.

<h3 align="left">Features:</h3>

1. Generating INSERT queries based on given arguments
2. Prompting next Id

<h3 align="left">Ho to run:</h3>

1. Download .jar file from Releases tab
2. Open command prompt
3. Navigate to folder where Generator.jar is saved
4. Type "java -jar Generator.jar" followed by a list of arguments

<h3 align="left">App arguments:</h3>

1. Table name
2. Path pointing where to save the file
3. Number indicating starting Id
4. Number of queries
5. Parent Id

<h3 align="left">Sample command prompt commands:</h3>

1. java -jar Generator.jar e C:\Intel\time.sql 50 10 1
2. java -jar Generator.jar m C:\Intel\meal.sql 1 50 2

Path "C:\Intel\meal.sql" could not be present at your computer.
Then you should replace "Intel" with proper directory name.

<h3 align="left">Tech stack:</h3>
<img src ="https://img.shields.io/badge/Core Java--green" width="120" height="30"/>
