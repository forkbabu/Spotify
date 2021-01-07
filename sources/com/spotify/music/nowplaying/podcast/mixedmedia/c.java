package com.spotify.music.nowplaying.podcast.mixedmedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu.MixedMediaContextMenuButtonPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar.ControlBarViewBinder;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.a;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause.d;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.header.MarqueeTitleHeader;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentSeekBarPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.SegmentedSeekBar;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.sleep.PodcastMixedMediaSleepTimerButtonPresenter;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.e;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.g;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.i;
import com.spotify.music.nowplaying.podcast.sleeptimer.SleepTimerButton;
import com.spotify.nowplaying.core.orientation.b;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import defpackage.cqd;
import kotlin.jvm.internal.h;

public final class c implements cqd.a {
    private final g A;
    private final b B;
    private final e C;
    private CloseButton a;
    private MarqueeTitleHeader b;
    private ContextMenuButton c;
    private ConnectView d;
    private ImageView e;
    private SegmentedSeekBar f;
    private OverlayHidingGradientBackgroundView g;
    private com.spotify.music.nowplaying.podcast.speedcontrol.g h;
    private SleepTimerButton i;
    private final prb j;
    private final jrb k;
    private final v1c l;
    private final com.spotify.music.nowplaying.common.view.close.b m;
    private final com.spotify.music.nowplaying.common.view.header.c n;
    private final MixedMediaContextMenuButtonPresenter o;
    private final SegmentSeekBarPresenter p;
    private final e.a q;
    private final grb r;
    private final f s;
    private final i t;
    private final a u;
    private final d v;
    private final ControlBarViewBinder w;
    private final ControlBarViewBinder.a x;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g y;
    private final PodcastMixedMediaSleepTimerButtonPresenter z;

