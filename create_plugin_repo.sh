#!/bin/bash
cd customPlugin
for i in plugin plugin2; do
    (
    cd $i
    gradle uploadArchives
    for version in 1.0 1.1 1.2; do
        gradle -PversionAsParameter=$version uploadArchives
    done
    )
done
