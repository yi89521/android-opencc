#include <jni.h>
#include "opencc/Converter.hpp"


extern "C"
jstring
Java_com_zqc_opencc_android_lib_ChineseConverter_convert(JNIEnv *env, jobject instance,
                                                         jstring text_, jstring type_) {
    const char *text = env->GetStringUTFChars(text_, 0);
    const char *type = env->GetStringUTFChars(type_, 0);

    const opencc::ConverterPtr converter;
    std::string string1 = converter->Convert(text);

    return  env->NewStringUTF(string1.c_str());
}