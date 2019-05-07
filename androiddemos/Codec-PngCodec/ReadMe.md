# push the image to data region
adb root
adb remount
adb shell setenforce 0
adb shell mkdir -p /data/medias/png
adb push Codec-PngCodec/src/main/assets/png_4_2_32bit.png /data/medias/png/
