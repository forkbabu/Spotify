package com.spotify.music.features.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import dagger.android.support.a;

public class SearchFragment extends LifecycleListenableFragment implements ToolbarConfig.a, s, NavigationItem, x, l.c, c.a {
    String h0;
    boolean i0;
    w51 j0;
    xg8 k0;
    pf8 l0;
    c8b m0;
    ys2 n0;
    private wg8 o0;
    private b61 p0;
    private of8 q0;

    @Override // com.spotify.music.libs.search.view.l.c
    public boolean B1() {
        this.q0.s();
        return false;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.search_title, l3() ? this.q0.f() : this.h0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.q0.q();
        this.q0.r();
        this.q0.t();
        this.n0.I1(null);
        Bundle D2 = D2();
        if (D2 != null) {
            D2.putParcelable("EXTRA_TRANSITION_PARAMS", null);
        }
    }

    public /* synthetic */ void K4() {
        this.q0.m();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.q0.p();
        this.q0.o();
        this.n0.I1(this.q0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("search_state", this.q0.v());
        Bundle D2 = D2();
        if (D2 != null) {
            D2.putParcelable("EXTRA_TRANSITION_PARAMS", null);
        }
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(j4().getClassLoader());
            Parcelable parcelable = bundle.getParcelable("search_state");
            parcelable.getClass();
            this.q0.u(parcelable);
        }
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return pxa.a(l3() ? this.q0.f() : this.h0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        if (this.i0) {
            return NavigationItem.NavigationGroup.FREE_TIER_COLLECTION;
        }
        return NavigationItem.NavigationGroup.FIND;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.q0.l(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(this.i0 ? PageIdentifiers.ASSISTED_CURATION_SEARCH : PageIdentifiers.SEARCH, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wg8 b = ((bh8) this.k0).b(viewGroup);
        this.o0 = b;
        b61 b61 = new b61(this.j0, b);
        this.p0 = b61;
        this.q0 = this.l0.b(b61, this.o0);
        this.o0.v(new a(this));
        this.m0.b(this.o0);
        return this.o0.b();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return this.i0 ? kfd.i : kfd.f1;
    }
}
