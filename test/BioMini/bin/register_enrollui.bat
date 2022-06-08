:CheckOS
IF EXIST "%PROGRAMFILES(X86)%" (GOTO 64BIT) ELSE (GOTO 32BIT)

:64BIT
echo 64-bit...
regsvr32 "%~dp0\x64\IEnrollUI.dll"
GOTO END

:32BIT
echo 32-bit...
regsvr32 "%~dp0\IEnrollUI.dll"
GOTO END

:END