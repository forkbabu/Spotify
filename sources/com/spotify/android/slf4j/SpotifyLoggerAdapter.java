package com.spotify.android.slf4j;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.slf4j.helpers.MarkerIgnoringBase;

public final class SpotifyLoggerAdapter extends MarkerIgnoringBase {
    private static final Pattern a = Pattern.compile("\\{\\}");
    private static final long serialVersionUID = 708742732011405806L;

    SpotifyLoggerAdapter() {
        this.name = "spotify";
    }

    private static String x(String str) {
        return a.matcher(str).replaceAll("%s");
    }

    @Override // defpackage.xpf
    public boolean a() {
        return true;
    }

    @Override // defpackage.xpf
    public void b(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.c((Throwable) obj2, x(str), obj);
        } else {
            Logger.b(x(str), obj, obj2);
        }
    }

    @Override // defpackage.xpf
    public boolean c() {
        return true;
    }

    @Override // defpackage.xpf
    public void d(String str) {
        Logger.d(str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void debug(String str, Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.c((Throwable) objArr[objArr.length - 1], x(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.b(x(str), objArr);
        }
    }

    @Override // defpackage.xpf
    public void e(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.m((Throwable) obj2, x(str), obj);
        } else {
            Logger.l(x(str), obj, obj2);
        }
    }

    @Override // defpackage.xpf
    public void error(String str, Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.e((Throwable) objArr[objArr.length - 1], x(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.d(x(str), objArr);
        }
    }

    @Override // defpackage.xpf
    public boolean f() {
        return true;
    }

    @Override // defpackage.xpf
    public void g(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.o((Throwable) obj2, x(str), obj);
        } else {
            Logger.n(x(str), obj, obj2);
        }
    }

    @Override // defpackage.xpf
    public boolean h() {
        return true;
    }

    @Override // defpackage.xpf
    public void i(String str, Throwable th) {
        Logger.h(th, str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void j(String str, Throwable th) {
        Logger.o(th, str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void k(String str, Throwable th) {
        Logger.m(th, str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void l(String str, Object obj) {
        Logger.n(x(str), obj);
    }

    @Override // defpackage.xpf
    public void m(String str, Object obj) {
        Logger.l(x(str), obj);
    }

    @Override // defpackage.xpf
    public void n(String str, Throwable th) {
        Logger.e(th, str, new Object[0]);
    }

    @Override // defpackage.xpf
    public boolean o() {
        return true;
    }

    @Override // defpackage.xpf
    public void p(String str) {
        Logger.b(str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void q(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            Logger.e((Throwable) obj2, x(str), obj);
        } else {
            Logger.d(x(str), obj, obj2);
        }
    }

    @Override // defpackage.xpf
    public void r(String str, Object obj) {
        Logger.b(x(str), obj);
    }

    @Override // defpackage.xpf
    public void s(String str, Object obj) {
        Logger.d(x(str), obj);
    }

    @Override // defpackage.xpf
    public void t(String str, Throwable th) {
        Logger.c(th, str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void u(String str) {
        Logger.g(str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void v(String str) {
        Logger.n(str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void w(String str) {
        Logger.l(str, new Object[0]);
    }

    @Override // defpackage.xpf
    public void warn(String str, Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.o((Throwable) objArr[objArr.length - 1], x(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.n(x(str), objArr);
        }
    }
}
