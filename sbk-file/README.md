# Build File System Benchmarking using sbk-api package 

To build the File system benchmarking using sbk-file storage interface with following options 

## maven Package

To clean build
```
cd ./sbk-file

./gradlew clean

```

To build

```
cd ./sbk-file

./gradlew -installDist
```

# Examples
```
./build/install/sbk-file/bin/sbk-file -class file ./test.txt -readers 1 -size 10 -time ns -seconds 30
```

