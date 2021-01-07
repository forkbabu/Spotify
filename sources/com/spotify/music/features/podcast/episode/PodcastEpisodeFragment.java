package com.spotify.music.features.podcast.episode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.features.podcast.episode.datasource.z;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.playlist.endpoints.d;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.b;
import dagger.android.h;

public class PodcastEpisodeFragment extends LifecycleListenableFragment implements ToolbarConfig.c, ToolbarConfig.d, s, mfd, d0, hjc, h, u0 {
    String h0;
    o0 i0;
    cbc<io.reactivex.s<z>> j0;
    PageLoaderView.a<io.reactivex.s<z>> k0;
    private PageLoaderView<io.reactivex.s<z>> l0;
    ajf<p0> m0;
    DispatchingAndroidInjector<Object> n0;
    ys2 o0;

    @Override // dagger.android.h
    public b<Object> C() {
        return this.n0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        this.i0.f(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.l0.j0(this, this.j0.get());
    }

    @Override // defpackage.hjc
    public d.b Q1() {
        Bundle bundle = k4().getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return (d.b) bundle.getParcelable("extra_playback_playlist_endpoint_configuration");
        }
        return null;
    }

    @Override // defpackage.hjc
    public String T1() {
        Bundle bundle = k4().getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_row_id");
        }
        return null;
    }

    @Override // com.spotify.music.features.podcast.episode.u0
    public void d(String str) {
        this.o0.k(this, str);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        this.i0.g(a0Var);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PODCAST_EPISODE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return c.a(this.h0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return PageIdentifiers.PODCAST_EPISODE.name();
    }

    @Override // defpackage.hjc
    public String m2() {
        Bundle bundle = k4().getBundle("ARGUMENT_EXTRAS");
        if (bundle != null) {
            return bundle.getString("extra_playback_context_uri");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        this.i0.d(bundle);
        super.s3(bundle);
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PODCAST_EPISODE, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<io.reactivex.s<z>> a = this.k0.a(l4());
        this.l0 = a;
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.U0;
    }
}
