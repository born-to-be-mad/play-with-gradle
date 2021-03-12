# About Gradle

Build lifecycle phases: 
- initialization
- configuration
- execution

`gradle tasks --all` - see full list of tasks
`gradle hello --dry-run` - check the tasks without executing
`gradle createArchive --console=verbose` - to see the outcomes of tasks

# Useful links
* Gradle Guides: https://gradle.org/guides/
* Gradle Javadoc: https://docs.gradle.org/current/dsl/
* The Gradle Java Plugin: https://docs.gradle.org/current/userguide/java_plugin.html

#Run project
* via command line
```
javac -cp . /src/main/java/by/dma/calculator/Main.java -d out
jar cfv calculator.jar -C out
java -cp calculator.jar by.dma.calculator.Main add 10 90
```
