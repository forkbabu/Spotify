package com.spotify.music.features.yourepisodes;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class YourEpisodesFragment extends DaggerFragment implements c.a, s, mfd, ToolbarConfig.d, ToolbarConfig.c, ToolbarConfig.a {
    private static final c k0;
    private static final ifd l0;
    private static final PageIdentifiers m0 = PageIdentifiers.COLLECTION_PODCASTS_EPISODES_LISTENLATER;
    public static final YourEpisodesFragment n0 = null;
    public t0<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> h0;
    public PageLoaderView.a<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> i0;
    private PageLoaderView<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> j0;

    static {
        LinkType linkType = LinkType.COLLECTION_YOUR_EPISODES;
        c a = c.a("spotify:collection:your-episodes");
        h.d(a, "ViewUri.create(VIEW_ID)");
        k0 = a;
        ifd ifd = kfd.I1;
        h.d(ifd, "FeatureIdentifiers.YOUR_EPISODES");
        l0 = ifd;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.your_episodes_header_title);
        h.d(string, "context.getString(R.stri…ur_episodes_header_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> pageLoaderView = this.j0;
        if (pageLoaderView != null) {
            t0<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> t0Var = this.h0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> t0Var2 = this.h0;
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
        t0<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> t0Var = this.h0;
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

    @Override // defpackage.mfd
    public a g1() {
        return m0;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return k0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        String ifd = l0.toString();
        h.d(ifd, "FEATURE_ID.toString()");
        return ifd;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 a = ij9.a(m0);
        h.d(a, "PageViewObservable.create(PAGE_ID)");
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<io.reactivex.s<com.spotify.music.features.yourepisodes.interactor.c>> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
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

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return l0;
    }
}
