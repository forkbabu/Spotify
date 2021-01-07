package com.spotify.music.cyoa.game;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;

public class CyoaGameFragment extends LifecycleListenableFragment implements s, c.a {
    t h0;
    s i0;
    private final String j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Choose your own adventure";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.i0.f(this.j0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.i0.h();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        StringBuilder V0 = je.V0("spotify:cyoa:");
        V0.append(this.j0);
        return c.a(V0.toString());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.J.getName();
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
        this.h0.a(layoutInflater, viewGroup);
        return this.h0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.J;
    }
}
