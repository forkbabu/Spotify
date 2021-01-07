package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.view.g1;
import com.spotify.music.features.yourlibrary.musicpages.view.x0;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.y;

/* renamed from: ga9  reason: default package */
public class ga9 implements z99 {
    private final Context a;
    private final h79 b;
    private final SnackbarManager c;
    private final x0 d;
    private final c e;
    private final y f;

    public ga9(Context context, h79 h79, SnackbarManager snackbarManager, x0 x0Var, c cVar, y yVar) {
        this.a = context;
        this.b = h79;
        this.c = snackbarManager;
        this.d = x0Var;
        this.e = cVar;
        this.f = yVar;
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.e(r0.u0.class, new i99(this), this.f);
        g1 f0 = this.b.f0();
        f0.getClass();
        mVar.c(r0.e1.class, new v99(f0), this.f);
        mVar.e(r0.w0.class, new l99(this), this.f);
        mVar.e(r0.m0.class, new s99(this), this.f);
        mVar.e(r0.C0262r0.class, new k99(this), this.f);
        mVar.e(r0.v0.class, new p99(this), this.f);
        mVar.e(r0.q0.class, new r99(this), this.f);
        mVar.e(r0.p0.class, new n99(this), this.f);
        g1 f02 = this.b.f0();
        f02.getClass();
        mVar.c(r0.j0.class, new b89(f02), this.f);
        mVar.e(r0.x0.class, new m99(this), this.f);
        mVar.e(r0.z0.class, new j99(this), this.f);
        g1 f03 = this.b.f0();
        f03.getClass();
        mVar.c(r0.a.class, new t79(f03), this.f);
        mVar.e(r0.d1.class, new o99(this), this.f);
        mVar.e(r0.b1.class, new q99(this), this.f);
    }

    public /* synthetic */ void b(r0.m0 m0Var) {
        this.b.f0().j(m0Var.c(), m0Var.b(), m0Var.a());
    }

    public /* synthetic */ void c(r0.p0 p0Var) {
        this.b.f0().a(p0Var.a());
    }

    public /* synthetic */ void d(r0.q0 q0Var) {
        this.b.f0().b(q0Var.a());
    }

    public /* synthetic */ void e(r0.C0262r0 r0Var) {
        this.b.f0().c(r0Var.b(), r0Var.a());
    }

    public /* synthetic */ void f(r0.u0 u0Var) {
        this.b.f0().m(u0Var.a());
    }

    public /* synthetic */ void g(r0.v0 v0Var) {
        this.b.f0().e(v0Var.a());
    }

    public /* synthetic */ void h(r0.w0 w0Var) {
        g1 f0 = this.b.f0();
        if (w0Var.a()) {
            f0.h(true);
            f0.g();
            return;
        }
        f0.h(false);
    }

    public /* synthetic */ void i(r0.x0 x0Var) {
        this.b.f0().d(x0Var.a());
    }

    public /* synthetic */ void j(r0.z0 z0Var) {
        this.b.f0().k(z0Var.a());
    }

    public /* synthetic */ void k(r0.b1 b1Var) {
        ContextMenuFragment.b5(this.a, this.d, b1Var.a(), this.e);
    }

    public /* synthetic */ void l(r0.d1 d1Var) {
        this.c.show(SnackbarConfiguration.builder(d1Var.a()).build());
    }
}
