package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.search.history.f;
import com.spotify.libs.search.history.h;
import com.spotify.mobile.android.hubframework.defaults.playback.HubsTracksPlayerHelper;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.search.transition.m;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import defpackage.f61;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;
import java.util.UUID;

/* renamed from: of8  reason: default package */
public class of8 implements ws2, m.a, i3b {
    private final k4b A;
    private final l<Optional<b91>, Optional<b91>> B;
    private final dd8 C;
    private final te8 D;
    private final qd8 E;
    private final w F;
    private com.spotify.music.libs.search.transition.l G;
    private String H;
    private final boolean I;
    private final boolean J;
    private boolean K;
    private final boolean L;
    private b M;
    private b N;
    private b O;
    private b P;
    private b Q;
    private b91 R;
    private final efa S;
    private final i5b T;
    private final i4b U;
    private final boolean V;
    private final int W;
    private l.b X;
    private String Y = UUID.randomUUID().toString();
    private boolean Z = true;
    protected final t a;
    private final f4b a0 = new a();
    private final s<Boolean> b;
    private final s<Boolean> c;
    private final y f;
    private final b61 n;
    private final i o;
    private HubsTracksPlayerHelper p;
    private final wg8 q;
    private final x3b r;
    private final h5b s;
    private final ib8 t;
    private final gb8 u;
    private final fb8 v;
    private final kb8 w;
    private final yf8 x;
    private final h y;
    private final com.spotify.libs.search.history.i z;

    /* renamed from: of8$a */
    class a implements f4b {
        a() {
        }

        @Override // defpackage.f4b
        public void f(String str) {
            String trim = str.trim();
            if (l0.x(trim)) {
                String[] split = Uri.parse(l0.z(trim).toString()).getEncodedPath().split("/");
                for (String str2 : split) {
                    String encode = Uri.encode(str2);
                    if (!str2.equals(encode)) {
                        trim = trim.replace(str2, encode);
                    }
                }
            }
            if (l0.x(trim)) {
                of8.this.a.d(trim);
            }
            of8.e(of8.this).d();
        }
    }

    public of8(i iVar, HubsTracksPlayerHelper hubsTracksPlayerHelper, x3b x3b, h5b h5b, ib8 ib8, gb8 gb8, fb8 fb8, kb8 kb8, t tVar, yf8 yf8, h hVar, com.spotify.libs.search.history.i iVar2, com.spotify.music.libs.search.transition.l lVar, String str, boolean z2, boolean z3, boolean z4, boolean z5, efa efa, s<Boolean> sVar, ob8 ob8, s<Boolean> sVar2, y yVar, k4b k4b, io.reactivex.functions.l<Optional<b91>, Optional<b91>> lVar2, dd8 dd8, te8 te8, qd8 qd8, w wVar, ig8 ig8, String str2, i5b i5b, i4b i4b, boolean z6, int i, b61 b61, wg8 wg8) {
        this.a = tVar;
        this.o = iVar;
        this.p = hubsTracksPlayerHelper;
        this.r = x3b;
        this.s = h5b;
        this.t = ib8;
        this.u = gb8;
        this.v = fb8;
        this.w = kb8;
        this.x = yf8;
        this.y = hVar;
        this.z = iVar2;
        this.G = lVar;
        this.H = str;
        this.I = z2;
        this.J = z3;
        this.K = z4;
        this.L = z5;
        this.S = efa;
        this.c = sVar2;
        this.f = yVar;
        this.A = k4b;
        this.B = lVar2;
        this.C = dd8;
        this.D = te8;
        this.E = qd8;
        this.F = wVar;
        this.n = b61;
        this.V = z6;
        this.W = i;
        this.q = wg8;
        this.T = i5b;
        this.U = i4b;
        ig8.setTitle(str2);
        dd8.b(wg8.b());
        this.b = s.d1(sVar, sVar2, gf8.a).Q(ff8.a);
        wg8.g(ob8, false);
    }

    static wg8 e(of8 of8) {
        wg8 wg8 = of8.q;
        wg8.getClass();
        return wg8;
    }

    public static void g(of8 of8, b7b b7b) {
        b91 b91 = of8.R;
        String str = "";
        if (b91 != null) {
            str = b91.custom().string("requestId", str);
        }
        if (MoreObjects.isNullOrEmpty(b7b.a())) {
            of8.t.log(str);
        }
        of8.u.log(b7b.a());
    }

