package com.spotify.music.features.browse;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import com.spotify.music.sociallistening.participantlist.impl.m;

public class BrowseFragment extends LifecycleListenableFragment implements s, NavigationItem, x, mfd, ToolbarConfig.b, d0 {
    String h0;
    bj9 i0;
    ng4 j0;
    nc4 k0;
    m9b l0;

    public static BrowseFragment K4(String str, String str2, String str3, c cVar) {
        BrowseFragment browseFragment = new BrowseFragment();
        Bundle D2 = browseFragment.D2();
        if (D2 == null) {
            D2 = new Bundle();
            browseFragment.r4(D2);
        }
        D2.putString("username", str2);
        D2.putString("title", str);
        D2.putString("view_uri", str3);
        d.a(browseFragment, cVar);
        m.d(browseFragment, bu9.w);
        return browseFragment;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        this.j0.B();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return this.j0.a();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.l0.pause();
        super.H3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.l0.resume();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("browse_hubs_state", this.k0.h());
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.k0.e();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.k0.f();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        if (bundle != null) {
            bundle.setClassLoader(j4().getClassLoader());
            Parcelable parcelable = bundle.getParcelable("browse_hubs_state");
            parcelable.getClass();
            this.k0.g(parcelable);
        }
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        this.j0.z(a0Var);
    }

    @Override // defpackage.mfd
    public a g1() {
        return cg4.d(this.h0);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return cg4.e(this.h0);
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

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.i0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
        super.v3(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.j0.b();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a0;
    }
}
