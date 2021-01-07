package com.spotify.music.features.datasavermode.settings;

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
import com.spotify.music.navigation.NavigationItem;

public class DataSaverModeSettingsFragment extends LifecycleListenableFragment implements h, s, mfd, c.a, NavigationItem {
    g h0;
    vv4 i0;
    private tv4 j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.data_saver_mode_settings_title);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.h0.c(this);
    }

    @Override // com.spotify.music.features.datasavermode.settings.h
    public void P0(boolean z, boolean z2) {
        this.j0.b().d(z, z2);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.h0.d();
        super.P3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        tv4 tv4 = (tv4) l70.o(view, tv4.class);
        this.j0 = tv4;
        uv4 b = tv4.b();
        g gVar = this.h0;
        gVar.getClass();
        b.g(new a(gVar));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.DATASAVERMODE_SETTINGS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.V;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "data-saver-mode-settings";
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.HOME;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DATASAVERMODE_SETTINGS, null);
    }

    @Override // com.spotify.music.features.datasavermode.settings.h
    public void v2(boolean z) {
        this.j0.c(z);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.i0.a(l4(), viewGroup).getView();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.N;
    }
}
