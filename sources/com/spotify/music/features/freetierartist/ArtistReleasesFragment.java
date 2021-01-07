package com.spotify.music.features.freetierartist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

public class ArtistReleasesFragment extends LifecycleListenableFragment implements s, c.a, mfd {
    public static final /* synthetic */ int m0 = 0;
    private c h0;
    private String i0;
    e61 j0;
    k75 k0;
    wlf<n> l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        String str = this.i0;
        return str == null ? context.getString(C0707R.string.artist_releases_default_title) : str;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.k0.d(this.h0.toString());
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.k0.e();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.h0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE.name();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        Bundle k4 = k4();
        c.b bVar = ViewUris.R0;
        String string = k4.getString("view_uri");
        string.getClass();
        this.h0 = bVar.b(string);
        this.i0 = k4.getString("title");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREE_TIER_ARTIST_SUBPAGE, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.j0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.g;
    }
}
