package com.spotify.music.features.freetiertrack;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import com.spotify.music.libs.viewartistscontextmenu.ui.c;
import defpackage.of3;
import java.util.List;

public class FreeTierTrackFragment extends LifecycleListenableFragment implements s, mf3, d0, ToolbarConfig.d, c, mfd {
    public static final /* synthetic */ int q0 = 0;
    ka5 h0;
    aa5 i0;
    g9b j0;
    wlf<a> k0;
    if3 l0;
    private boolean m0;
    private com.spotify.music.libs.viewuri.c n0;
    private Uri o0;
    jf3 p0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.track_default_title);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.j0.pause();
        super.H3();
    }

    @Override // defpackage.mf3
    public void I0(jf3 jf3) {
        this.p0 = jf3;
        u4(true);
        androidx.fragment.app.c B2 = B2();
        if (B2 != null) {
            B2.invalidateOptionsMenu();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0.resume();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.h0.d(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.i0.o(this.h0, this, this.n0.toString(), this.o0, D2().getString("share_id"), SnackbarConfiguration.builder((int) C0707R.string.on_demand_share_daily_track_limit_education_label).build());
        D2().remove("share_id");
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.i0.p();
    }

    @Override // androidx.fragment.app.Fragment
    public void R3(Bundle bundle) {
        super.R3(bundle);
        this.h0.e(bundle);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        if (this.p0 != null) {
            of3.a a = of3.a();
            a.a(l4().getString(C0707R.string.track_default_title));
            a.f(SpotifyIconV2.TRACK);
            a.c(true);
            a.h(true);
            a.j(true);
            this.l0.k(this.n0.toString(), a0Var, this.p0, a.build());
        }
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FREE_TIER_TRACK;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return this.n0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.FREE_TIER_TRACK.name();
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

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        this.n0 = (com.spotify.music.libs.viewuri.c) k4().getParcelable("track_view_uri");
        this.m0 = k4().getBoolean("is_autoplay", false);
        String string = D2().getString("external_referrer", "");
        this.o0 = !TextUtils.isEmpty(string) ? Uri.parse(string) : Uri.EMPTY;
        dagger.android.support.a.a(this);
        super.p3(context);
        D2().remove("is_autoplay");
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREE_TIER_TRACK, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.h0.a();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.l0;
    }
}
