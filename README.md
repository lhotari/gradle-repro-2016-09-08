# gradle-repro-2016-09-08

This is an attempt to reproduce [GRADLE-3553](https://issues.gradle.org/browse/GRADLE-3553)


### Attempt #1

Adding an extra set of jars to the classpath of one of the composite projects.

Setup environment
```
./create_plugin_repo.sh
```

Run test
```
./run_test.sh
```
 