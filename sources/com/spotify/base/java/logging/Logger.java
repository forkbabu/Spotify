package com.spotify.base.java.logging;

import java.util.Collections;
import java.util.List;

public final class Logger {
    private static List<c> a = Collections.emptyList();
    private static d b = new g();
    private static e c = new h();

    private Logger() {
    }

    public static void a(d dVar, e eVar, List<c> list) {
        a = Collections.unmodifiableList(list);
        b = dVar;
        c = eVar;
    }

    public static void b(String str, Object... objArr) {
        for (c cVar : a) {
            i(cVar.d(), str, objArr);
        }
    }

    public static void c(Throwable th, String str, Object... objArr) {
        for (c cVar : a) {
            j(cVar.d(), th, str, objArr);
        }
    }

    public static void core(String str) {
        for (c cVar : a) {
            f a2 = cVar.a();
            a2.a(Thread.currentThread().getName() + "@core", f(str, new Object[0]));
        }
    }

    public static void d(String str, Object... objArr) {
        for (c cVar : a) {
            i(cVar.error(), str, objArr);
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        for (c cVar : a) {
            j(cVar.error(), th, str, objArr);
        }
    }

    public static String f(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : b.a(str, objArr);
    }

    public static void g(String str, Object... objArr) {
        for (c cVar : a) {
            i(cVar.a(), str, objArr);
        }
    }

    public static void h(Throwable th, String str, Object... objArr) {
        for (c cVar : a) {
            j(cVar.a(), th, str, objArr);
        }
    }

    private static void i(f fVar, String str, Object... objArr) {
        fVar.a(c.v(), f(str, objArr));
    }

    private static void j(f fVar, Throwable th, String str, Object... objArr) {
        fVar.b(c.v(), f(str, objArr), th);
    }

    public static int k(String str) {
        return String.valueOf(str).length();
    }

    public static void l(String str, Object... objArr) {
        for (c cVar : a) {
            i(cVar.b(), str, objArr);
        }
    }

    public static void m(Throwable th, String str, Object... objArr) {
        for (c cVar : a) {
            j(cVar.b(), th, str, objArr);
        }
    }

    public static void n(String str, Object... objArr) {
        for (c cVar : a) {
            i(cVar.c(), str, objArr);
        }
    }

    public static void o(Throwable th, String str, Object... objArr) {
        for (c cVar : a) {
            j(cVar.c(), th, str, objArr);
        }
    }
}
