package com.spotify.music.features.yourlibraryx.search;

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
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.search.lifecycle.b;
import com.spotify.music.features.yourlibraryx.search.view.c;
import com.spotify.music.features.yourlibraryx.view.a0;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class YourLibraryXSearchFragment extends DaggerFragment implements s, ToolbarConfig.a {
    public b h0;
    public PageLoaderView.a<f> i0;
    public t0<f> j0;
    public c k0;
    private PageLoaderView<f> l0;

    static final class a<I, O> implements sg0<f, s0> {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(f fVar) {
            return new a0(this.a);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "YOUR LIBRARY SEARCH";
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        b bVar = this.h0;
        if (bVar != null) {
            bVar.i(bundle);
            c cVar = this.k0;
            if (cVar != null) {
                cVar.getClass();
                h.e(bundle, "bundle");
                return;
            }
            h.k("viewBinder");
            throw null;
        }
        h.k("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<f> pageLoaderView = this.l0;
        if (pageLoaderView != null) {
            t0<f> t0Var = this.j0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<f> t0Var2 = this.j0;
                if (t0Var2 != null) {
                    t0Var2.start();
                    b bVar = this.h0;
                    if (bVar != null) {
                        c cVar = this.k0;
                        if (cVar != null) {
                            bVar.j(cVar);
                        } else {
                            h.k("viewBinder");
                            throw null;
                        }
                    } else {
                        h.k("viewModel");
                        throw null;
                    }
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
        b bVar = this.h0;
        if (bVar != null) {
            bVar.k();
            t0<f> t0Var = this.j0;
            if (t0Var != null) {
                t0Var.stop();
                super.P3();
                return;
            }
            h.k("pageLoader");
            throw null;
        }
        h.k("viewModel");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "YourLibraryXSearchFragment";
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.YOURLIBRARY_SEARCH, null);
        h.d(b, "PageViewObservable.creat….YOURLIBRARY_SEARCH\n    )");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        c cVar = this.k0;
        if (cVar != null) {
            View a2 = cVar.a(layoutInflater, viewGroup);
            b bVar = this.h0;
            if (bVar != null) {
                bVar.h(bundle);
                c cVar2 = this.k0;
                if (cVar2 != null) {
                    cVar2.getClass();
                    PageLoaderView.a<f> aVar = this.i0;
                    if (aVar != null) {
                        aVar.e(new a(a2));
                        PageLoaderView<f> a3 = aVar.a(l4());
                        h.d(a3, "pageLoaderViewBuilder\n  …ateView(requireContext())");
                        this.l0 = a3;
                        if (a3 != null) {
                            return a3;
                        }
                        h.k("pageLoaderView");
                        throw null;
                    }
                    h.k("pageLoaderViewBuilder");
                    throw null;
                }
                h.k("viewBinder");
                throw null;
            }
            h.k("viewModel");
            throw null;
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.v1;
        h.d(ifd, "FeatureIdentifiers.YOUR_LIBRARY");
        return ifd;
    }
}
