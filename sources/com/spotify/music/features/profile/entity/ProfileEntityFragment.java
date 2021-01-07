package com.spotify.music.features.profile.entity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import io.reactivex.y;

public class ProfileEntityFragment extends Fragment implements s, mfd, ToolbarConfig.b, c.a, hq7 {
    public static final /* synthetic */ int o0 = 0;
    zac g0;
    bp7 h0;
    s i0;
    boolean j0;
    y k0;
    private t0<io.reactivex.s<np7>> l0;
    private r m0;
    private final Supplier<c> n0 = MoreObjects.memoize(new a(this));

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return !(!this.j0 && x.f(j4()));
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.l0.stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void J3(Menu menu) {
        r rVar = this.m0;
        if (rVar != null) {
            ToolbarConfig.b(j4(), rVar, menu);
        }
    }

    public /* synthetic */ s0 K4(io.reactivex.s sVar) {
        this.m0 = this.i0.b(sVar);
        u4(true);
        return this.m0;
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.l0.start();
    }

    @Override // defpackage.hq7
    public String b2() {
        String string = k4().getString("key_profile_uri");
        string.getClass();
        return string;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PROFILE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.n0.get();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        super.p3(context);
        dagger.android.support.a.a(this);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PROFILE, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String r = l0.z(D2().getString("key_profile_uri")).r();
        r.getClass();
        String string = k4().getString("key_current_username");
        string.getClass();
        this.l0 = this.g0.a(ObservableLoadable.a(this.h0.d(r, string).o0(this.k0).N(b.a).Q(d.a)));
        PageLoaderView.a b = this.g0.b(getViewUri(), u0());
        b.e(new c(this));
        PageLoaderView a = b.a(layoutInflater.getContext());
        a.j0(b3(), this.l0);
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.z1;
    }
}
