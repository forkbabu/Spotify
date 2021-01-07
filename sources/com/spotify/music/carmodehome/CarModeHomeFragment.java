package com.spotify.music.carmodehome;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.carmodehome.page.h;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.x;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;

public final class CarModeHomeFragment extends DaggerFragment implements s, c.a, ToolbarConfig.a, x {
    public t0<io.reactivex.s<h>> h0;
    public PageLoaderView.a<io.reactivex.s<h>> i0;
    public b j0;
    private PageLoaderView<io.reactivex.s<h>> k0;

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        b bVar = this.j0;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        kotlin.jvm.internal.h.k("navigationTabClickedTwice");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<io.reactivex.s<h>> pageLoaderView = this.k0;
        if (pageLoaderView != null) {
            n b3 = b3();
            t0<io.reactivex.s<h>> t0Var = this.h0;
            if (t0Var != null) {
                pageLoaderView.j0(b3, t0Var);
                t0<io.reactivex.s<h>> t0Var2 = this.h0;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    kotlin.jvm.internal.h.k("pageLoader");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.h.k("pageLoader");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("pageLoaderView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<io.reactivex.s<h>> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            kotlin.jvm.internal.h.k("pageLoader");
            throw null;
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

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.C;
        kotlin.jvm.internal.h.d(cVar, "ViewUris.CAR_MODE_HOME");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        z1();
        String name = kfd.q.getName();
        kotlin.jvm.internal.h.d(name, "featureIdentifier.name");
        return name;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.CAR_MODE_HOME, null);
        kotlin.jvm.internal.h.d(b, "PageViewObservable.creat…dentifiers.CAR_MODE_HOME)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        PageLoaderView.a<io.reactivex.s<h>> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<io.reactivex.s<h>> a = aVar.a(l4());
            kotlin.jvm.internal.h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            this.k0 = a;
            if (a != null) {
                return a;
            }
            kotlin.jvm.internal.h.k("pageLoaderView");
            throw null;
        }
        kotlin.jvm.internal.h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.q;
        kotlin.jvm.internal.h.d(ifd, "FeatureIdentifiers.CAR_MODE_HOME");
        return ifd;
    }
}
