package com.spotify.music.features.browse;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.pageloader.PageLoaderView;

public class BrowseDrillDownFragment extends Fragment implements s, NavigationItem, mfd, c.a, ToolbarConfig.b, ToolbarConfig.a {
    b g0;
    bj9 h0;
    cbc<b91> i0;
    PageLoaderView.a<b91> j0;
    d k0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return this.k0.a();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return cg4.d(this.g0.b());
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return cg4.e(this.g0.b());
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
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.h0);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<b91> a = this.j0.a(l4());
        a.j0(b3(), this.i0.get());
        return a;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.SHOW;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a0;
    }
}
