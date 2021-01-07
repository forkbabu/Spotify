package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.music.navigation.t;
import defpackage.rl5;
import io.reactivex.disposables.a;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: fi5  reason: default package */
public class fi5 {
    private final vh5 a;
    private final il5 b;
    private final y c;
    private final y d;
    private final t e;
    private final hha f;
    private final qf5 g;
    private final a h = new a();
    private final ml5 i;
    private final b60 j;
    private final v k;
    private final w51 l;
    private final g<rl5> m = new ei5(this);
    private final g<Throwable> n = new ci5(this);
    private b61 o;
    private final String p;

    protected fi5(w51 w51, v vVar, vh5 vh5, il5 il5, y yVar, y yVar2, t tVar, hha hha, qf5 qf5, ml5 ml5, b60 b60, String str) {
        this.k = vVar;
        this.l = w51;
        this.a = vh5;
        this.b = il5;
        this.c = yVar;
        this.d = yVar2;
        this.e = tVar;
        this.f = hha;
        this.g = qf5;
        this.i = ml5;
        this.j = b60;
        this.p = str;
    }

    private void d(s<b91> sVar) {
        b91 b91;
        rl5.a a2 = rl5.a();
        b61 b61 = this.o;
        if (b61 != null) {
            b91 = b61.f().b();
        } else {
            b91 = HubsImmutableViewModel.EMPTY;
        }
        a2.a(b91);
        this.h.b(sVar.L(di5.a).s0(this.g.a()).y0(a2.build(), this.b).E().I0(this.c).o0(this.d).subscribe(this.m, this.n));
    }

    public void a(rl5 rl5) {
        if (this.o != null) {
            b91 b2 = rl5.b();
            String[] stringArray = b2.custom().stringArray("ondemand");
            if (!MoreObjects.isNullOrEmpty(this.p) && stringArray != null && stringArray.length > 0 && this.f.h()) {
                this.f.l(false);
                this.e.d(this.p);
            }
            this.j.a(b2);
            this.o.k(b2);
            this.k.N(b2.custom());
            p81 bundle = b2.custom().bundle("topbar");
            if (bundle != null) {
                this.k.O(bundle.string("title", ""));
            } else {
                this.k.O("");
            }
            if (rl5.c() || Build.VERSION.SDK_INT < 18) {
                this.k.M();
            }
            Logger.b("HomeLoad: onNext() -> viewModel id: %s, body size %s:", b2.id(), Integer.valueOf(b2.body().size()));
        }
    }

    public /* synthetic */ void b(Throwable th) {
        b61 b61 = this.o;
        if (b61 != null) {
            b61.k(this.g.a());
        }
        Assertion.w("HomeLoad: onError", th);
    }

    public /* synthetic */ void c(Boolean bool) {
        if (bool.booleanValue()) {
            this.f.b(false);
            d(this.a.e());
        }
    }

    public void e(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null) {
            bundle.setClassLoader(b61.class.getClassLoader());
            parcelable = bundle.getParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE");
        } else {
            parcelable = null;
        }
        b61 b61 = this.o;
        if (b61 != null) {
            b61.i(parcelable);
        }
    }

    public void f(Bundle bundle) {
        b61 b61 = this.o;
        if (b61 != null && bundle != null) {
            bundle.putParcelable("com.spotify.music.features.home.nft.presenter.HomePresenter.STATE", b61.j());
        }
    }

    public void g() {
        this.o = new b61(this.l, this.k);
        if (!this.i.j()) {
            this.i.m(this.k.b());
            this.i.n(ViewLoadingTracker.Reason.LOAD);
        }
    }

    public void h(s<b91> sVar) {
        this.h.f();
        this.h.b(this.f.j().o0(this.d).subscribe(new bi5(this)));
        d(sVar);
    }

    public void i() {
        this.h.f();
    }
}
