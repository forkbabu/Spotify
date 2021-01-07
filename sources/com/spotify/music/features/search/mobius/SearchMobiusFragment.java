package com.spotify.music.features.search.mobius;

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

public class SearchMobiusFragment extends LifecycleListenableFragment implements ToolbarConfig.a, s, NavigationItem, x, l.c, c.a {
    boolean h0;
    w51 i0;
    xg8 j0;
    q0 k0;
    c8b l0;
    ys2 m0;
    String n0;

    @Override // com.spotify.music.libs.search.view.l.c
    public boolean B1() {
        this.k0.k();
        return false;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.search_title, l3() ? this.k0.a() : this.n0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.k0.j();
        this.k0.l();
        this.m0.I1(null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.k0.i();
        this.m0.I1(this.k0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("search_state", this.k0.m());
        Bundle D2 = D2();
        if (D2 != null) {
            D2.putParcelable("EXTRA_TRANSITION_PARAMS", null);
        }
        super.N3(bundle);
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
        return pxa.a(l3() ? this.k0.a() : this.n0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        if (this.h0) {
            return NavigationItem.NavigationGroup.FREE_TIER_COLLECTION;
        }
        return NavigationItem.NavigationGroup.FIND;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.k0.d(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(this.h0 ? PageIdentifiers.ASSISTED_CURATION_SEARCH : PageIdentifiers.SEARCH, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wg8 b = ((bh8) this.j0).b(viewGroup);
        b61 b61 = new b61(this.i0, b);
        yg8 yg8 = (yg8) b;
        yg8.v(new c(this));
        if (bundle != null) {
            bundle.setClassLoader(j4().getClassLoader());
            Parcelable parcelable = bundle.getParcelable("search_state");
            parcelable.getClass();
            this.k0.g(b61, b, parcelable);
        } else {
            this.k0.f(b61, b);
        }
        this.l0.b(b);
        return yg8.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        this.k0.h();
        super.y3();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return this.h0 ? kfd.i : kfd.f1;
    }
}
