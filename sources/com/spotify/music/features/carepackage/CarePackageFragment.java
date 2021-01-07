package com.spotify.music.features.carepackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.playlist.models.k;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class CarePackageFragment extends DaggerFragment implements c.a, s, ToolbarConfig.d, ToolbarConfig.c {
    public t0<io.reactivex.s<k>> h0;
    public PageLoaderView.a<io.reactivex.s<k>> i0;
    private PageLoaderView<io.reactivex.s<k>> j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<io.reactivex.s<k>> pageLoaderView = this.j0;
        if (pageLoaderView != null) {
            t0<io.reactivex.s<k>> t0Var = this.h0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<io.reactivex.s<k>> t0Var2 = this.h0;
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
        t0<io.reactivex.s<k>> t0Var = this.h0;
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
        c cVar = ViewUris.D;
        h.d(cVar, "ViewUris.FOREVER_FAVORITES");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.CAREPACKAGE.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.CAREPACKAGE, null);
        h.d(b, "PageViewObservable.creat…eIdentifiers.CAREPACKAGE)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<io.reactivex.s<k>> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<io.reactivex.s<k>> a = aVar.a(layoutInflater.getContext());
            h.d(a, "pageLoaderViewBuilder.createView(inflater.context)");
            this.j0 = a;
            if (a != null) {
                return a;
            }
            h.k("pageLoaderView");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.e0;
        h.d(ifd, "FeatureIdentifiers.FOREVER_FAVORITES");
        return ifd;
    }
}
