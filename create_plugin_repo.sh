#!/bin/bash
cd "$( dirname "${BASH_SOURCE[0]}" )"
for i in customPlugin/plugin customPlugin/plugin2 initPlugin/plugin; do
    (
    cd $i
    echo $PWD
    gradle uploadArchives
    for version in 1.0 1.1 1.2; do
        gradle -PversionAsParameter=$version uploadArchives
    done
    )
done
