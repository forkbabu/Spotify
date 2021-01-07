package com.spotify.music.features.queue.v2;

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
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.player.model.PlayerQueue;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class QueueFragmentV2 extends DaggerFragment implements mfd, s {
    public t0<io.reactivex.s<PlayerQueue>> h0;
    public PageLoaderView.a<io.reactivex.s<PlayerQueue>> i0;
    public m j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        t0<io.reactivex.s<PlayerQueue>> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        t0<io.reactivex.s<PlayerQueue>> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.start();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.NOWPLAYING_QUEUE.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.NOWPLAYING_QUEUE, null);
        h.d(b, "PageViewObservable.creat…tifiers.NOWPLAYING_QUEUE)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<io.reactivex.s<PlayerQueue>> aVar = this.i0;
        if (aVar != null) {
            m mVar = this.j0;
            if (mVar != null) {
                aVar.e(new h(new QueueFragmentV2$onCreateView$1(mVar)));
                PageLoaderView<io.reactivex.s<PlayerQueue>> a = aVar.a(l4());
                n b3 = b3();
                t0<io.reactivex.s<PlayerQueue>> t0Var = this.h0;
                if (t0Var != null) {
                    a.j0(b3, t0Var);
                    h.d(a, "pageLoaderViewBuilder\n  …cycleOwner, pageLoader) }");
                    return a;
                }
                h.k("pageLoader");
                throw null;
            }
            h.k("pageFactory");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.R0;
        h.d(ifd, "FeatureIdentifiers.PLAY_QUEUE");
        return ifd;
    }
}
