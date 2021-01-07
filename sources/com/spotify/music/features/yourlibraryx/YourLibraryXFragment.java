package com.spotify.music.features.yourlibraryx;

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
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.lifecycle.c;
import com.spotify.music.features.yourlibraryx.view.a0;
import com.spotify.music.features.yourlibraryx.view.c0;
import com.spotify.music.features.yourlibraryx.view.d0;
import com.spotify.music.navigation.x;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class YourLibraryXFragment extends DaggerFragment implements s, ToolbarConfig.a, x {
    public c h0;
    public PageLoaderView.a<f> i0;
    public t0<f> j0;
    public c0 k0;
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

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        c0 c0Var = this.k0;
        if (c0Var == null) {
            return true;
        }
        if (c0Var != null) {
            ((d0) c0Var).d();
            return true;
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.your_library_title);
        h.d(string, "context.getString(R.string.your_library_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        c cVar = this.h0;
        if (cVar != null) {
            cVar.i(bundle);
            c0 c0Var = this.k0;
            if (c0Var != null) {
                ((d0) c0Var).c(bundle);
            } else {
                h.k("viewBinder");
                throw null;
            }
        } else {
            h.k("viewModel");
            throw null;
        }
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
                    c cVar = this.h0;
                    if (cVar != null) {
                        c0 c0Var = this.k0;
                        if (c0Var == null) {
                            h.k("viewBinder");
                            throw null;
                        } else if (c0Var != null) {
                            cVar.j(c0Var, ((d0) c0Var).e());
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
        c cVar = this.h0;
        if (cVar != null) {
            cVar.k();
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

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        z1();
        String ifd = kfd.v1.toString();
        h.d(ifd, "featureIdentifier.toString()");
        return ifd;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.YOURLIBRARY, null);
        h.d(b, "PageViewObservable.creat…eIdentifiers.YOURLIBRARY)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        c0 c0Var = this.k0;
        if (c0Var != null) {
            View a2 = ((d0) c0Var).a(layoutInflater, viewGroup);
            c cVar = this.h0;
            if (cVar != null) {
                cVar.h(bundle);
                c0 c0Var2 = this.k0;
                if (c0Var2 != null) {
                    ((d0) c0Var2).b(bundle);
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