    public c(prb prb, jrb jrb, v1c v1c, com.spotify.music.nowplaying.common.view.close.b bVar, com.spotify.music.nowplaying.common.view.header.c cVar, MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter, SegmentSeekBarPresenter segmentSeekBarPresenter, e.a aVar, grb grb, f fVar, i iVar, a aVar2, d dVar, ControlBarViewBinder controlBarViewBinder, ControlBarViewBinder.a aVar3, com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g gVar, PodcastMixedMediaSleepTimerButtonPresenter podcastMixedMediaSleepTimerButtonPresenter, g gVar2, b bVar2, com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.e eVar) {
        h.e(prb, "nowPlayingConnectViewBinderFactory");
        h.e(jrb, "connectButtonInteractorBinder");
        h.e(v1c, "sharePresenter");
        h.e(bVar, "closeButtonPresenter");
        h.e(cVar, "contextTitleHeaderPresenter");
        h.e(mixedMediaContextMenuButtonPresenter, "contextMenuButtonPresenter");
        h.e(segmentSeekBarPresenter, "segmentSeekBarPresenter");
        h.e(aVar, "timeLinePresenter");
        h.e(grb, "colorTransitionController");
        h.e(fVar, "trackListPresenter");
        h.e(iVar, "trackListViewBinder");
        h.e(aVar2, "durationPlayPauseButtonPresenter");
        h.e(dVar, "durationPlayPauseButtonViewBinder");
        h.e(controlBarViewBinder, "controlBarViewBinder");
        h.e(aVar3, "controlBarPresenter");
        h.e(gVar, "currentTrackViewBinder");
        h.e(podcastMixedMediaSleepTimerButtonPresenter, "sleepTimerButtonPresenter");
        h.e(gVar2, "speedControlButtonPresenter");
        h.e(bVar2, "orientationController");
        h.e(eVar, "speedControlButtonViewBinder");
        this.j = prb;
        this.k = jrb;
        this.l = v1c;
        this.m = bVar;
        this.n = cVar;
        this.o = mixedMediaContextMenuButtonPresenter;
        this.p = segmentSeekBarPresenter;
        this.q = aVar;
        this.r = grb;
        this.s = fVar;
        this.t = iVar;
        this.u = aVar2;
        this.v = dVar;
        this.w = controlBarViewBinder;
        this.x = aVar3;
        this.y = gVar;
        this.z = podcastMixedMediaSleepTimerButtonPresenter;
        this.A = gVar2;
        this.B = bVar2;
        this.C = eVar;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "root");
        View inflate = layoutInflater.inflate(C0707R.layout.mixed_media_episode_mode_layout, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.close_button);
        h.d(findViewById, "findViewById(R.id.close_button)");
        this.a = (CloseButton) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.mixed_media_title_header);
        h.d(findViewById2, "findViewById(R.id.mixed_media_title_header)");
        this.b = (MarqueeTitleHeader) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.context_menu_button);
        h.d(findViewById3, "findViewById(R.id.context_menu_button)");
        this.c = (ContextMenuButton) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.connect_view_root);
        h.d(findViewById4, "findViewById(com.spotify…t.R.id.connect_view_root)");
        this.d = (ConnectView) findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.share_button);
        h.d(findViewById5, "findViewById(com.spotify…n.view.R.id.share_button)");
        this.e = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0707R.id.segmented_seekbar);
        h.d(findViewById6, "findViewById(R.id.segmented_seekbar)");
        this.f = (SegmentedSeekBar) findViewById6;
        View findViewById7 = inflate.findViewById(C0707R.id.speed_control_button);
        h.d(findViewById7, "findViewById(R.id.speed_control_button)");
        this.h = (com.spotify.music.nowplaying.podcast.speedcontrol.g) findViewById7;
        View findViewById8 = inflate.findViewById(C0707R.id.sleep_timer_button);
        h.d(findViewById8, "findViewById(R.id.sleep_timer_button)");
        this.i = (SleepTimerButton) findViewById8;
        View findViewById9 = inflate.findViewById(C0707R.id.colour_background);
        h.d(findViewById9, "findViewById(R.id.colour_background)");
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) findViewById9;
        this.g = overlayHidingGradientBackgroundView;
        if (overlayHidingGradientBackgroundView != null) {
            overlayHidingGradientBackgroundView.setAutoHide(false);
            overlayHidingGradientBackgroundView.setHidingEnabled(false);
            i iVar = this.t;
            h.d(inflate, "this");
            f fVar = this.s;
            iVar.b(inflate, fVar, fVar);
            this.v.a(inflate);
            this.y.a(inflate);
            ControlBarViewBinder controlBarViewBinder = this.w;
            View findViewById10 = inflate.findViewById(C0707R.id.npv_players_controls);
            h.d(findViewById10, "findViewById(R.id.npv_players_controls)");
            controlBarViewBinder.a((ViewGroup) findViewById10);
            h.d(inflate, "inflater.inflate(R.layou…yers_controls))\n        }");
            return inflate;
        }
        h.k("colourBackground");
        throw null;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.B.b();
        com.spotify.music.nowplaying.common.view.close.b bVar = this.m;
        CloseButton closeButton = this.a;
        if (closeButton != null) {
            bVar.b(closeButton);
            v1c v1c = this.l;
            ImageView imageView = this.e;
            if (imageView != null) {
                v1c.b(imageView);
                jrb jrb = this.k;
                prb prb = this.j;
                ConnectView connectView = this.d;
                if (connectView != null) {
                    jrb.b(prb.b(connectView));
                    com.spotify.music.nowplaying.common.view.header.c cVar = this.n;
                    MarqueeTitleHeader marqueeTitleHeader = this.b;
                    if (marqueeTitleHeader != null) {
                        cVar.c(marqueeTitleHeader);
                        MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter = this.o;
                        ContextMenuButton contextMenuButton = this.c;
                        if (contextMenuButton != null) {
                            mixedMediaContextMenuButtonPresenter.d(contextMenuButton);
                            SegmentSeekBarPresenter segmentSeekBarPresenter = this.p;
                            SegmentedSeekBar segmentedSeekBar = this.f;
                            if (segmentedSeekBar != null) {
                                segmentSeekBarPresenter.a(segmentedSeekBar);
                                e.a aVar = this.q;
                                SegmentedSeekBar segmentedSeekBar2 = this.f;
                                if (segmentedSeekBar2 != null) {
                                    aVar.d(segmentedSeekBar2.getTimeLine());
                                    grb grb = this.r;
                                    OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = this.g;
                                    if (overlayHidingGradientBackgroundView != null) {
                                        grb.d(overlayHidingGradientBackgroundView);
                                        this.u.start();
                                        this.x.e(this.w);
                                        g gVar = this.A;
                                        com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.e eVar = this.C;
                                        com.spotify.music.nowplaying.podcast.speedcontrol.g gVar2 = this.h;
                                        if (gVar2 != null) {
                                            com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol.d b2 = eVar.b(gVar2);
                                            h.d(b2, "speedControlButtonViewBi…reate(speedControlButton)");
                                            gVar.b(b2);
                                            PodcastMixedMediaSleepTimerButtonPresenter podcastMixedMediaSleepTimerButtonPresenter = this.z;
                                            SleepTimerButton sleepTimerButton = this.i;
                                            if (sleepTimerButton != null) {
                                                podcastMixedMediaSleepTimerButtonPresenter.d(sleepTimerButton);
                                            } else {
                                                h.k("sleepTimerButton");
                                                throw null;
                                            }
                                        } else {
                                            h.k("speedControlButton");
                                            throw null;
                                        }
                                    } else {
                                        h.k("colourBackground");
                                        throw null;
                                    }
                                } else {
                                    h.k("seekBar");
                                    throw null;
                                }
                            } else {
                                h.k("seekBar");
                                throw null;
                            }
                        } else {
                            h.k("contextMenuButton");
                            throw null;
                        }
                    } else {
                        h.k("titleHeader");
                        throw null;
                    }
                } else {
                    h.k("connectView");
                    throw null;
                }
            } else {
                h.k("shareButton");
                throw null;
            }
        } else {
            h.k("closeButton");
            throw null;
        }
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.B.c();
        this.m.c();
        this.l.a();
        this.k.a();
        this.o.e();
        this.n.d();
        this.r.c();
        this.u.stop();
        this.x.stop();
        this.A.stop();
        this.z.e();
    }
}
