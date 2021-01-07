package com.spotify.music.concat;

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
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.a;
import defpackage.js2;

public class ConcatFragment extends LifecycleListenableFragment implements s, c.a {
    d h0;
    private MobiusLoop.g<ls2, ks2> i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Concat";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.i0.stop();
        super.H3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.i0.start();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.i2;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "music-feature-concat";
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
        g gVar = new g(layoutInflater, viewGroup);
        c cVar = c.a;
        d dVar = this.h0;
        m f = i.f();
        f.h(js2.b.class, new ms2(dVar));
        f.h(js2.a.class, new qs2(dVar));
        MobiusLoop.g<ls2, ks2> b = z42.b(i.c(cVar, f.i()), new ls2(""));
        this.i0 = b;
        b.c(gVar);
        return gVar.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        this.i0.d();
        super.y3();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.G;
    }
}
