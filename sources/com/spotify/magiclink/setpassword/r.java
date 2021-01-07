package com.spotify.magiclink.setpassword;

import com.spotify.mobius.android.e;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import defpackage.r21;
import defpackage.s21;

public final class r extends e<t21, r21, q21> {
    private final o11 b;
    private boolean c;

    private r(o11 o11) {
        super("Set password InstrumentationLogger");
        this.b = o11;
    }

    public static r g(o11 o11) {
        return new r(o11);
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void a(Object obj, Object obj2, e0 e0Var) {
        t21 t21 = (t21) obj;
        ((r21) obj2).c(new j(this), l.a, new e(this), new i(this), new g(this), new f(this));
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void b(Object obj, Object obj2, Throwable th) {
        t21 t21 = (t21) obj;
        r21 r21 = (r21) obj2;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void c(Object obj, s sVar) {
        t21 t21 = (t21) obj;
        this.b.a(i11.g(p11.g()));
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void d(Object obj, Throwable th) {
        t21 t21 = (t21) obj;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void e(Object obj, Object obj2) {
        t21 t21 = (t21) obj;
        r21 r21 = (r21) obj2;
    }

    @Override // com.spotify.mobius.android.e, com.spotify.mobius.MobiusLoop.i
    public void f(Object obj) {
        t21 t21 = (t21) obj;
    }

    public /* synthetic */ void h(r21.b bVar) {
        if (!this.c) {
            this.c = true;
            this.b.a(i11.e(p11.g(), n11.c()));
        }
    }

    public /* synthetic */ void i(r21.f fVar) {
        this.b.a(i11.d(p11.g(), m11.j()));
    }

    public /* synthetic */ void j(r21.d dVar) {
        this.b.a(i11.a(p11.g(), j11.g(), k11.d()));
    }

    public /* synthetic */ void k(r21.a aVar) {
        this.b.a(i11.d(p11.g(), m11.k()));
    }

    public /* synthetic */ void l(s21.c cVar) {
        this.b.a(i11.c(p11.g(), l11.c(), n11.c(), cVar.e()));
    }

    public /* synthetic */ void m(s21.a aVar) {
        this.b.a(i11.c(p11.g(), l11.c(), n11.c(), aVar.e()));
    }

    public /* synthetic */ void n(s21.b bVar) {
        this.b.a(i11.c(p11.g(), l11.e(), n11.c(), ""));
    }
}
