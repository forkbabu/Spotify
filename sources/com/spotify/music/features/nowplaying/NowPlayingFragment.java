package com.spotify.music.features.nowplaying;

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
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.nowplaying.container.f;
import com.spotify.rxjava2.p;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class NowPlayingFragment extends LifecycleListenableFragment implements s, mfd, c.a {
    public f h0;
    public io.reactivex.a i0;
    public y j0;
    private final p k0 = new p();

    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ NowPlayingFragment a;

        a(NowPlayingFragment nowPlayingFragment) {
            this.a = nowPlayingFragment;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            androidx.fragment.app.c B2 = this.a.B2();
            if (B2 != null) {
                B2.finish();
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        f fVar = this.h0;
        if (fVar != null) {
            fVar.stop();
            this.k0.a();
            super.H3();
            return;
        }
        h.k("nowPlayingPageElement");
        throw null;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        p pVar = this.k0;
        io.reactivex.a aVar = this.i0;
        if (aVar != null) {
            y yVar = this.j0;
            if (yVar != null) {
                pVar.b(aVar.A(yVar).subscribe(new a(this)));
                f fVar = this.h0;
                if (fVar != null) {
                    fVar.start();
                } else {
                    h.k("nowPlayingPageElement");
                    throw null;
                }
            } else {
                h.k("mainScheduler");
                throw null;
            }
        } else {
            h.k("playbackStoppedTrigger");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.NOWPLAYING;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.h0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.NOWPLAYING.name();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.NOWPLAYING, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        f fVar = this.h0;
        if (fVar != null) {
            Context l4 = l4();
            h.d(l4, "requireContext()");
            h.c(viewGroup);
            fVar.i(l4, viewGroup, layoutInflater);
            return fVar.b();
        }
        h.k("nowPlayingPageElement");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.I0;
    }
}
