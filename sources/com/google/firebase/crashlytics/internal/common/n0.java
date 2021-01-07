package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.installations.g;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class n0 implements o0 {
    private static final Pattern f = Pattern.compile("[^\\p{Alnum}]");
    private static final String g = Pattern.quote("/");
    private final p0 a;
    private final Context b;
    private final String c;
    private final g d;
    private String e;

    public n0(Context context, String str, g gVar) {
        if (str != null) {
            this.b = context;
            this.c = str;
            this.d = gVar;
            this.a = new p0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    private synchronized String a(String str, SharedPreferences sharedPreferences) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            str2 = null;
        } else {
            str2 = f.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        ty f2 = ty.f();
        f2.b("Created new Crashlytics IID: " + str2);
        sharedPreferences.edit().putString("crashlytics.installation.id", str2).putString("firebase.installation.id", str).apply();
        return str2;
    }

    private synchronized void h(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        ty f2 = ty.f();
        f2.b("Migrating legacy Crashlytics IID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
        sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
    }

    private String i(String str) {
        return str.replaceAll(g, "");
    }

    public String b() {
        return this.c;
    }

    public synchronized String c() {
        String str;
        String str2 = this.e;
        if (str2 != null) {
            return str2;
        }
        SharedPreferences o = CommonUtils.o(this.b);
        com.google.android.gms.tasks.g<String> id = this.d.getId();
        String string = o.getString("firebase.installation.id", null);
        try {
            str = (String) z0.a(id);
        } catch (Exception e2) {
            ty.f().c("Failed to retrieve installation id", e2);
            str = string != 0 ? string : null;
        }
        if (string == null) {
            SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.crashlytics.prefs", 0);
            String string2 = sharedPreferences.getString("crashlytics.installation.id", null);
            ty f2 = ty.f();
            f2.b("No cached FID; legacy id is " + string2);
            if (string2 == null) {
                this.e = a(str, o);
            } else {
                this.e = string2;
                h(string2, str, o, sharedPreferences);
            }
            return this.e;
        }
        if (string.equals(str)) {
            this.e = o.getString("crashlytics.installation.id", null);
            ty f3 = ty.f();
            f3.b("Found matching FID, using Crashlytics IID: " + this.e);
            if (this.e == null) {
                this.e = a(str, o);
            }
        } else {
            this.e = a(str, o);
        }
        return this.e;
    }

    public String d() {
        return this.a.a(this.b);
    }

    public String e() {
        return String.format(Locale.US, "%s/%s", i(Build.MANUFACTURER), i(Build.MODEL));
    }

    public String f() {
        return i(Build.VERSION.INCREMENTAL);
    }

    public String g() {
        return i(Build.VERSION.RELEASE);
    }
}
