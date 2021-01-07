package com.spotify.music.features.album;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
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
import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.remoteconfig.d5;
import defpackage.d42;
import java.util.List;

public class AlbumFragment extends LifecycleListenableFragment implements s, mfd, ToolbarConfig.a, ToolbarConfig.d, d0, mf3, c, b4<qfa>, c04 {
    String h0;
    wlf<c> i0;
    if3 j0;
    of3 k0;
    uf3 l0;
    PageLoaderView.a<b91> m0;
    t0<b91> n0;
    b42 o0;
    m p0;
    boolean q0;
    m r0;
    d5 s0;
    jf3 t0;
    private PageLoaderView<b91> u0;
    private a0 v0;

    public static AlbumFragment K4(String str, com.spotify.android.flags.c cVar, boolean z, String str2) {
        ViewUris.P0.b(str);
        AlbumFragment albumFragment = new AlbumFragment();
        Bundle F = je.F("album_view_uri", str, "autoplay_track_uri", str2);
        F.putBoolean("is_autoplay_uri", z);
        albumFragment.r4(F);
        d.a(albumFragment, cVar);
        return albumFragment;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.album_title_default);
    }

    @Override // defpackage.mf3
    public void I0(jf3 jf3) {
        this.t0 = jf3;
        u4(true);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
    }

    public /* synthetic */ void L4() {
        a0 a0Var = this.v0;
        if (a0Var != null) {
            a0Var.f();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        this.l0.a();
        super.O3();
        this.n0.start();
        this.u0.j0(b3(), this.n0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.n0.stop();
        this.l0.b();
    }

    @Override // defpackage.c04
    public void c2() {
        Bundle D2 = D2();
        if (D2 != null) {
            D2.remove("is_autoplay_uri");
            D2.remove("autoplay_track_uri");
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        jf3 jf3 = this.t0;
        if (jf3 != null) {
            this.j0.k(this.h0, a0Var, jf3, this.k0);
            this.v0 = a0Var;
            this.u0.announceForAccessibility(String.format(l4().getString(C0707R.string.album_accessibility_title), this.t0.h()));
        }
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FREE_TIER_ALBUM;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.P0.b(this.h0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.FREE_TIER_ALBUM.name();
    }

    @Override // com.spotify.music.libs.viewartistscontextmenu.ui.c
    public void j2(List<mab> list, ViewArtistsContextMenuDialogFragment.b bVar) {
        ViewArtistsContextMenuDialogFragment.a aVar = new ViewArtistsContextMenuDialogFragment.a();
        aVar.e(list);
        aVar.b(C0707R.id.context_menu_tag);
        aVar.c(bVar);
        aVar.d(l4().getString(C0707R.string.context_menu_artists_list_title));
        aVar.a().Y4(Q2(), "ViewArtistsContextMenuDialogFragment");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(qfa qfa) {
        qfa qfa2 = qfa;
        String b = qfa2.b();
        String a = qfa2.a();
        if (l0.z(b).q() == LinkType.TRACK) {
            d42.f w = this.o0.a(b, a, this.h0).a(getViewUri()).t(false).g(true).r(true).w(false);
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
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (!this.q0) {
            A().a(this.p0);
            A().a(this.r0);
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREE_TIER_ALBUM, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<b91> a = this.m0.a(l4());
        this.u0 = a;
        return a;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        if (!this.q0) {
            A().c(this.p0);
            A().c(this.r0);
        }
        super.x3();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return this.s0.a() ? ToolbarConfig.Visibility.HIDE : ToolbarConfig.Visibility.SHOW;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.f0;
    }
}
