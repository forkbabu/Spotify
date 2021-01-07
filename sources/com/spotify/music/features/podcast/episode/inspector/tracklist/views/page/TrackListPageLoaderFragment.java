package com.spotify.music.features.podcast.episode.inspector.tracklist.views.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.a;

public class TrackListPageLoaderFragment extends Fragment implements s, c.a {
    t0<io.reactivex.s<k87>> g0;
    PageLoaderView.a<io.reactivex.s<k87>> h0;
    private PageLoaderView<io.reactivex.s<k87>> i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getResources().getString(C0707R.string.title_explore_this_episode);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.i0.j0(this, this.g0);
        this.g0.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.g0.stop();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return c.a(D2().getString("episode_tracklist", ""));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-feature-podcast-inspector-tracklist";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PODCAST_EPISODE, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<io.reactivex.s<k87>> a = this.h0.a(F2());
        this.i0 = a;
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.V0;
    }
}
