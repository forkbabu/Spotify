package com.spotify.music.features.nowplayingbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.features.nowplayingbar.domain.f;
import com.spotify.music.features.nowplayingbar.view.v0;
import com.spotify.music.features.nowplayingbar.view.w0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class NowPlayingBarFragment extends LifecycleListenableFragment implements s, mfd, c.a {
    public static final /* synthetic */ int m0 = 0;
    public c h0;
    public w0 i0;
    private MobiusLoop.g<f, d> j0;
    private v0 k0;
    private com.spotify.mobile.android.ui.view.anchorbar.d l0;

    public static final void K4(NowPlayingBarFragment nowPlayingBarFragment, boolean z) {
        com.spotify.mobile.android.ui.view.anchorbar.d dVar = nowPlayingBarFragment.l0;
        if (dVar != null) {
            dVar.setVisible(z);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        MobiusLoop.g<f, d> gVar = this.j0;
        if (gVar != null) {
            gVar.stop();
            super.H3();
            return;
        }
        h.k("mobiusController");
        throw null;
    }

    public final void L4(com.spotify.mobile.android.ui.view.anchorbar.d dVar) {
        h.e(dVar, "anchorVisibility");
        this.l0 = dVar;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        MobiusLoop.g<f, d> gVar = this.j0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("mobiusController");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.spotify.music.features.nowplayingbar.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O3() {
        /*
            r4 = this;
            super.O3()
            com.spotify.mobius.MobiusLoop$g<com.spotify.music.features.nowplayingbar.domain.f, com.spotify.music.features.nowplayingbar.domain.d> r0 = r4.j0
            r1 = 0
            if (r0 == 0) goto L_0x0026
            com.spotify.music.features.nowplayingbar.NowPlayingBarFragment$onStart$1 r2 = com.spotify.music.features.nowplayingbar.NowPlayingBarFragment$onStart$1.a
            if (r2 == 0) goto L_0x0012
            com.spotify.music.features.nowplayingbar.b r3 = new com.spotify.music.features.nowplayingbar.b
            r3.<init>(r2)
            r2 = r3
        L_0x0012:
            ea2 r2 = (defpackage.ea2) r2
            com.spotify.music.features.nowplayingbar.view.v0 r3 = r4.k0
            if (r3 == 0) goto L_0x0020
            com.spotify.mobius.g r1 = com.spotify.mobius.extras.a.a(r2, r3)
            r0.c(r1)
            return
        L_0x0020:
            java.lang.String r0 = "views"
            kotlin.jvm.internal.h.k(r0)
            throw r1
        L_0x0026:
            java.lang.String r0 = "mobiusController"
            kotlin.jvm.internal.h.k(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.nowplayingbar.NowPlayingBarFragment.O3():void");
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        MobiusLoop.g<f, d> gVar = this.j0;
        if (gVar != null) {
            gVar.d();
            super.P3();
            return;
        }
        h.k("mobiusController");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.e0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR.name();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.NOWPLAYING_NOWPLAYINGBAR, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        c cVar = this.h0;
        if (cVar != null) {
            this.j0 = cVar.a();
            w0 w0Var = this.i0;
            if (w0Var != null) {
                v0 b = w0Var.b(layoutInflater, viewGroup, new a(new NowPlayingBarFragment$onCreateView$1(this)));
                h.d(b, "viewsFactory.create(infl…changeSnackbarVisibility)");
                this.k0 = b;
                if (b != null) {
                    View o = b.o();
                    h.d(o, "views.rootView");
                    return o;
                }
                h.k("views");
                throw null;
            }
            h.k("viewsFactory");
            throw null;
        }
        h.k("injector");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.D0;
    }
}
