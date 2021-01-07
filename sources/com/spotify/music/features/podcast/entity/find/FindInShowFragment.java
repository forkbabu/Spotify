package com.spotify.music.features.podcast.entity.find;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class FindInShowFragment extends DaggerFragment implements s, mfd, c.a {
    public c h0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PODCAST_SHOW_SEARCH;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c a = c.a(k4().getString("uri", ""));
        h.d(a, "ViewUri.create(requireAr…String(ARGUMENT_URI, \"\"))");
        return a;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.PODCAST_SHOW_SEARCH.name();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.PODCAST_SHOW_SEARCH, null);
        h.d(b, "PageViewObservable.creat…iers.PODCAST_SHOW_SEARCH)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        c cVar = this.h0;
        if (cVar != null) {
            Context l4 = l4();
            h.d(l4, "requireContext()");
            return cVar.a(l4, this);
        }
        h.k("viewCreator");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        ifd ifd = kfd.c0;
        h.d(ifd, "FeatureIdentifiers.FIND_IN_SHOW");
        return ifd;
    }
}
