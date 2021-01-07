package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.j;

/* access modifiers changed from: package-private */
public final class i2 implements j<c> {
    private final /* synthetic */ z1 a;

    i2(z1 z1Var, s2 s2Var) {
        this.a = z1Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void f(c cVar, int i) {
        this.a.q(cVar);
        this.a.a.b(this.a.b.b(this.a.f, i), zzia.APP_SESSION_SUSPENDED);
        z1.m(this.a);
        z1.r(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void g(c cVar, String str) {
        z1 z1Var = this.a;
        z1.d(z1Var, z1Var.e, str);
        this.a.a.b(this.a.b.f(this.a.f), zzia.APP_SESSION_RESUMING);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void h(c cVar, int i) {
        z1.f(this.a, cVar, i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void i(c cVar, int i) {
        z1.f(this.a, cVar, i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void j(c cVar) {
        c cVar2 = cVar;
        if (this.a.f != null) {
            z1.g.f("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.a.p(cVar2);
        this.a.a.b(this.a.b.a(this.a.f), zzia.APP_SESSION_STARTING);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void l(c cVar, String str) {
        this.a.q(cVar);
        this.a.f.e = str;
        this.a.a.b(this.a.b.a(this.a.f), zzia.APP_SESSION_RUNNING);
        z1.m(this.a);
        z1.n(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, boolean] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void m(c cVar, boolean z) {
        this.a.q(cVar);
        this.a.a.b(this.a.b.c(this.a.f, z), zzia.APP_SESSION_RESUMED);
        z1.m(this.a);
        z1.n(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* synthetic */ void n(c cVar, int i) {
        z1.f(this.a, cVar, i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public final /* bridge */ /* synthetic */ void o(c cVar) {
    }
}
