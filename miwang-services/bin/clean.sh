#!/bin/bash
echo "[信息] 清理生成路径。"
basepath=$(cd "$(dirname "$0")";pwd)
cd ${basepath}
cd ..
echo `pwd`
for file in $(ls | grep 'miwang*')
do
    cd ${file}
    echo "路径"`pwd`
    mvn clean
    cd ..
done