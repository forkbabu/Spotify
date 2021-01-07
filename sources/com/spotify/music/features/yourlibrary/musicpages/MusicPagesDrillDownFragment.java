package com.spotify.music.features.yourlibrary.musicpages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.android.flags.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.datasource.z3;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.pages.v;
import com.spotify.music.features.yourlibrary.musicpages.pages.w;
import com.spotify.music.features.yourlibrary.musicpages.view.MusicPagesViewLoadingTrackerConnectable;
import com.spotify.music.features.yourlibrary.musicpages.view.a1;
import com.spotify.music.features.yourlibrary.musicpages.view.b1;
import com.spotify.music.features.yourlibrary.musicpages.view.d1;
import com.spotify.music.features.yourlibrary.musicpages.view.g1;
import com.spotify.music.libs.viewuri.c;
import java.util.Map;

public class MusicPagesDrillDownFragment extends LifecycleListenableFragment implements c.a, mfd, s, p69, q69, k, ToolbarConfig.b, ToolbarConfig.a, i79, h79, ws2 {
    h1 h0;
    b1 i0;
    g1 j0;
    d1 k0;
    w l0;
    MusicPagesViewLoadingTrackerConnectable m0;
    ys2 n0;
    private MobiusLoop.g<MusicPagesModel, s0> o0;
    private MusicPageId p0;
    private a1 q0;
    private c r0;

    public static MusicPagesDrillDownFragment K4(com.spotify.android.flags.c cVar, String str, String str2, String str3) {
        MusicPagesDrillDownFragment musicPagesDrillDownFragment = new MusicPagesDrillDownFragment();
        Bundle D2 = musicPagesDrillDownFragment.D2();
        if (D2 == null) {
            D2 = new Bundle();
            musicPagesDrillDownFragment.r4(D2);
        }
        D2.putString("username", str);
        Bundle D22 = musicPagesDrillDownFragment.D2();
        if (D22 == null) {
            D22 = new Bundle();
            musicPagesDrillDownFragment.r4(D22);
        }
        D22.putString("uri", str2);
        if (!MoreObjects.isNullOrEmpty(str3)) {
            Bundle D23 = musicPagesDrillDownFragment.D2();
            if (D23 == null) {
                D23 = new Bundle();
                musicPagesDrillDownFragment.r4(D23);
            }
            D23.putString("title", str3);
        }
        d.a(musicPagesDrillDownFragment, cVar);
        return musicPagesDrillDownFragment;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return this.l0.b(J1()).l() != PageAction.NO_ACTION;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.o0.stop();
        this.n0.I1(null);
    }

    @Override // defpackage.p69
    public MusicPageId J1() {
        if (this.p0 == null) {
            String x = x();
            MusicPageId musicPageId = MusicPageId.SONGS;
            UnmodifiableIterator<Map.Entry<MusicPageId, v>> it = w.a().entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<MusicPageId, v> next = it.next();
                if (next.getValue().a().contains(l0.z(x).q())) {
                    musicPageId = next.getKey();
                    break;
                }
            }
            this.p0 = musicPageId;
        }
        return this.p0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.o0.start();
        this.n0.I1(this);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.m0.d(bundle);
        MusicPagesModel b = this.o0.b();
        bundle.putSerializable("loading-state", b.l());
        bundle.putInt("visible-range-start", b.x());
        bundle.putInt("visible-range-size", b.w());
        bundle.putParcelable("viewport", z3.g(b.c(), b.x(), b.w()));
        if (b.e().isPresent()) {
            bundle.putBoolean("drilldown-header-expanded", b.e().get().booleanValue());
            bundle.putBoolean("text-filter-visible", b.u());
            bundle.putString("text-filter", b.t());
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.o0.c(this.q0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.o0.d();
        super.P3();
    }

    @Override // defpackage.i79
    public void a1() {
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
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

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // defpackage.h79
    public g1 f0() {
        a1 a1Var = this.q0;
        a1Var.getClass();
        return a1Var;
    }

    @Override // defpackage.mfd
    public a g1() {
        return w.a().get(J1()).d();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.k
    public com.spotify.android.flags.c getFlags() {
        return d.c(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        if (this.r0 == null) {
            this.r0 = com.spotify.music.features.yourlibrary.container.d.a(J1(), x());
        }
        return this.r0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return J1().d();
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

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        super.v3(menu, menuInflater);
        a1 a1Var = this.q0;
        if (a1Var != null) {
            d0 q = a1Var.q();
            if (e3()) {
                ToolbarConfig.b(j4(), q, menu);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MusicPagesModel.LoadingState loadingState;
        u4(true);
        MusicPageId J1 = J1();
        this.q0 = this.i0.b(layoutInflater, viewGroup, J1, bundle, this.m0);
        if (this.o0 == null) {
            u b = this.l0.b(J1);
            Optional<String> a = d1.a(this);
            if (a.isPresent()) {
                u.a s = b.s();
                s.s(Optional.of(a.get()));
                b = s.a();
            }
            Bundle D2 = D2();
            if (D2 == null) {
                D2 = new Bundle();
                r4(D2);
            }
            Optional fromNullable = Optional.fromNullable(D2.getString("title"));
            if (fromNullable.isPresent()) {
                u.a s2 = b.s();
                s2.r((String) fromNullable.get());
                b = s2.a();
            }
            MusicPagesModel.a d = MusicPagesModel.d();
            d.l(b);
            d.f(true);
            if (!(bundle == null || (loadingState = (MusicPagesModel.LoadingState) bundle.getSerializable("loading-state")) == null)) {
                d.k(loadingState);
                d.v(bundle.getInt("visible-range-start", 0));
                d.u(bundle.getInt("visible-range-size", 0));
                y3 y3Var = (y3) bundle.getParcelable("viewport");
                if (y3Var != null) {
                    d.d(y3Var);
                }
                if (bundle.containsKey("drilldown-header-expanded")) {
                    boolean z = bundle.getBoolean("text-filter-visible");
                    d.e(Optional.of(Boolean.valueOf(bundle.getBoolean("drilldown-header-expanded"))));
                    d.t(z);
                    d.s(bundle.getString("text-filter"));
                    d.h(z);
                }
            }
            this.o0 = this.h0.a(this.j0, d.c());
        }
        this.k0.a(this.o0.b().u());
        return this.q0.r();
    }

    @Override // defpackage.q69
    public String x() {
        Optional<String> a = d1.a(this);
        if (a.isPresent()) {
            return a.get();
        }
        throw new IllegalStateException("Missing drill down uri");
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.q0 = null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        if (this.k0 == null || this.o0.b().u()) {
            return ToolbarConfig.Visibility.ONLY_MAKE_ROOM;
        }
        return this.k0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return w.a().get(J1()).c();
    }
}
