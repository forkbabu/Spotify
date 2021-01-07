package com.google.firebase.crashlytics.ndk;

import android.content.res.AssetManager;

class JniNativeApi implements d {
    private static final boolean a;

    static {
        boolean z;
        try {
            System.loadLibrary("crashlytics");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            ty f = ty.f();
            StringBuilder V0 = je.V0("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n");
            V0.append(e.getLocalizedMessage());
            f.d(V0.toString());
            z = false;
        }
        a = z;
    }

    JniNativeApi() {
    }

    private native boolean nativeInit(String str, Object obj);

    public boolean a(String str, AssetManager assetManager) {
        return a && nativeInit(str, assetManager);
    }
}
