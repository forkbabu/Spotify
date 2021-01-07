package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.util.g;
import java.util.Locale;

public class b {
    private final String a;
    private final boolean b;
    private String c;

    public b(String str) {
        g.h(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str.length() <= 23;
    }

    private final String g(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.c)) {
            return str;
        }
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final boolean i() {
        return this.b && Log.isLoggable(this.a, 3);
    }

    public void a(String str, Object... objArr) {
        if (i()) {
            g(str, objArr);
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        if (i()) {
            g(str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        Log.e(this.a, g(str, objArr));
    }

    public void d(Throwable th, String str, Object... objArr) {
        Log.e(this.a, g(str, objArr), th);
    }

    public void e(String str, Object... objArr) {
        g(str, objArr);
    }

    public void f(String str, Object... objArr) {
        g(str, objArr);
    }

    public final void h(String str) {
        this.c = TextUtils.isEmpty(str) ? null : String.format("[%s] ", str);
    }
}
