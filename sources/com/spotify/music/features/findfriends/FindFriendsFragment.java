package com.spotify.music.features.findfriends;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import io.reactivex.y;

public class FindFriendsFragment extends Fragment implements s, mfd, c.a {
    q0 g0;
    zac h0;
    x0 i0;
    y j0;
    private t0<io.reactivex.s<p0>> k0;
    private w0 l0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getResources().getString(C0707R.string.find_friends_flow_title);
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        t0<io.reactivex.s<p0>> t0Var = this.k0;
        if (t0Var != null) {
            t0Var.stop();
        }
    }

    public /* synthetic */ s0 K4(io.reactivex.s sVar) {
        this.l0 = this.i0.b(sVar);
        u4(true);
        return this.l0;
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        t0<io.reactivex.s<p0>> t0Var = this.k0;
        if (t0Var != null) {
            t0Var.start();
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FINDFRIENDS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.h;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "spotify:findfriends";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FINDFRIENDS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.k0 = this.h0.a(ObservableLoadable.a(this.g0.a().o0(this.j0)));
        PageLoaderView.a b = this.h0.b(ViewUris.h, u0());
        b.e(new p(this));
        PageLoaderView a = b.a(layoutInflater.getContext());
        n b3 = b3();
        t0<io.reactivex.s<p0>> t0Var = this.k0;
        t0Var.getClass();
        a.j0(b3, t0Var);
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.b0;
    }
}
