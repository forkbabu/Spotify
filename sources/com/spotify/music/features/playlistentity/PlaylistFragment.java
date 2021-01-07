package com.spotify.music.features.playlistentity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.viewbinder.MasterViewBinder;
import com.spotify.music.features.playlistentity.viewbinder.y0;
import dagger.android.support.a;

public class PlaylistFragment extends Fragment implements s, ToolbarConfig.a, wq6, vq6, uq6, y0 {
    public static final /* synthetic */ int k0 = 0;
    MasterViewBinder g0;
    o h0;
    ys2 i0;
    j j0;

    public static PlaylistFragment K4(String str, boolean z, boolean z2, Optional<String> optional) {
        PlaylistFragment playlistFragment = new PlaylistFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_input_uri", str);
        bundle.putBoolean("open_all_songs_dialog", z);
        bundle.putBoolean("auto_play", z2);
        bundle.putString("auto_play_item", optional.orNull());
        playlistFragment.r4(bundle);
        return playlistFragment;
    }

    @Override // defpackage.vq6
    public boolean A1() {
        return k4().getBoolean("auto_play", false);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // defpackage.wq6
    public void E1() {
        k4().putBoolean("open_all_songs_dialog", false);
    }

    @Override // defpackage.wq6
    public boolean L1() {
        return k4().getBoolean("open_all_songs_dialog");
    }

    @Override // defpackage.vq6
    public void M(boolean z) {
        k4().putBoolean("auto_play", false);
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        this.g0.j(bundle);
    }

    @Override // defpackage.uq6
    public String T() {
        return k4().getString("key_algotorial_identifier");
    }

    @Override // com.spotify.music.features.playlistentity.viewbinder.y0
    public void d(String str) {
        this.i0.k(this, W2(C0707R.string.playlist_entity_title, str));
    }

    @Override // defpackage.uq6
    public void d1() {
        k4().remove("key_algotorial_identifier");
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-spotlet-free-tier-playlist";
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        this.j0.b(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.vq6
    public Optional<String> r2() {
        return Optional.fromNullable(k4().getString("auto_play_item"));
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        u4(true);
        super.s3(bundle);
        this.g0.i(bundle);
        this.g0.k(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(new b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        d0 f = this.g0.f();
        if (e3()) {
            ToolbarConfig.b(j4(), f, menu);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.g0.h(B2(), b3());
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.L0;
    }
}
