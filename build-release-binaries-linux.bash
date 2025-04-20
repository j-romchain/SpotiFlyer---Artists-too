git fetch
git pull
./gradlew :desktop:packageUberJarForCurrentOS
./gradlew :desktop:packageDeb
echo "android might not work, it was originally only compiled on windows"
./gradlew :android:assembleRelease
echo "testing (unsigned) files are in  ./desktop/build/compose/jars/ ,./desktop/build/compose/binaries/main/[subfolder], and ./android/build/outputs/apk/release/ "name: Build Release Binaries