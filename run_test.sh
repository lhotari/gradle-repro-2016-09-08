#!/bin/bash
cd "$( dirname "${BASH_SOURCE[0]}" )"
export ENTERPRISE_REPOSITORY_URL="file:$PWD/customPlugin/repo"
export INITPLUGIN_REPOSITORY_URL="file:$PWD/initPlugin/repo"
export GRADLE_USER_HOME="$PWD/gradle-user-home"
echo "Gradle version:"
gradle --version
set -x
cd basic-composite/composite
gradle -g $GRADLE_USER_HOME -S helloAll