# push the image to data region
adb root
adb remount
adb shell setenforce 0
adb shell mkdir -p /data/medias/jpg
adb push Codec-JPGCodec/src/main/assets/jpg_4_2_32bit.jpg /data/medias/jpg/
