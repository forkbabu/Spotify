package com.comscore.util.setup;

import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.util.log.AndroidLogger;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.LogHelper;

public class CustomPlatformSetup extends PlatformSetup {
    private static final String a = "6.2.0.200128";

    @Override // com.comscore.util.setup.PlatformSetup
    public JniComScoreHelper createApplicationInfoHelper() {
        return new AndroidJniHelper();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public LogHelper createLogger() {
        return new AndroidLogger();
    }

    @Override // com.comscore.util.setup.PlatformSetup
    public String getJavaCodeVersion() {
        return a;
    }
}
