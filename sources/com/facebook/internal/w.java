package com.facebook.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.k;

public class w {

    public interface a {
        void a(String str);
    }

    private w() {
    }

    static void a() {
        if (!uf.c(w.class)) {
            try {
                if (!uf.c(w.class)) {
                    try {
                        k.d().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                    } catch (Throwable th) {
                        uf.b(th, w.class);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, w.class);
            }
        }
    }

    public static void b(a aVar) {
        if (!uf.c(w.class)) {
            try {
                boolean z = false;
                if (!uf.c(w.class)) {
                    try {
                        z = k.d().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
                    } catch (Throwable th) {
                        uf.b(th, w.class);
                    }
                }
                if (!z && !uf.c(w.class)) {
                    try {
                        InstallReferrerClient build = InstallReferrerClient.newBuilder(k.d()).build();
                        try {
                            build.startConnection(new v(build, aVar));
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th2) {
                        uf.b(th2, w.class);
                    }
                }
            } catch (Throwable th3) {
                uf.b(th3, w.class);
            }
        }
    }
}
