# About Gradle

Build lifecycle phases: 
- initialization
- configuration
- execution

## Gradle commands
* own tasks
`gradle tasks --all` - see full list of tasks
`gradle hello --dry-run` - check the tasks without executing
`gradle createArchive --console=verbose` - to see the outcomes of tasks

* java plugin
`gradle clean`
`gradle compileJava`
`gradle processResources`
`gradle classes`
`gradle jar`
`gradle run --args="add 10 90"`
`gradle installDist`
`gradle distZip` create zip-archive
`gradle distTar` create tar-archive
`gradle javadoc`

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
