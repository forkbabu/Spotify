package defpackage;

import android.util.Log;

/* renamed from: bh  reason: default package */
public final class bh {
    public static void a(String str, String str2, Object obj) {
        d(str);
        String.format(str2, obj);
    }

    public static void b(String str, String str2, Object... objArr) {
        d(str);
        String.format(str2, objArr);
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(d(str), str2, th);
    }

    private static String d(String str) {
        return je.x0("TransportRuntime.", str);
    }

    public static void e(String str, String str2) {
        d(str);
    }

    public static void f(String str, String str2, Object obj) {
        d(str);
        String.format(str2, obj);
    }
}
