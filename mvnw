#!/usr/bin/env sh

set -e

MAVEN_OPTS="-Xmx1024m -XX:MaxPermSize=256m"

if [ ! -f ".mvn/wrapper/maven-wrapper.jar" ]; then
  echo "Downloading Maven Wrapper..."
  mvn -N io.takari:maven:wrapper
fi

exec .mvn/wrapper/maven-wrapper.jar "$@"