package com.spotify.music.features.premiumdestination;

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
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.music.features.premiumdestination.domain.l;
import com.spotify.music.features.premiumdestination.domain.m;
import com.spotify.music.features.premiumdestination.view.a1;
import com.spotify.music.features.premiumdestination.view.z0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.navigation.x;
import dagger.android.support.a;

public class PremiumPageFragment extends LifecycleListenableFragment implements s, c.a, ToolbarConfig.d, ToolbarConfig.c, x {
    m h0;
    b61 i0;
    e61 j0;
    t k0;
    wi7 l0;
    bj7 m0;
    private MobiusLoop.g<l, k> n0;

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.n0.stop();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.n0.start();
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.b1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "premium-hubs-page";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.b1.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z0 z0Var = new z0(this.j0, this.i0, this.k0, new a1(R2()), F2(), this.l0, this.m0);
        MobiusLoop.g<l, k> a = this.h0.a(l.a(m.b(false)).build());
        this.n0 = a;
        a.c(z0Var);
        return z0Var.e();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.n0.d();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.X0;
    }
}
