[![Build Status](https://travis-ci.org/pivotal-chicago/java-library-gradle-travis-coveralls-bintray.svg?branch=master)](https://travis-ci.org/pivotal-chicago/java-library-gradle-travis-coveralls-bintray)

[![Coverage Status](https://coveralls.io/repos/pivotal-chicago/java-library-gradle-travis-coveralls-bintray/badge.svg?branch=master&service=github)](https://coveralls.io/github/pivotal-chicago/java-library-gradle-travis-coveralls-bintray?branch=master)

[![Download](https://api.bintray.com/packages/jared-carroll/maven/foo/images/download.svg)](https://bintray.com/jared-carroll/maven/foo/_latestVersion)

# Java library Gradle Travis Coveralls Bintray

Example Java library using Gradle as the build tool, [Travis CI](https://travis-ci.org/) for CI, [Coveralls](https://coveralls.io/) for test coverage, [Bintray](https://bintray.com/) for distribution.

Four JAR files are built and deployed:

1. Class files
2. Source code
3. Javadoc
4. Test source

CI/CD pipeline:

1. Push code to GitHub
2. GitHub notifies Travis CI
3. Travis CI
  1. run tests
  2. publish test coverage to Coveralls
  3. upload build artifacts to Bintray
