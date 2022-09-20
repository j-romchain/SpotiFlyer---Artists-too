set JAVA_HOME=".\jdks\windows\"
git fetch
git pull
.\gradlew :desktop:packageUberJarForCurrentOS
.\gradlew :desktop:packageMsi
.\gradlew :android:assembleRelease
echo "testing (unsigned) files are in  .\desktop\build\compose\jars\ ,.\desktop\build\compose\binaries\main\[subfolder], and .\android\build\outputs\apk\release\ "