package com.spotify.music.features.podcast.entity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.DaggerFragment;

public class PodcastEntityFragment extends DaggerFragment implements s, ToolbarConfig.d, ToolbarConfig.c, mfd, c.a {
    public static final /* synthetic */ int j0 = 0;
    t67 h0;
    d0 i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.SHOWS_AUDIO;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return c.a(k4().getString("uri", ""));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "show";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SHOWS_AUDIO, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.b(j4(), this.i0, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((u67) this.h0).a(l4(), layoutInflater, viewGroup, bundle, b3());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.j1;
    }
}
