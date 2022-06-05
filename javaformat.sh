#!/bin/bash
echo "[信息] Spring 代码美化"
basepath=$(cd "$(dirname "$0")";pwd)
cd ${basepath}
cd ..
echo `pwd`
for file in $(ls | grep 'miwang*')
do
    cd ${file}
    echo "路径"`pwd`
    mvn spring-javaformat:apply
    cd ..
done
