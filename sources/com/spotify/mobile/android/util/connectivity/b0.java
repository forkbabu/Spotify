package com.spotify.mobile.android.util.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.provider.Settings;
import io.reactivex.s;

public class b0 {
    private final s<Boolean> a;

    public b0(Context context) {
        this.a = s.B(new f(context, new IntentFilter("android.intent.action.AIRPLANE_MODE")));
    }

    private static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } else if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public s<Boolean> b() {
        return this.a;
    }
}
