package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.C0707R;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Set;

/* renamed from: as5  reason: default package */
public class as5 extends m implements c {
    private va2 a;
    private v82 b;
    private zr5 c;
    private final es5 f;
    private final w82 n;
    private final cs5 o;
    private final k p;
    private final vr5 q;
    private final io.reactivex.disposables.a r = new io.reactivex.disposables.a();
    private final Set<wa2> s;
    private final vla t;
    private final y u;

    /* access modifiers changed from: package-private */
    /* renamed from: as5$a */
    public static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract boolean b();

        /* access modifiers changed from: package-private */
        public abstract boolean c();
    }

    public as5(es5 es5, w82 w82, cs5 cs5, Activity activity, vr5 vr5, Set<wa2> set, vla vla, y yVar) {
        this.f = es5;
        this.n = w82;
        this.o = cs5;
        k kVar = (k) activity;
        this.p = kVar;
        this.s = set;
        kVar.y0(this);
        this.q = vr5;
        this.t = vla;
        this.u = yVar;
    }

    public static void E2(as5 as5, a aVar) {
        as5.getClass();
        if (aVar.a() || aVar.c() || !aVar.b() || as5.f.a()) {
            zr5 zr5 = as5.c;
            zr5.getClass();
            zr5.setVisible(false);
            if (aVar.c()) {
                as5.t.e();
                return;
            }
            return;
        }
        as5.f.k();
        zr5 zr52 = as5.c;
        zr52.getClass();
        zr52.setVisible(true);
        v82 v82 = as5.b;
        v82.getClass();
        v82.setVisible(false);
        va2 va2 = as5.a;
        va2.getClass();
        va2.setVisible(false);
        as5.t.m();
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void P0(Intent intent) {
        for (wa2 wa2 : this.s) {
            wa2.P0(intent);
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void b1(Bundle bundle) {
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        bundle.putBoolean("start_trip_snack_item_dismissed", this.f.a());
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void d(Bundle bundle) {
        if (bundle != null) {
            this.f.n(bundle.getBoolean("start_trip_snack_item_dismissed"));
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.p.e1(this);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onResume() {
        this.t.p();
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStart() {
        for (wa2 wa2 : this.s) {
            va2 va2 = this.a;
            va2.getClass();
            wa2.L2(va2);
        }
        w82 w82 = this.n;
        v82 v82 = this.b;
        v82.getClass();
        w82.a(v82);
        if (this.r.h() > 0) {
            Assertion.v("Lifecycle mismatch detected: onStart called without matching onStop");
            this.r.f();
        }
        es5 es5 = this.f;
        zr5 zr5 = this.c;
        zr5.getClass();
        es5.l(zr5);
        s<Boolean> b2 = this.q.b();
        s<Boolean> a2 = this.q.a();
        Boolean bool = Boolean.FALSE;
        this.r.b(s.m(b2, a2.G0(bool), this.q.c().G0(bool), rq5.a).E().o0(this.u).subscribe(new jr5(this)));
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.t.f();
        this.r.f();
        for (wa2 wa2 : this.s) {
            wa2.onStop();
        }
        this.n.onStop();
        this.f.m();
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.c
    public void r2(AnchorBar anchorBar) {
        this.o.getClass();
        v82 v82 = new v82(anchorBar, "Waze");
        this.b = v82;
        anchorBar.e(v82);
        this.o.getClass();
        va2 va2 = new va2(anchorBar);
        this.a = va2;
        anchorBar.e(va2);
        this.o.getClass();
        zr5 zr5 = new zr5(anchorBar, C0707R.layout.layout_starttrip_banner);
        this.c = zr5;
        anchorBar.e(zr5);
    }
}
