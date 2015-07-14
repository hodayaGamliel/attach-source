#!/bin/sh

i="0"

while [ $i -le 1000 ]
do
java -agentlib:TakipiAgent -Dtakipi.name=test12 TestSource12
echo $i
i=$[$i+1]
done
