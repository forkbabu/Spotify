package defpackage;

import android.util.Log;

/* renamed from: ty  reason: default package */
public class ty {
    static final ty a = new ty("FirebaseCrashlytics");

    public ty(String str) {
    }

    private boolean a(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public static ty f() {
        return a;
    }

    public void b(String str) {
        a(3);
    }

    public void c(String str, Throwable th) {
        a(3);
    }

    public void d(String str) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, null);
        }
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e("FirebaseCrashlytics", str, th);
        }
    }

    public void g(String str) {
        a(4);
    }

    public void h(String str) {
        a(5);
    }

    public void i(String str, Throwable th) {
        a(5);
    }
}
