#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_edu_tbui1trinity_gymschedule_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
