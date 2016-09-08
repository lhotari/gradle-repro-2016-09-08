#!/bin/bash
cd "$( dirname "${BASH_SOURCE[0]}" )"
echo "Gradle version:"
gradle --version
set -x
cd basic-composite/composite
gradle -S helloAll