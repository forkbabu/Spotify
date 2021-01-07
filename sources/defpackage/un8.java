package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.connection.g;
import com.spotify.music.features.tasteonboarding.artistpicker.model.a;
import com.spotify.music.features.tasteonboarding.artistpicker.view.TastePickerFragment;
import com.spotify.music.features.tasteonboarding.i;
import com.spotify.rxjava2.q;
import defpackage.ql8;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: un8  reason: default package */
public class un8 extends m implements ql8.a, rl8 {
    private final y a;
    private final ho8 b;
    private final s<g> c;
    private final sm8 f;
    private final vl8 n;
    private final no8 o;
    private final c p;
    private final com.spotify.music.features.tasteonboarding.c q;
    private final i r;
    private final q s = new q();
    private boolean t;
    private boolean u = true;
    private boolean v;
    private final boolean w;
    private final int x;
    private ql8 y;

    public un8(boolean z, int i, k kVar, y yVar, ho8 ho8, s<g> sVar, sm8 sm8, vl8 vl8, no8 no8, c cVar, com.spotify.music.features.tasteonboarding.c cVar2, i iVar) {
        kVar.y0(this);
        this.w = z;
        this.x = i;
        this.a = yVar;
        this.b = ho8;
        this.c = sVar;
        this.f = sm8;
        this.n = vl8;
        this.o = no8;
        this.p = cVar;
        this.q = cVar2;
        this.r = iVar;
    }

    private void N2(int i) {
        if (this.q.b() >= i) {
            this.n.d();
            ((TastePickerFragment) this.y).R4();
            return;
        }
        ((TastePickerFragment) this.y).K4();
    }

    @Override // defpackage.ql8.a
    public void E(ql8 ql8) {
        this.y = ql8;
    }

    public v E2(g gVar) {
        gVar.getClass();
        boolean z = gVar instanceof g.c;
        this.t = z;
        if (!z) {
            if (this.q.b() > 0) {
                return s.i0(a.d());
            }
            return s.i0(a.e());
        } else if (!this.f.g()) {
            return this.b.a().j0(am8.a).G0((R) a.b()).r0(rm8.a);
        } else {
            if (this.v) {
                return s.i0(a.g());
            }
            return s.i0(a.f());
        }
    }

    public void F2(a aVar) {
        this.v = false;
        aVar.getClass();
        if (!(aVar instanceof a.b)) {
            ((TastePickerFragment) this.y).M4();
        }
        aVar.c(new km8(this), new nm8(this), im8.a, new qm8(this), new hm8(this), new pm8(this), new mm8(this));
    }

    public /* synthetic */ void G2(Throwable th) {
        Logger.o(th, "Error observing connection state changes", new Object[0]);
        ((TastePickerFragment) this.y).N4();
        ((TastePickerFragment) this.y).S4(this.o.f(), this.o.e());
    }

    public /* synthetic */ void H2(a.b bVar) {
        ((TastePickerFragment) this.y).L4();
        ((TastePickerFragment) this.y).N4();
        ((TastePickerFragment) this.y).s1();
    }

    public /* synthetic */ void I2(a.g gVar) {
        this.f.h(gVar.i().items());
        this.f.i(gVar.i().renderType());
        ((TastePickerFragment) this.y).T4(this.f.e(), this.f.f(), this.u);
        this.u = false;
    }

    public /* synthetic */ void J2(a.e eVar) {
        ((TastePickerFragment) this.y).L4();
        ((TastePickerFragment) this.y).T4(this.f.e(), this.f.f(), this.u);
        N2(this.x);
    }

    public /* synthetic */ void K2(a.c cVar) {
        ((TastePickerFragment) this.y).N4();
        ((TastePickerFragment) this.y).S4(this.o.i(), this.o.g());
        ((TastePickerFragment) this.y).K4();
    }

    public /* synthetic */ void L2(a.d dVar) {
        ((TastePickerFragment) this.y).N4();
        ((TastePickerFragment) this.y).S4(this.o.j(), this.o.h());
        ((TastePickerFragment) this.y).K4();
    }

    public /* synthetic */ void M2(a.C0254a aVar) {
        Assertion.w("Error when trying to load content in taste picker", aVar.i());
        this.n.i();
        this.p.a();
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void b1(Bundle bundle) {
        if (bundle != null) {
            this.u = bundle.getBoolean("key-animate-picker");
        }
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        bundle.putBoolean("key-animate-picker", this.u);
    }

    @Override // defpackage.rl8
    public void e2() {
        N2(this.x);
    }

    @Override // defpackage.ql8.a
    public void g() {
        this.n.c();
        if (!(this.q.b() > 0) || !this.t) {
            this.p.a();
        } else {
            this.r.d();
        }
    }

    @Override // defpackage.ql8.a
    public void i2() {
        this.n.e();
        this.r.b();
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.y = null;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onResume() {
        N2(this.x);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStart() {
        ((TastePickerFragment) this.y).Q4(this.o.k(this.x, this.w));
        ((TastePickerFragment) this.y).P4(this.o.d());
        if (this.f.g()) {
            this.v = true;
            ((TastePickerFragment) this.y).T4(this.f.e(), this.f.f(), this.u);
        }
        this.s.a(this.c.E().W(new om8(this), false, Integer.MAX_VALUE).o0(this.a).subscribe(new lm8(this), new jm8(this)));
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.s.c();
    }
}
