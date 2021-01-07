package com.spotify.music.features.freetierartist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.freetierartist.datasource.v;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import defpackage.d42;

public class ArtistFragment extends LifecycleListenableFragment implements s, d0, mfd, mf3, ToolbarConfig.d, ToolbarConfig.c, b4<qfa> {
    String h0;
    boolean i0;
    wlf<l> j0;
    if3 k0;
    uf3 l0;
    t0<io.reactivex.s<v>> m0;
    PageLoaderView.a<io.reactivex.s<v>> n0;
    m o0;
    b42 p0;
    of3 q0;
    m r0;
    jf3 s0;
    private PageLoaderView<io.reactivex.s<v>> t0;

    public static ArtistFragment K4(String str, c cVar, boolean z) {
        c.b bVar = ViewUris.R0;
        str.getClass();
        bVar.b(str);
        ArtistFragment artistFragment = new ArtistFragment();
        Bundle bundle = new Bundle();
        bundle.putString("artist_view_uri", str);
        bundle.putBoolean("is_autoplay_uri", z);
        artistFragment.r4(bundle);
        d.a(artistFragment, cVar);
        return artistFragment;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.artist_default_title);
    }

    @Override // defpackage.mf3
    public void I0(jf3 jf3) {
        this.s0 = jf3;
        u4(true);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        this.l0.a();
        super.O3();
        this.m0.start();
        this.t0.j0(b3(), this.m0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.m0.stop();
        this.l0.b();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        jf3 jf3 = this.s0;
        if (jf3 != null) {
            this.k0.k(this.h0, a0Var, jf3, this.q0);
            this.t0.announceForAccessibility(String.format(l4().getString(C0707R.string.artist_accessibility_title), this.s0.h()));
        }
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FREE_TIER_ARTIST;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.R0.b(this.h0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.FREE_TIER_ARTIST.name();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(qfa qfa) {
        qfa qfa2 = qfa;
        String b = qfa2.b();
        String a = qfa2.a();
        if (l0.z(b).q() == LinkType.TRACK) {
            d42.f w = this.p0.a(b, a, this.h0).a(getViewUri()).t(true).g(false).r(true).w(false);
            w.i(false);
            w.l(true);
            w.q(false);
            w.c(false);
            return w.b();
        }
        Assertion.p("Unsupported uri for building context menu. Only track and episode supported. was: " + b);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
        D2().remove("is_autoplay_uri");
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.t0 = this.n0.a(l4());
        if (!this.i0) {
            A().a(this.o0);
            A().a(this.r0);
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREE_TIER_ARTIST, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        super.v3(menu, menuInflater);
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.t0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        if (!this.i0) {
            A().c(this.o0);
            A().c(this.r0);
        }
        super.x3();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.g0;
    }
}
