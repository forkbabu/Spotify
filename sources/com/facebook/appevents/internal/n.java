package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.k;

/* access modifiers changed from: package-private */
public class n {
    private String a;
    private boolean b;

    private n(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static n a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k.d());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new n(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    public void b() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(k.d()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.b);
        edit.apply();
    }

    public String toString() {
        String str = this.b ? "Applink" : "Unclassified";
        return this.a != null ? je.I0(je.Z0(str, "("), this.a, ")") : str;
    }
}
