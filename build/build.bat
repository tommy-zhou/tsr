@echo off
rem ������������Ϣ�Ƿ���ȷ
set "CURRENT_DIR=%~dp0"
%~d0
cd %CURRENT_DIR%
cd ..
set "PROJECT_DIR=%cd%"
set "LOGFILE=%PROJECT_DIR%\build\build.log"
echo PROJECT Paht:%PROJECT_DIR% > %LOGFILE%
if exist "%PROJECT_DIR%\pom.xml" goto build
if not exist "%PROJECT_DIR%\pom.xml" echo %PROJECT_DIR%\pom.xml is not exist! >> %LOGFILE%
goto end

rem ���
:build
echo --------build for all project-------- >> %LOGFILE%
mvn clean install -X >> %LOGFILE%

rem �������
:end