package com.spotify.music.nowplayingmini.def;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.encore.consumer.elements.heart.AnimatedHeartButton;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplayingmini.ui.seekbar.FadingSeekBarView;
import com.spotify.music.nowplayingmini.ui.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.player.model.ContextTrack;
import defpackage.ifd;

public class DefaultModeFragment extends LifecycleListenableFragment implements ifd.b, mfd, c.a {
    private TrackCarouselView A0;
    private String B0;
    private PreviousButton C0;
    f h0;
    q7c i0;
    com.spotify.music.nowplaying.common.view.trackinfo.c j0;
    r7c k0;
    e l0;
    g m0;
    com.spotify.nowplaying.ui.components.controls.previous.e n0;
    com.spotify.nowplaying.ui.components.controls.playpause.e o0;
    com.spotify.nowplaying.ui.components.controls.next.f p0;
    v7c q0;
    z7c r0;
    boolean s0;
    private MarqueeTrackInfoView t0;
    private FadingSeekBarView u0;
    private ConnectView v0;
    private HeartButton w0;
    private AnimatedHeartButton x0;
    private PlayPauseButton y0;
    private NextButton z0;

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.h0.e();
        this.j0.e();
        this.l0.f();
        this.m0.d();
        if (this.C0 != null) {
            this.n0.e();
        }
        this.o0.e();
        this.p0.d();
        this.q0.a();
        super.H3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0.d(this.t0);
        this.l0.e(this.u0);
        y7c b = this.r0.b(this.v0);
        this.q0.b(b);
        if (this.s0) {
            this.w0.setVisibility(8);
            this.x0.setVisibility(0);
            this.m0.c(new c(this));
        } else {
            this.w0.setVisibility(0);
            this.x0.setVisibility(8);
            this.m0.c(this.w0);
        }
        this.h0.d(this.A0);
        PreviousButton previousButton = this.C0;
        if (previousButton != null) {
            this.n0.d(previousButton);
            b.i();
            this.v0.d();
        } else {
            b.g();
        }
        this.o0.d(this.y0);
        this.p0.c(this.z0);
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
        View inflate = layoutInflater.inflate(C0707R.layout.nowplayingmini_default, viewGroup, false);
        TrackCarouselView trackCarouselView = (TrackCarouselView) inflate.findViewById(C0707R.id.cover_art_view);
        this.A0 = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.i0);
        this.A0.m(this.k0);
        this.t0 = (MarqueeTrackInfoView) inflate.findViewById(C0707R.id.track_info_view);
        this.v0 = (ConnectView) inflate.findViewById(C0707R.id.connect_view_root);
        this.u0 = (FadingSeekBarView) inflate.findViewById(C0707R.id.seek_bar_view);
        this.w0 = (HeartButton) inflate.findViewById(C0707R.id.heart_button);
        this.x0 = (AnimatedHeartButton) inflate.findViewById(C0707R.id.animated_heart_button);
        this.C0 = (PreviousButton) inflate.findViewById(C0707R.id.previous_button);
        this.y0 = (PlayPauseButton) inflate.findViewById(C0707R.id.play_pause_button);
        this.z0 = (NextButton) inflate.findViewById(C0707R.id.next_button);
        this.B0 = inflate.getContext().getString(C0707R.string.element_content_description_context_song);
        return inflate;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.J0;
    }
}
