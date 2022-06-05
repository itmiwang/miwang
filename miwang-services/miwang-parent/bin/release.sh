cd ..
mvn release:clean release:prepare -DignoreSnapshots=true release:perform
mvn deploy