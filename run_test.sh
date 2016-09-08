#!/bin/bash
cd "$( dirname "${BASH_SOURCE[0]}" )"
export ENTERPRISE_REPOSITORY_URL="file:$PWD/customPlugin/repo"
export INITPLUGIN_REPOSITORY_URL="file:$PWD/initPlugin/repo"
echo "Gradle version:"
gradle --version
set -x
cd basic-composite/composite
gradle -I init.gradle -S helloAll