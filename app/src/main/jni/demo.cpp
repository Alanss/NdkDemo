#include <stdio.h>
#include <jni.h>
#include "net_gzjunbo_ndkdemo_MainActivity.h"
extern "C" {
  JNIEXPORT jstring JNICALL Java_net_gzjunbo_ndkdemo_MainActivity_callNDK
    (JNIEnv * env, jobject obj){
    return env->NewStringUTF("老子正在学习NDK，你不服啊，来打老子撒！");
  }
}




