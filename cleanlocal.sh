#@echo off
#echo.
#echo [信息] 清理 Maven 本地仓库中下载失败的包。
#echo.
#pause
#echo.
#
#set REPOSITORY_PATH=/Users/miwang/javaWeb/mvn/repository/
#rem 正在搜索...
#for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
#    del /s /q %%i
#)
#rem 搜索完毕
#
#pause