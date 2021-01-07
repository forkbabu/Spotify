package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.yourlibrary.interfaces.e;
import com.spotify.music.yourlibrary.interfaces.f;
import dagger.android.support.DaggerFragment;

public class FollowedPodcastsTabFragment extends DaggerFragment implements s, f {
    hlc h0;
    c i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return this.i0.g();
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public /* synthetic */ void H(boolean z) {
        e.c(this, z);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public void c() {
        this.h0.c();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.YOURLIBRARY_SHOWS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.u1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "podcast_following_tab";
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public /* synthetic */ ImmutableList l0() {
        return e.a(this);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.f
    public /* synthetic */ com.spotify.music.yourlibrary.interfaces.c n0() {
        return e.b(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.YOURLIBRARY_SHOWS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.h0.a(l4(), this, layoutInflater, viewGroup);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.F;
    }
}
