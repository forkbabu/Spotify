package com.spotify.libs.otp.ui;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.ui.m0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;

public class l0<H extends Parcelable, R> implements e0 {
    private final com.spotify.libs.otp.session.d<H> a;
    private final y b;
    private final a<H, R> c;
    private io.reactivex.disposables.b d;
    private io.reactivex.disposables.b e;
    private final n0<H, R> f;
    private final b g;
    private final d h;
    private c<R> i;
    private g0 j;

    public interface a<H extends Parcelable, R> {
        z<m0<R>> J0(H h, String str);
    }

    public interface b {
        void d(Throwable th);

        void f();

        void n();

        void o();

        void x(d.a aVar);

        void y(Throwable th);
    }

    public interface c<R> {
        void a();

        void d(Throwable th);

        void f(String str, R r);

        void g(k0 k0Var);
    }

    public interface d {
        void a();

        void b(String str);

        void p();

        void reset();

        void s();
    }

    public l0(com.spotify.libs.otp.session.d<H> dVar, n0<H, R> n0Var, y yVar, a<H, R> aVar, b bVar, d dVar2) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        dVar.getClass();
        this.a = dVar;
        n0Var.getClass();
        this.f = n0Var;
        yVar.getClass();
        this.b = yVar;
        aVar.getClass();
        this.c = aVar;
        bVar.getClass();
        this.g = bVar;
        dVar2.getClass();
        this.h = dVar2;
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void a(boolean z) {
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.V(this.f, z);
        this.h.reset();
        n();
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void b(boolean z) {
        this.d.dispose();
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.O0(this.f, z);
    }

    @Override // com.spotify.libs.otp.ui.e0
    public void c(g0 g0Var) {
        MoreObjects.checkState(this.i != null);
        g0Var.getClass();
        this.j = g0Var;
        this.f.o(this);
        g0Var.V1(this.f);
    }

    public /* synthetic */ void d(String str) {
        this.f.n(false);
        this.h.b(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.spotify.libs.otp.ui.l0$c<R> */
    /* JADX WARN: Multi-variable type inference failed */
    public void e(String str, m0 m0Var) {
        m0Var.getClass();
        if (m0Var instanceof m0.a) {
            this.g.n();
            n();
            this.f.n(true);
            return;
        }
        MoreObjects.checkState(m0Var instanceof m0.b);
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.k2(false);
        this.f.m(false);
        this.f.n(false);
        this.g.f();
        c<R> cVar = this.i;
        cVar.getClass();
        cVar.f(str, ((m0.b) m0Var).c());
    }

    public void f(Throwable th) {
        Logger.e(th, "ValidateOtpPresenter: validation error", new Object[0]);
        n();
        this.g.d(th);
        c<R> cVar = this.i;
        cVar.getClass();
        cVar.d(th);
    }

    public void g(s<CharSequence> sVar) {
        this.e = sVar.o0(this.b).j0(y.a).subscribe(new s(this), r.a);
    }

    public void h() {
        this.e.dispose();
    }

    public void i() {
        this.h.a();
        c<R> cVar = this.i;
        cVar.getClass();
        cVar.a();
    }

    public void j() {
        this.h.p();
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.k2(true);
        this.f.m(false);
        this.f.n(false);
        c<R> cVar = this.i;
        cVar.getClass();
        cVar.g(new k0(this.a, new p(this), this.g));
    }

    public void k(String str) {
        this.h.s();
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.k2(true);
        this.f.m(false);
        this.f.n(false);
        MoreObjects.checkState(this.a.h());
        this.d.dispose();
        this.d = this.c.J0(this.a.f(), str).B(this.b).subscribe(new t(this, str), new q(this));
    }

    public void l(int i2) {
        this.f.k(i2);
    }

    public void m(String str, String str2) {
        this.f.l(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        g0 g0Var = this.j;
        g0Var.getClass();
        g0Var.k2(false);
        this.f.m(true);
        this.f.n(false);
    }

    public void o(c<R> cVar) {
        this.i = cVar;
    }
}
