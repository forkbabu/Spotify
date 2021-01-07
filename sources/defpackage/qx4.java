package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.editplaylist.EditPlaylistLogger;
import com.spotify.music.features.editplaylist.c;
import com.spotify.music.features.editplaylist.operations.SetPictureOperationHandler;
import com.spotify.music.features.editplaylist.operations.j0;
import com.spotify.music.features.editplaylist.operations.u;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import defpackage.mx4;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: qx4  reason: default package */
public class qx4 implements px4 {
    private final j0 a;
    private final txc b;
    private final EditPlaylistLogger c;
    private final y d;
    private final c e;
    private final mx4 f;
    private final z<k> g;
    private final q h = new q();
    private final p i = new p();
    private boolean j;
    private String k;
    private String l;
    private Uri m;
    private boolean n;
    private Uri o;
    private boolean p;
    private fy4 q;

    public qx4(j0 j0Var, txc txc, EditPlaylistLogger editPlaylistLogger, y yVar, c cVar, mx4.c cVar2, z<k> zVar) {
        this.a = j0Var;
        this.b = txc;
        this.c = editPlaylistLogger;
        this.d = yVar;
        this.e = cVar;
        this.f = cVar2.a(this);
        this.g = zVar;
    }

    public static void C(qx4 qx4, SetPictureOperationHandler.Status status) {
        qx4.getClass();
        int ordinal = status.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((gy4) qx4.q).L();
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    qx4.a.q(false);
                    ((gy4) qx4.q).g();
                    return;
                } else if (ordinal == 4) {
                    qx4.a.q(false);
                    qx4.c.r();
                    ((gy4) qx4.q).K();
                    return;
                } else {
                    return;
                }
            }
        }
        qx4.a.q(false);
        ((gy4) qx4.q).f();
    }

    public static s D(qx4 qx4, SetPictureOperationHandler.Status status) {
        qx4.getClass();
        if (status == SetPictureOperationHandler.Status.SUCCEEDED || status == SetPictureOperationHandler.Status.NOTHING) {
            return qx4.a.i().g(s.i0(status));
        }
        return s.i0(status);
    }

    private void I(boolean z) {
        s sVar;
        if (!this.a.k()) {
            this.a.q(true);
            if (z) {
                sVar = this.a.i().g(s.i0(SetPictureOperationHandler.Status.NOTHING));
            } else {
                sVar = this.a.r().g(this.a.l()).W(new ax4(this), false, Integer.MAX_VALUE);
            }
            this.i.b(sVar.o0(this.d).subscribe(new yw4(this), new ex4(this)));
        }
    }

    @Override // defpackage.mx4.b
    public void A() {
        this.c.d();
        if (((gy4) this.q).i()) {
            ((gy4) this.q).u();
        } else {
            ((gy4) this.q).s();
        }
    }

    @Override // defpackage.px4
    public void B() {
        this.c.p();
        this.h.a(this.a.h().subscribe(zw4.a, bx4.a));
    }

    public /* synthetic */ void E(Throwable th) {
        this.a.q(false);
        ((gy4) this.q).f();
        Logger.e(th, "Failed to save changes", new Object[0]);
    }

    public /* synthetic */ u F(k kVar) {
        return this.a.g(u.a(kVar));
    }

    public /* synthetic */ void G(u3 u3Var) {
        boolean booleanValue = u3Var.a.booleanValue();
        S s = u3Var.b;
        this.k = s.i();
        this.l = s.b();
        this.j = s.f();
        this.p = s.g();
        ((gy4) this.q).A(this.k);
        ((gy4) this.q).y(s.c());
        if (this.m == null) {
            this.m = s.c();
            this.n = s.g();
        }
        this.o = s.c();
        boolean z = !MoreObjects.isNullOrEmpty(this.l);
        boolean a2 = this.e.a();
        ((gy4) this.q).x(this.l);
        ((gy4) this.q).D(this.j && !z);
        ((gy4) this.q).H(!this.j && z);
        ((gy4) this.q).G(this.j && z);
        ((gy4) this.q).B(this.j);
        ((gy4) this.q).z(this.j && a2);
        ((gy4) this.q).F(a2);
        if (!booleanValue || this.e.b()) {
            ((gy4) this.q).w(s.h());
            ((gy4) this.q).I(s.h().isEmpty());
            ((gy4) this.q).C(s.e());
            return;
        }
        ((gy4) this.q).I(true);
        ((gy4) this.q).J(false);
    }

    public /* synthetic */ void H(Throwable th) {
        this.a.q(false);
        ((gy4) this.q).f();
        Logger.e(th, "Failed to save changes when returning to page", new Object[0]);
    }

    @Override // defpackage.px4
    public void a(l lVar, int i2) {
        this.c.n(lVar.getUri());
        this.f.j(lVar, i2);
        j0 j0Var = this.a;
        String f2 = lVar.f();
        f2.getClass();
        j0Var.a(f2);
    }

    @Override // defpackage.px4
    public void b() {
        if (!this.a.k()) {
            boolean j2 = this.a.j();
            this.c.a(j2);
            if (j2) {
                this.f.i();
            } else {
                ((gy4) this.q).f();
            }
        }
    }

    @Override // defpackage.mx4.b
    public void c() {
        this.c.c();
    }

    @Override // defpackage.px4
    public void d(Bundle bundle) {
        this.a.o(bundle);
    }

    @Override // defpackage.mx4.b
    public void e() {
        this.c.g();
        ((gy4) this.q).f();
    }

    @Override // defpackage.px4
    public void f() {
        if (!this.a.k()) {
            boolean j2 = this.a.j();
            this.c.e(j2);
            if (j2) {
                this.f.i();
            } else {
                ((gy4) this.q).f();
            }
        }
    }

    @Override // defpackage.px4
    public void g(Bundle bundle) {
        this.a.p(bundle);
    }

    @Override // defpackage.px4
    public void h(String str, String str2, String str3) {
        if (this.a.c(str2, str3)) {
            this.c.j(str);
        }
    }

    @Override // defpackage.px4
    public void i(String str) {
        if (!str.equals(this.l)) {
            this.c.k();
            this.a.b(str);
            this.l = str;
            ((gy4) this.q).v(str.length(), 300);
            ((gy4) this.q).E(str.length() >= 250);
        }
    }

    @Override // defpackage.px4
    public void j() {
    }

    @Override // defpackage.px4
    public void k() {
        this.c.h();
        I(true);
    }

    @Override // defpackage.px4
    public void l(Uri uri) {
        this.a.f(uri);
    }

    @Override // defpackage.px4
    public void m() {
    }

    @Override // defpackage.px4
    public void n() {
        this.c.q();
        I(false);
    }

    @Override // defpackage.px4
    public void o(String str) {
        if (!str.equals(this.k)) {
            this.c.l();
            this.a.e(str);
            this.k = str;
        }
    }

    @Override // defpackage.px4
    public void p(fy4 fy4) {
        this.q = fy4;
    }

    @Override // defpackage.px4
    public void q() {
        ((gy4) this.q).s();
    }

    @Override // defpackage.mx4.b
    public void r() {
        this.c.b();
    }

    @Override // defpackage.px4
    public void s() {
        ((gy4) this.q).D(false);
        ((gy4) this.q).G(true);
    }

    @Override // defpackage.px4
    public void start() {
        this.h.a(s.n(this.b.b().j0(ix4.a), this.g.P().j0(new fx4(this)), jx4.a).o0(this.d).subscribe(new cx4(this), dx4.a));
        if (this.e.a() && this.a.k()) {
            this.h.a(this.a.l().W(new ax4(this), false, Integer.MAX_VALUE).o0(this.d).subscribe(new yw4(this), new xw4(this)));
        }
    }

    @Override // defpackage.px4
    public void stop() {
        ((gy4) this.q).g();
        this.i.a();
        this.h.c();
    }

    @Override // defpackage.px4
    public void t() {
        this.c.f();
        if (this.j) {
            this.f.k(this.p);
        }
    }

    @Override // defpackage.px4
    public void u(boolean z) {
        ((gy4) this.q).I(z);
    }

    @Override // defpackage.mx4.b
    public void v() {
        this.c.m();
        if (this.m.equals(this.o)) {
            this.a.f(Uri.EMPTY);
            ((gy4) this.q).y(Uri.EMPTY);
            this.p = false;
            return;
        }
        this.a.n();
        ((gy4) this.q).y(this.m);
        this.o = this.m;
        this.p = this.n;
    }

    @Override // defpackage.px4
    public void w() {
        ((gy4) this.q).r();
    }

    @Override // defpackage.mx4.b
    public void x(l lVar, int i2) {
        this.c.t();
        j0 j0Var = this.a;
        String f2 = lVar.f();
        f2.getClass();
        if (j0Var.m(f2)) {
            ((gy4) this.q).e(lVar, i2);
        }
    }

    @Override // defpackage.px4
    public void y() {
        this.c.o();
        this.i.a();
        this.a.q(false);
        ((gy4) this.q).g();
    }

    @Override // defpackage.mx4.b
    public void z() {
        this.c.s();
        if (((gy4) this.q).h()) {
            ((gy4) this.q).t();
        } else {
            ((gy4) this.q).r();
        }
    }
}
