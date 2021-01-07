package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.i;
import com.google.android.gms.cast.internal.b;

public final class z1 {
    private static final b g = new b("ApplicationAnalytics");
    private final p0 a;
    private final x4 b;
    private final Runnable c = new q1(this);
    private final Handler d = new o0(Looper.getMainLooper());
    private final SharedPreferences e;
    private p5 f;

    public z1(SharedPreferences sharedPreferences, p0 p0Var, Bundle bundle, String str) {
        this.e = sharedPreferences;
        this.a = p0Var;
        this.b = new x4(bundle, str);
    }

    private static String a() {
        com.google.android.gms.cast.framework.b b2 = a.d().b();
        if (b2 == null) {
            return null;
        }
        return b2.o2();
    }

    static void d(z1 z1Var, SharedPreferences sharedPreferences, String str) {
        if (z1Var.s(str)) {
            g.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            return;
        }
        z1Var.f = p5.a(sharedPreferences);
        if (z1Var.s(str)) {
            g.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            p5.g = z1Var.f.c + 1;
            return;
        }
        g.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        p5 c2 = p5.c();
        z1Var.f = c2;
        c2.a = a();
        z1Var.f.e = str;
    }

    static void f(z1 z1Var, c cVar, int i) {
        z1Var.q(cVar);
        z1Var.a.b(z1Var.b.g(z1Var.f, i), zzia.APP_SESSION_END);
        z1Var.d.removeCallbacks(z1Var.c);
        z1Var.f = null;
    }

    private final boolean g() {
        String str;
        if (this.f == null) {
            g.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String a2 = a();
        if (a2 != null && (str = this.f.a) != null && TextUtils.equals(str, a2)) {
            return true;
        }
        g.a("The analytics session doesn't match the application ID %s", a2);
        return false;
    }

    static void m(z1 z1Var) {
        z1Var.f.b(z1Var.e);
    }

    static void n(z1 z1Var) {
        z1Var.d.postDelayed(z1Var.c, 300000);
    }

    /* access modifiers changed from: private */
    public final void p(c cVar) {
        g.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        p5 c2 = p5.c();
        this.f = c2;
        c2.a = a();
        if (cVar != null && cVar.o() != null) {
            this.f.b = cVar.o().t2();
        }
    }

    /* access modifiers changed from: private */
    public final void q(c cVar) {
        if (g()) {
            CastDevice o = cVar != null ? cVar.o() : null;
            if (o != null && !TextUtils.equals(this.f.b, o.t2())) {
                this.f.b = o.t2();
                return;
            }
            return;
        }
        g.f("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        p(cVar);
    }

    static void r(z1 z1Var) {
        z1Var.d.removeCallbacks(z1Var.c);
    }

    private final boolean s(String str) {
        String str2;
        if (!g()) {
            return false;
        }
        if (str != null && (str2 = this.f.e) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        g.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    public final void c(i iVar) {
        iVar.b(new i2(this, null), c.class);
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        p5 p5Var = this.f;
        if (p5Var != null) {
            this.a.b(this.b.a(p5Var), zzia.APP_SESSION_PING);
        }
        this.d.postDelayed(this.c, 300000);
    }
}