    private void w() {
        b bVar;
        g<b91> gVar;
        b91 b91 = this.R;
        boolean z2 = false;
        boolean z3 = (b91 == null) || !rqa.m(b91);
        k4b k4b = this.A;
        wg8 wg8 = this.q;
        wg8.getClass();
        g<b7b> a2 = k4b.a(wg8.q(), this.a0, this.s, this.H, z3);
        if (!MoreObjects.isNullOrEmpty(this.H)) {
            this.D.b(this.R, "", this.H);
            this.q.q().n(true);
        }
        x(this.N);
        x(this.O);
        g<b7b> r0 = a2.V(1).r0();
        if (this.q.q() != null && MoreObjects.isNullOrEmpty(this.q.q().h())) {
            bVar = new io.reactivex.internal.operators.flowable.y(r0, 1).subscribe(new df8(this));
        } else {
            bVar = r0.subscribe(new df8(this));
        }
        this.O = bVar;
        if (this.V) {
            if (this.R == null) {
                this.R = HubsImmutableViewModel.EMPTY;
            }
            gVar = this.r.d(r0, this.U.b(this.T, this).b0(y6b.a(this.W)), this.R);
        } else {
            gVar = this.r.c(r0);
            b91 b912 = this.R;
            if (b912 != null) {
                HubsImmutableViewModel hubsImmutableViewModel = HubsImmutableViewModel.EMPTY;
                if (!hubsImmutableViewModel.equals(b912)) {
                    b61 b61 = this.n;
                    b61.getClass();
                    b91 b2 = b61.f().b();
                    if (b2 != null && !hubsImmutableViewModel.equals(b2)) {
                        z2 = true;
                    }
                    if (!z2) {
                        gVar = gVar.b0(b912);
                    }
                }
            }
        }
        this.N = gVar.Q(this.f).subscribe(new kf8(this));
    }

    private static void x(b bVar) {
        if (bVar != null && !bVar.d()) {
            bVar.dispose();
        }
    }

    @Override // com.spotify.music.libs.search.transition.m.a
    public void a() {
        if (this.G != null) {
            w();
            this.G = null;
        }
    }

    @Override // defpackage.ws2
    public boolean b() {
        return false;
    }

    @Override // defpackage.i3b
    public int c() {
        b91 b91 = this.R;
        if (b91 != null) {
            return rqa.d(b91);
        }
        return 0;
    }

    @Override // defpackage.i3b
    public boolean d() {
        b91 b91 = this.R;
        if (b91 != null) {
            return !rqa.j(b91);
        }
        return false;
    }

    public String f() {
        return this.H;
    }

    public /* synthetic */ void h(String str) {
        this.D.b(this.R, this.H, str);
    }

    public void i(Boolean bool) {
        wg8 wg8 = this.q;
        wg8.getClass();
        wg8.y();
    }

    public /* synthetic */ void j(Boolean bool) {
        if (bool.booleanValue()) {
            this.q.j();
        } else {
            this.q.A();
        }
    }

    public void k(u3 u3Var) {
        boolean d = uxc.d(u3Var.b);
        boolean e = uxc.e(u3Var.b);
        Optional<b91> a2 = this.y.a(u3Var.a, e);
        try {
            if (this.L) {
                a2 = this.B.apply(a2);
            }
        } catch (Exception unused) {
        }
        if (a2.isPresent()) {
            n(a2.get());
        } else {
            n(this.x.a(this.L, d));
        }
    }

    public void l(int i, int i2, Intent intent) {
        String stringExtra;
        if (i2 == -1 && i == 1001 && (stringExtra = intent.getStringExtra("com.spotify.music.spotlets.scannables.RESULT")) != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_scannable", true);
            this.a.f(stringExtra, bundle);
        }
    }

    public void m() {
        this.w.a();
        this.E.a();
    }

