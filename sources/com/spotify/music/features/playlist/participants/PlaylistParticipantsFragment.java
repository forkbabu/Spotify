package com.spotify.music.features.playlist.participants;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.playlist.endpoints.d;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class PlaylistParticipantsFragment extends DaggerFragment implements vs2, s, mfd, ToolbarConfig.a, c.a {
    public cbc<io.reactivex.s<d.a>> h0;
    public PageLoaderView.a<io.reactivex.s<d.a>> i0;
    public ys2 j0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        return "";
    }

    @Override // defpackage.vs2
    public void I1(ws2 ws2) {
        ys2 ys2 = this.j0;
        if (ys2 != null) {
            ys2.I1(ws2);
        } else {
            h.k("spotifyFragmentContainer");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_PARTICIPANTS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.U0;
        h.d(cVar, "ViewUris.PLAYLIST_PARTICIPANTS");
        return cVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        z1();
        String name = kfd.P0.getName();
        h.d(name, "featureIdentifier.name");
        return name;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.PLAYLIST_PARTICIPANTS, null);
        h.d(b, "PageViewObservable.create(pageIdentifier)");
        return b;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<io.reactivex.s<d.a>> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<io.reactivex.s<d.a>> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            n b3 = b3();
            cbc<io.reactivex.s<d.a>> cbc = this.h0;
            if (cbc != null) {
                a.j0(b3, cbc.get());
                return a;
            }
            h.k("pageLoaderScope");
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
        ifd ifd = kfd.P0;
        h.d(ifd, "FeatureIdentifiers.PLAYLIST_PARTICIPANTS");
        return ifd;
    }
}
