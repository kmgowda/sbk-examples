# Build File System Benchmarking using sbk-yal package 

To build the File system benchmarking using sbk-file storage interface with following options 

## Git Hub Package

To build
```
cd ./sbk-yal-file

./gradlew -b gitpackage-build.gradle installDist

```

To clean the build

```
cd ./sbk-yal-file

./gradlew -b gitpackage-build.gradle clean
```


## Maven Build

To build
```
cd ./sbk-yal-file

./gradlew -b  mavencentral-build.gradle installDist

```

To clean the build

```
cd ./sbk-yal-file

./gradlew -b  mavencentral-build.gradle clean
```

## Jit Pack Build

To build
```
cd ./sbk-yal-file

./gradlew -b jitpack-build.gradle installDist

```

To clean the build

```
cd ./sbk-yal-file

./gradlew -b jitpack-build.gradle clean
```