package com.spotify.music.sociallistening.participantlist.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import io.reactivex.s;
import io.reactivex.y;

public class ParticipantListFragment extends LifecycleListenableFragment implements c.a, mfd, j {
    public static final /* synthetic */ int n0 = 0;
    xcd h0;
    zac i0;
    l j0;
    y k0;
    g4d l0;
    private t0<s<edd>> m0;

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.m0.stop();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.m0.start();
    }

    @Override // com.spotify.music.sociallistening.participantlist.impl.j
    public void Z1() {
        j4().onBackPressed();
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.SOCIAL_LISTENING_PARTICIPANTLIST;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.n2;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.l0.b(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m0 = this.i0.a(ObservableLoadable.a(this.h0.d().o0(this.k0).Q(d.a)));
        PageLoaderView.a b = this.i0.b(ViewUris.n2, ij9.b(PageIdentifiers.SOCIAL_LISTENING_PARTICIPANTLIST, null));
        b.e(new e(this));
        PageLoaderView a = b.a(l4());
        a.j0(b3(), this.m0);
        return a;
    }
}
