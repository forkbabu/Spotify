package com.spotify.music.nowplayingmini.podcast;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplayingmini.ui.seekbar.FadingSeekBarView;
import com.spotify.music.nowplayingmini.ui.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;
import com.spotify.player.model.ContextTrack;
import defpackage.ifd;

public class PodcastModeFragment extends LifecycleListenableFragment implements ifd.b, mfd, c.a {
    f h0;
    q7c i0;
    com.spotify.music.nowplaying.common.view.trackinfo.c j0;
    r7c k0;
    e l0;
    h m0;
    g n0;
    com.spotify.nowplaying.ui.components.controls.playpause.e o0;
    v7c p0;
    z7c q0;
    private MarqueeTrackInfoView r0;
    private FadingSeekBarView s0;
    private ConnectView t0;
    private PlayPauseButton u0;
    private SeekForwardButton v0;
    private TrackCarouselView w0;
    private SeekBackwardButton x0;

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.j0.d(this.r0);
        this.l0.e(this.s0);
        y7c b = this.q0.b(this.t0);
        this.p0.b(b);
        this.h0.d(this.w0);
        SeekBackwardButton seekBackwardButton = this.x0;
        if (seekBackwardButton != null) {
            this.m0.d(seekBackwardButton);
            b.i();
            this.t0.d();
        } else {
            b.g();
        }
        this.o0.d(this.u0);
        this.n0.d(this.v0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.h0.e();
        this.j0.e();
        this.l0.f();
        if (this.x0 != null) {
            this.m0.e();
        }
        this.o0.e();
        this.n0.e();
        this.p0.a();
        super.P3();
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.NOWPLAYING_NOWPLAYINGSIDEBAR;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.f0;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplayingmini_podcast, viewGroup, false);
        TrackCarouselView trackCarouselView = (TrackCarouselView) inflate.findViewById(C0707R.id.cover_art_view);
        this.w0 = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.i0);
        this.w0.m(this.k0);
        this.r0 = (MarqueeTrackInfoView) inflate.findViewById(C0707R.id.track_info_view);
        this.t0 = (ConnectView) inflate.findViewById(C0707R.id.connect_view_root);
        this.s0 = (FadingSeekBarView) inflate.findViewById(C0707R.id.seek_bar_view);
        this.x0 = (SeekBackwardButton) inflate.findViewById(C0707R.id.seek_backward_button);
        this.u0 = (PlayPauseButton) inflate.findViewById(C0707R.id.play_pause_button);
        this.v0 = (SeekForwardButton) inflate.findViewById(C0707R.id.seek_forward_button);
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.J0;
    }
}
