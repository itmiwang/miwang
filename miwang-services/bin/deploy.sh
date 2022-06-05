#!/bin/bash
echo "[信息] 部署项目到仓库"
echo "[注意] 如果发生异常，运行多几次即可"
basepath=$(cd "$(dirname "$0")";pwd)
#cd /Users/miwang/javaWeb/mvn/repository/com/miwang
#rm -rf *
cd ${basepath}
cd ..
echo `pwd`
for file in $(ls | grep 'miwang*')
do
    cd ${file}
    echo "路径"`pwd`
    mvn deploy
    cd ..
done