package com.spotify.mobile.android.skiplimitpivot.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class OnDemandPlaylistsFragment extends Fragment implements ToolbarConfig.a, c.a, s, mfd, a {
    public b g0;
    public OnDemandPlaylistsPresenter h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.skip_limit_pivot_default_title);
        h.d(string, "context.getString(R.stri…imit_pivot_default_title)");
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        OnDemandPlaylistsPresenter onDemandPlaylistsPresenter = this.h0;
        if (onDemandPlaylistsPresenter != null) {
            onDemandPlaylistsPresenter.b();
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        OnDemandPlaylistsPresenter onDemandPlaylistsPresenter = this.h0;
        if (onDemandPlaylistsPresenter != null) {
            onDemandPlaylistsPresenter.c();
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.SKIP_LIMIT_PIVOT;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.l2;
        h.d(cVar, "ViewUris.SKIP_LIMIT_PIVOT");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.SKIP_LIMIT_PIVOT.name();
    }

    @Override // com.spotify.mobile.android.skiplimitpivot.view.a
    public void onClose() {
        j4().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.SKIP_LIMIT_PIVOT, null);
        h.d(b, "PageViewObservable.creat…tifiers.SKIP_LIMIT_PIVOT)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        b bVar = this.g0;
        if (bVar != null) {
            View d = bVar.d();
            d.setBackgroundColor(androidx.core.content.a.b(d.getContext(), R.color.gray_15));
            return d;
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.J1;
        h.d(ifd, "FeatureIdentifiers.SKIP_LIMIT_PIVOT");
        return ifd;
    }
}
