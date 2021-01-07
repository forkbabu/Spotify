package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.h;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.p1;
import com.google.android.gms.cast.z;
import com.google.android.gms.common.api.Status;

public final class q8 implements p8 {
    private static final b h = new b("CastApiAdapter");
    public static final /* synthetic */ int i = 0;
    private final y8 a;
    private final Context b;
    private final CastDevice c;
    private final com.google.android.gms.cast.framework.b d;
    private final e.c e;
    private final g8 f;
    private p1 g;

    public q8(y8 y8Var, Context context, CastDevice castDevice, com.google.android.gms.cast.framework.b bVar, e.c cVar, g8 g8Var) {
        this.a = y8Var;
        this.b = context;
        this.c = castDevice;
        this.d = bVar;
        this.e = cVar;
        this.f = g8Var;
    }

    public final void a() {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).d0();
            this.g = null;
        }
        boolean z = true;
        h.a("Acquiring a connection to Google Play Services for %s", this.c);
        d dVar = new d(this, null);
        Context context = this.b;
        Bundle bundle = new Bundle();
        com.google.android.gms.cast.framework.b bVar = this.d;
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (bVar == null || bVar.I1() == null || this.d.I1().q2() == null) ? false : true);
        com.google.android.gms.cast.framework.b bVar2 = this.d;
        if (bVar2 == null || bVar2.I1() == null || !this.d.I1().r2()) {
            z = false;
        }
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        e.b.a aVar = new e.b.a(this.c, this.e);
        aVar.b(bundle);
        p1 a2 = e.a(context, aVar.a());
        ((z) a2).M(dVar);
        this.g = a2;
        ((z) a2).W();
    }

    public final void b() {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).d0();
            this.g = null;
        }
    }

    public final boolean c() {
        p1 p1Var = this.g;
        return p1Var != null && ((z) p1Var).v();
    }

    public final void d(String str) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).X(str);
        }
    }

    public final com.google.android.gms.common.api.e<Status> e(String str, String str2) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            return s.a(((z) p1Var).D(str, str2), t8.a, s8.a);
        }
        return null;
    }

    public final void f(String str, e.d dVar) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).B(str, dVar);
        }
    }

    public final void g(boolean z) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).E(z);
        }
    }

    public final com.google.android.gms.common.api.e<e.a> i(String str, h hVar) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            return s.a(((z) p1Var).C(str, hVar), x8.a, w8.a);
        }
        return null;
    }

    public final com.google.android.gms.common.api.e<e.a> j(String str, String str2) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            return s.a(((z) p1Var).Y(str, str2), v8.a, u8.a);
        }
        return null;
    }

    public final void k(String str) {
        p1 p1Var = this.g;
        if (p1Var != null) {
            ((z) p1Var).A(str);
        }
    }
}
