# fission-jvm-jersey

Library for writing functions based on the [Fission](https://github.com/fission/fission/) JVM Jersey environment.

## Import

The library can be imported using maven

```
<dependency>
  <groupId>io.fission</groupId>
  <artifactId>fission-jvm-jersey</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Interface

The library defines the interface which should be implemented by a class for it to work as a Fission function.

```java
Response call(ContainerRequestContext req, Context context);
```

## Release
This repository is configured with a GitHub Action which deploys the artifact to [OSSRH](https://oss.sonatype.org/).
There are some GitHub secrets configured listed below:
- OSSRH_USERNAME - The name for a [OSSRH](https://oss.sonatype.org/) user account.
- OSSRH_TOKEN - Password for the user account
- MAVEN_GPG_PRIVATE_KEY - The GPG key for signing files, must be distributed.
- MAVEN_GPG_PASSPHRASE - Passphrase for the specified GPG key.

## License
This repository is under the Apache 2.0 license.
