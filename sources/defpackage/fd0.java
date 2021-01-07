package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: fd0  reason: default package */
public final class fd0 {
    private final SharedPreferences a;

    public fd0(Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean a(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }
}
