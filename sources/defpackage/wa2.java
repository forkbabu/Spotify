package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.rxjava2.p;
import io.reactivex.f;
import io.reactivex.s;
import io.reactivex.t;

/* renamed from: wa2  reason: default package */
public class wa2 extends m {
    private final String a;
    private final String b;
    private va2 c;
    private hb2 f;
    private final cb2 n;
    private final za2 o;
    private final fb2 p;
    private final jd0 q;
    private final ib2 r;
    private final s<Boolean> s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final p w = new p();
    private f<Boolean> x;

    public wa2(Activity activity, cb2 cb2, za2 za2, fb2 fb2, ib2 ib2, s<Boolean> sVar) {
        jd0 jd0 = (jd0) activity;
        this.q = jd0;
        this.r = ib2;
        this.s = sVar;
        jd0.y0(this);
        this.n = cb2;
        this.o = za2;
        this.p = fb2;
        StringBuilder V0 = je.V0("com.spotify.music.ACTIVE_SESSION_BANNER_VISIBLE_");
        V0.append(cb2.a());
        this.a = V0.toString();
        StringBuilder V02 = je.V0("com.spotify.music.ACTIVE_SESSION_PRESENTER_ACTIVE_");
        V02.append(cb2.a());
        this.b = V02.toString();
    }

    public static void F2(wa2 wa2, boolean z) {
        wa2.v = z;
        wa2.M2(wa2.u, z);
    }

    public static void I2(wa2 wa2, boolean z) {
        wa2.u = z;
        wa2.M2(z, wa2.v);
    }

    private void M2(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        va2 va2 = this.c;
        va2.getClass();
        if (!z3 || !va2.isVisible()) {
            N2(z3);
        }
    }

    private void N2(boolean z) {
        va2 va2 = this.c;
        va2.getClass();
        va2.setVisible(z);
        if (z) {
            va2.e(this.n);
            va2.h(this);
        } else if (this.t) {
            va2.h(null);
        } else {
            return;
        }
        this.t = z;
        f<Boolean> fVar = this.x;
        if (fVar != null) {
            fVar.onNext(Boolean.valueOf(z));
        }
    }

    public boolean E2() {
        return this.t;
    }

    public /* synthetic */ void G2(t tVar) {
        tVar.e(new na2(this));
        this.x = tVar;
        tVar.onNext(Boolean.valueOf(this.t));
    }

    public /* synthetic */ void H2() {
        this.x = null;
    }

    public void J2() {
        if (this.t) {
            N2(false);
            za2 za2 = this.o;
            hb2 hb2 = this.f;
            hb2.getClass();
            za2.a(hb2);
        }
    }

    public void K2() {
        if (this.t) {
            N2(false);
            this.r.a();
        }
    }

    public void L2(va2 va2) {
        this.c = va2;
        this.f = new hb2();
        this.w.b(this.s.subscribe(new ma2(this)));
        this.p.a(new pa2(this));
    }

    public void P0(Intent intent) {
        hb2 hb2 = this.f;
        hb2.getClass();
        hb2.j(intent.getStringExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME"));
        this.p.b(intent);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        va2 va2 = this.c;
        va2.getClass();
        hb2 hb2 = this.f;
        hb2.getClass();
        hb2.i(bundle);
        bundle.putBoolean(this.a, va2.isVisible());
        bundle.putBoolean(this.b, this.t);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void d(Bundle bundle) {
        if (bundle != null) {
            hb2 hb2 = this.f;
            hb2.getClass();
            hb2.h(bundle);
            boolean z = bundle.getBoolean(this.b);
            this.t = z;
            if (z) {
                N2(bundle.getBoolean(this.a));
            }
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.q.e1(this);
        f<Boolean> fVar = this.x;
        if (fVar != null) {
            fVar.onComplete();
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.w.a();
        this.p.onStop();
    }
}
