# spock-2-silent-heap-error-skips-tests

This repo shows strange behavior exhibited by Spock 2 when running out of heap space.

In Spock 2.0, no exception is thrown, the offending feature shows as skipped, and no subsequent features are run at all.

With Spock 1.3, you get the heap error, the offending feature is failed, and subsequent features are still run.

To run with Spock 2, execute

```
gradlew :spock-2.0:test
```

To run with Spock 1.3, execute

```
gradlew :spock-1.3:test
```
