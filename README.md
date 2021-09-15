<h1 align="center">Query generator</h1>
<h3 align="center">CLI application that generates SQL INSERT queries</h3>

Purpose of this CLI is to generate .sql file with queries which fill my Baby diet app's MySQL database with partly random data.

<h3 align="left">Features:</h3>

1. Generating INSERT queries based on given arguments
2. Prompting next Id

<h3 align="left">Ho to run:</h3>

1. Install Java Runtime Environment (omit if JRE is installed)
1. Download .jar file from Releases tab
2. Open command prompt
3. Navigate to folder where Generator.jar was downloaded
4. Type "java -jar Generator.jar" followed by a list of arguments

<h3 align="left">App arguments:</h3>

1. Table name
2. Path pointing where to save the generated file
3. Number indicating starting Id
4. Number of queries
5. Parent Id

<h3 align="left">Sample command prompt commands:</h3>

1. java -jar Generator.jar e C:\Intel\time.sql 50 10 1
2. java -jar Generator.jar m C:\Intel\meal.sql 1 50 2

Path "C:\Intel\meal.sql" could not be present at your computer.
Then you should replace "Intel" with proper directory name.

<h3 align="left">Tech stack:</h3>
<img src ="https://img.shields.io/badge/Java--green" width="65" height="30"/>

<h3 align="left">Design patterns:</h3>
<img src ="https://img.shields.io/badge/Strategy--green" width="90" height="30"/>
