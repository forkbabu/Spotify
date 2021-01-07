package com.spotify.music.features.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.pageloader.PageLoaderView;
import dagger.android.support.a;

public class SearchDrillDownFragment extends Fragment implements s, NavigationItem, c.a {
    jh8 g0;
    u98 h0;
    gg8 i0;
    ig8 j0;
    cbc<b91> k0;
    PageLoaderView.a<b91> l0;
    boolean m0;
    wlf<w51> n0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.g0.a();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.FIND;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.h0);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<b91> a = this.l0.a(l4());
        a.j0(b3(), this.k0.get());
        this.j0.setTitle(this.i0.a());
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return this.m0 ? kfd.i : kfd.f1;
    }
}
