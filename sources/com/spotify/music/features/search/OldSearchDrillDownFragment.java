package com.spotify.music.features.search;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import dagger.android.support.a;

public class OldSearchDrillDownFragment extends LifecycleListenableFragment implements s, NavigationItem, c.a {
    jh8 h0;
    boolean i0;
    e61 j0;
    u98 k0;
    mf8 l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("search_drilldown_state", this.l0.h());
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.l0.b();
        this.l0.i();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.l0.j();
        this.l0.e();
        this.l0.f();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(j4().getClassLoader());
            Parcelable parcelable = bundle.getParcelable("search_drilldown_state");
            parcelable.getClass();
            this.l0.g(parcelable);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.h0.a();
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
        return ij9.c(this.k0);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.j0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return this.i0 ? kfd.i : kfd.f1;
    }
}
