package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

public final class c {
    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        if (context != null) {
            return false;
        }
        try {
            throw new NullPointerException("null reference");
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
