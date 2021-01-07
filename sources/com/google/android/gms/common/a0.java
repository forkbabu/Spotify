package com.google.android.gms.common;

import android.util.Log;

/* access modifiers changed from: package-private */
public class a0 {
    private static final a0 d = new a0(true, null, null);
    final boolean a;
    private final String b;
    private final Throwable c;

    a0(boolean z, String str, Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    static a0 a() {
        return d;
    }

    static a0 b(String str) {
        return new a0(false, str, null);
    }

    static a0 c(String str, Throwable th) {
        return new a0(false, str, th);
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                d();
            } else {
                d();
            }
        }
    }
}
