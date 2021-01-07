package com.spotify.music.features.yourlibrary.musicpages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.datasource.z3;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.pages.w;
import com.spotify.music.features.yourlibrary.musicpages.view.MusicPagesViewLoadingTrackerConnectable;
import com.spotify.music.features.yourlibrary.musicpages.view.g1;
import com.spotify.music.features.yourlibrary.musicpages.view.i1;
import com.spotify.music.features.yourlibrary.musicpages.view.j1;
import com.spotify.music.yourlibrary.interfaces.e;
import com.spotify.music.yourlibrary.interfaces.f;

public class MusicPagesFragment extends LifecycleListenableFragment implements f, p69, q69, s, k, j79, ws2, h79 {
    h1 h0;
    j1 i0;
    g1 j0;
    w k0;
    e1 l0;
    MusicPagesViewLoadingTrackerConnectable m0;
    private i1 n0;
    private MobiusLoop.g<MusicPagesModel, s0> o0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return J1().d();
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public void H(boolean z) {
        this.j0.c(z);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.o0.stop();
    }

    @Override // defpackage.p69
    public MusicPageId J1() {
        Bundle D2 = D2();
        if (D2 == null) {
            D2 = new Bundle();
            r4(D2);
        }
        return (MusicPageId) D2.get("music-page-id");
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.o0.start();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        if (this.o0 != null) {
            this.m0.d(bundle);
            MusicPagesModel b = this.o0.b();
            bundle.putSerializable("loading-state", b.l());
            bundle.putInt("visible-range-start", b.x());
            bundle.putInt("visible-range-size", b.w());
            bundle.putParcelable("viewport", z3.g(b.c(), b.x(), b.w()));
            if (b.t() != null && !b.t().isEmpty()) {
                bundle.putString("text-filter", b.t());
            }
        }
    }

    @Override // defpackage.ws2
    public boolean b() {
        boolean i = this.o0.b().i();
        if (i) {
            this.j0.a();
        }
        return i;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public void c() {
        this.j0.d(true);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f, com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // defpackage.h79
    public g1 f0() {
        i1 i1Var = this.n0;
        i1Var.getClass();
        return i1Var;
    }

    @Override // defpackage.mfd
    public a g1() {
        return w.a().get(J1()).d();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.k
    public c getFlags() {
        return d.c(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return com.spotify.music.features.yourlibrary.container.d.a(J1(), d1.a(this).orNull());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return J1().d();
    }

    @Override // defpackage.j79
    public Optional<com.spotify.music.yourlibrary.interfaces.c> i2() {
        return Optional.of(n0());
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public /* synthetic */ ImmutableList l0() {
        return e.a(this);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public /* synthetic */ com.spotify.music.yourlibrary.interfaces.c n0() {
        return e.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.a(w.a().get(J1()).d());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MusicPagesModel.LoadingState loadingState;
        u4(false);
        MusicPageId J1 = J1();
        this.n0 = this.i0.b(layoutInflater, viewGroup, J1, bundle, this.m0);
        if (this.o0 == null) {
            u b = this.k0.b(J1);
            MusicPagesModel.a d = MusicPagesModel.d();
            d.g((J1 == MusicPageId.PLAYLISTS || J1 == MusicPageId.ALBUMS) && this.l0.d());
            d.i(true);
            d.l(b);
            if (!(bundle == null || (loadingState = (MusicPagesModel.LoadingState) bundle.getSerializable("loading-state")) == null)) {
                d.k(loadingState);
                d.v(bundle.getInt("visible-range-start", 0));
                d.u(bundle.getInt("visible-range-size", 0));
                y3 y3Var = (y3) bundle.getParcelable("viewport");
                if (y3Var != null) {
                    d.d(y3Var);
                }
                if (bundle.containsKey("text-filter")) {
                    d.s(bundle.getString("text-filter"));
                    d.t(true);
                    d.i(true);
                }
            }
            this.o0 = this.h0.a(this.j0, d.c());
        }
        this.o0.c(this.n0);
        return this.n0.q();
    }

    @Override // defpackage.q69
    public String x() {
        return d1.a(this).orNull();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.o0.d();
        this.n0 = null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return w.a().get(J1()).c();
    }
}
