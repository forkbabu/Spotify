package com.spotify.music.artist.dac.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.dac.api.proto.DacResponse;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class DacArtistFragment extends Fragment implements s, c.a, ToolbarConfig.a {
    public t0<DacResponse> g0;
    public PageLoaderView.a<DacResponse> h0;
    private PageLoaderView<DacResponse> i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "Dac Artist Page";
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<DacResponse> pageLoaderView = this.i0;
        if (pageLoaderView != null) {
            t0<DacResponse> t0Var = this.g0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<DacResponse> t0Var2 = this.g0;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    h.k("pageLoader");
                    throw null;
                }
            } else {
                h.k("pageLoader");
                throw null;
            }
        } else {
            h.k("pageLoaderView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<DacResponse> t0Var = this.g0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.Q0;
        h.d(cVar, "ViewUris.DAC_ARTIST");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-feature-dac-artist";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.ARTIST, null);
        h.d(b, "PageViewObservable.create(PageIdentifiers.ARTIST)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<DacResponse> aVar = this.h0;
        if (aVar != null) {
            PageLoaderView<DacResponse> a = aVar.a(F2());
            h.d(a, "pageLoaderViewBuilder.createView(context)");
            this.i0 = a;
            if (a != null) {
                return a;
            }
            h.k("pageLoaderView");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.M;
        h.d(ifd, "FeatureIdentifiers.DAC_ARTIST");
        return ifd;
    }
}
