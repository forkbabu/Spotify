package com.spotify.music.cyoa.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;

public class CyoaHomeFragment extends LifecycleListenableFragment implements ToolbarConfig.d, s, c.a {
    f h0;
    j i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.i0.a();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.i0.b();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return c.a("spotify:cyoa:home");
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.J.getName() + "-home";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DEBUG, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.h0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.J;
    }
}
