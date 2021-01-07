package com.comscore.android.util.log;

import android.util.Log;
import com.comscore.util.log.LogHelper;

public class AndroidLogger implements LogHelper {
    public static final String TAG = "COMSCORE";

    @Override // com.comscore.util.log.LogHelper
    public void d(String str) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void d(String str, String str2) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str) {
        Log.e(TAG, str);
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // com.comscore.util.log.LogHelper
    public void e(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    @Override // com.comscore.util.log.LogHelper
    public void i(String str) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void i(String str, String str2) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void w(String str) {
    }

    @Override // com.comscore.util.log.LogHelper
    public void w(String str, String str2) {
    }
}
