package com.spotify.libs.otp.ui;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.session.f;

public class h0<H extends Parcelable> implements e0 {
    private final com.spotify.libs.otp.session.d<H> a;
    private final d.c b = new c(null);
    private final i0<H> c;
    private final b d;
    private d e;
    g0 f;

    public interface b {
        void c(d.a aVar);

        void e(Throwable th);
    }

    private class c extends f {
        c(a aVar) {
        }

        @Override // com.spotify.libs.otp.session.f, com.spotify.libs.otp.session.d.c
        public void a(Throwable th) {
            Logger.e(th, "OTP request error", new Object[0]);
            h0.this.d.e(th);
            h0.this.h();
            d dVar = h0.this.e;
            dVar.getClass();
            dVar.e(th);
        }

        @Override // com.spotify.libs.otp.session.d.c
        public void b() {
            h0.this.h();
        }

        @Override // com.spotify.libs.otp.session.f, com.spotify.libs.otp.session.d.c
        public void d(d.a aVar) {
            h0.this.d.c(aVar);
            h0.this.g();
            d dVar = h0.this.e;
            dVar.getClass();
            dVar.c(aVar);
        }
    }

    public interface d {
        void c(d.a aVar);

        void e(Throwable th);
    }

    public h0(com.spotify.libs.otp.session.d<H> dVar, i0<H> i0Var, b bVar) {
        this.a = dVar;
        this.c = i0Var;
        bVar.getClass();
        this.d = bVar;
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void a(boolean z) {
        g0 g0Var = this.f;
        g0Var.getClass();
        g0Var.k2(true);
        this.c.e(false);
        g0 g0Var2 = this.f;
        g0Var2.getClass();
        g0Var2.V(this.c, z);
        this.a.a(this.b);
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void b(boolean z) {
        this.a.t(this.b);
        g0 g0Var = this.f;
        g0Var.getClass();
        g0Var.O0(this.c, z);
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void c(g0 g0Var) {
        MoreObjects.checkState(this.e != null);
        g0Var.getClass();
        this.f = g0Var;
        i0<H> i0Var = this.c;
        i0Var.getClass();
        i0Var.a = this;
        g0Var.V1(this.c);
    }

    public void f(H h) {
        g0 g0Var = this.f;
        g0Var.getClass();
        g0Var.k2(true);
        this.c.e(false);
        this.a.u(h);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        g0 g0Var = this.f;
        g0Var.getClass();
        g0Var.k2(false);
        this.c.e(false);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        g0 g0Var = this.f;
        g0Var.getClass();
        g0Var.k2(false);
        this.c.e(true);
    }

    public void i(d dVar) {
        this.e = dVar;
    }
}
