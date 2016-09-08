#!/bin/bash
cd customPlugin
for i in plugin plugin2; do
    (
    cd $i
    gradle uploadArchives
    )
done
