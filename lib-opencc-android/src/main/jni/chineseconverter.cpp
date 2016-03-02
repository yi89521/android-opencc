#include <jni.h>
#include <malloc.h>
#include <android/asset_manager.h>
#include <android/asset_manager_jni.h>
#include "opencc/Converter.hpp"
#include "opencc/Config.hpp"

opencc::ConverterPtr converter;
opencc::Config config;

extern "C"
jstring
Java_com_zqc_opencc_android_lib_ChineseConverter_convert(JNIEnv *env, jobject instance,
                                                         jstring text_, jstring type_, jobject assetManager) {
    const char *text = env->GetStringUTFChars(text_, 0);
    const char *type = env->GetStringUTFChars(type_, 0);

    string prefix("data/config/");
    string absPath = prefix + type;
    AAssetManager* mgr = AAssetManager_fromJava(env, assetManager);
    AAsset* asset = AAssetManager_open(mgr, absPath.c_str(), AASSET_MODE_UNKNOWN);
    if (NULL == asset) {
        return JNI_FALSE;
    }
    long size = AAsset_getLength(asset);
    char* buffer = (char*) malloc (sizeof(char)*size);
    AAsset_read (asset,buffer,size);
    AAsset_close(asset);

//    converter = config.NewFromFile(name);
//    std::string converted = converter->Convert(text);

    return  env->NewStringUTF(buffer);
}