    /* access modifiers changed from: protected */
    public void n(b91 b91) {
        x(this.M);
        this.q.x();
        b91.getClass();
        String string = b91.custom().string("requestId", "");
        String f2 = rqa.f(b91);
        this.H = f2;
        if (MoreObjects.isNullOrEmpty(f2)) {
            wg8 wg8 = this.q;
            wg8.getClass();
            wg8.u();
        }
        this.D.a(this.R, b91);
        this.R = b91;
        Logger.l("SearchPresenter results onNext: query = %s, requestId = %s", this.H, string);
        wg8 wg82 = this.q;
        wg82.getClass();
        wg82.o();
        b61 b61 = this.n;
        b61.getClass();
        boolean b2 = true ^ this.y.b(b91);
        f61.b bVar = new f61.b(b91);
        bVar.b(b2);
        b61.l(bVar.a());
        String string2 = b91.custom().string("backgroundUri", "");
        int intValue = b91.custom().intValue("lastTopResultItemPosition", 0);
        wg8 wg83 = this.q;
        wg83.getClass();
        wg83.c(string2, intValue);
        if (this.p != null && this.K && !MoreObjects.isNullOrEmpty(string)) {
            HubsTracksPlayerHelper hubsTracksPlayerHelper = this.p;
            List<? extends s81> body = b91.body();
            int i = g8b.a;
            hubsTracksPlayerHelper.b(FluentIterable.from(body).transform(y7b.a).filter(z7b.a), null);
            this.p = null;
            this.K = false;
        }
    }

    public void o() {
        g gVar;
        this.X = new af8(this);
        wg8 wg8 = this.q;
        wg8.getClass();
        wg8.q().g(this.X);
        if (this.G == null) {
            w();
            if (this.Z) {
                wg8 wg82 = this.q;
                wg82.getClass();
                wg82.r(200);
            }
        } else {
            wg8 wg83 = this.q;
            wg83.getClass();
            wg83.t(this);
            x(this.M);
            if (this.z.e()) {
                gVar = g.N(((f) this.z.d()).e());
            } else {
                gVar = ((f) this.z.d()).d();
            }
            this.M = g.i(gVar, this.F.b().E().Y0(BackpressureStrategy.LATEST), jf8.a).Q(this.f).subscribe(new bf8(this));
        }
        x(this.Q);
        this.Q = this.c.o0(this.f).subscribe(new cf8(this));
        x(this.P);
        this.P = this.b.o0(this.f).subscribe(new ef8(this));
    }

    public void p() {
        this.o.g();
        i iVar = this.o;
        b61 b61 = this.n;
        b61.getClass();
        iVar.c(b61);
    }

    public void q() {
        if (this.X != null) {
            this.q.q().q(this.X);
        }
        this.C.a();
        this.C.reset();
        x(this.N);
        x(this.O);
        x(this.M);
        x(this.P);
        x(this.Q);
        wg8 wg8 = this.q;
        wg8.getClass();
        this.Z = wg8.q().f();
        this.q.d();
    }

    public void r() {
        this.o.h();
        i iVar = this.o;
        b61 b61 = this.n;
        b61.getClass();
        iVar.f(b61);
    }

    public boolean s() {
        String str;
        fb8 fb8 = this.v;
        if (this.J) {
            str = ViewUris.F.toString();
        } else if (this.I) {
            str = ViewUris.O.toString();
        } else {
            str = ViewUris.n0.toString();
        }
        fb8.log(str);
        return false;
    }

    public void t() {
        this.z.c();
    }

    public void u(Parcelable parcelable) {
        b61 b61 = this.n;
        b61.getClass();
        if (parcelable instanceof uf8) {
            uf8 uf8 = (uf8) parcelable;
            String a2 = uf8.a().a();
            this.Y = a2;
            b91 a3 = this.S.a(a2);
            if (a3 != null) {
                b61.k(a3);
            }
            b61.i(uf8.a().b());
            this.Z = uf8.b();
        }
        b61 b612 = this.n;
        b612.getClass();
        b91 b2 = b612.f().b();
        this.R = b2;
        if (b2 != null) {
            this.H = rqa.f(b2);
        }
    }

    public Parcelable v() {
        b61 b61 = this.n;
        b61.getClass();
        efa efa = this.S;
        String str = this.Y;
        b61 b612 = this.n;
        b612.getClass();
        efa.b(str, b612.f().b());
        dfa dfa = new dfa(this.Y, b61.j());
        wg8 wg8 = this.q;
        wg8.getClass();
        return new lf8(dfa, wg8.q().f());
    }
}
