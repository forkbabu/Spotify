package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import com.spotify.music.newplaying.scroll.container.d0;
import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.nowplaying.common.view.canvas.artist.CanvasArtistWidgetView;
import com.spotify.music.nowplaying.common.view.canvas.artist.h;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.heart.g;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.queue.QueueButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.r;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import com.spotify.nowplaying.ui.components.repeat.RepeatButton;
import com.spotify.nowplaying.ui.components.shuffle.ShuffleButton;
import com.spotify.nowplaying.ui.components.shuffle.d;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import defpackage.cqd;

/* renamed from: b3c  reason: default package */
final class b3c implements cqd.a {
    private PeekScrollView A;
    private CloseButton B;
    private TitleHeader C;
    private ContextMenuButton D;
    private TrackCarouselView E;
    private MarqueeTrackInfoView F;
    private HeartButton G;
    private TrackDownloadButton H;
    private PersistentSeekbarView I;
    private ShuffleButton J;
    private PreviousButton K;
    private PlayPauseButton L;
    private NextButton M;
    private RepeatButton N;
    private ConnectView O;
    private QueueButton P;
    private CanvasArtistWidgetView Q;
    private WidgetsContainer R;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final brb e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final g g;
    private final r h;
    private final e i;
    private final vqd j;
    private final d k;
    private final com.spotify.nowplaying.ui.components.controls.previous.e l;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e m;
    private final com.spotify.nowplaying.ui.components.controls.next.f n;
    private final com.spotify.nowplaying.ui.components.repeat.d o;
    private final jrb p;
    private final prb q;
    private final com.spotify.music.nowplaying.common.view.queue.c r;
    private final h s;
    private final grb t;
    private final com.spotify.nowplaying.core.orientation.b u;
    private final com.spotify.nowplaying.ui.components.overlay.h v;
    private final d0 w;
    private final com.spotify.music.newplaying.scroll.e x;
    private final Picasso y;
    private OverlayHidingGradientBackgroundView z;

    b3c(b bVar, c cVar, l lVar, f fVar, brb brb, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, g gVar, r rVar, e eVar, vqd vqd, d dVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, com.spotify.nowplaying.ui.components.controls.next.f fVar2, com.spotify.nowplaying.ui.components.repeat.d dVar2, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.queue.c cVar3, h hVar, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, com.spotify.nowplaying.ui.components.overlay.h hVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar4, Picasso picasso, x2c x2c) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = fVar;
        this.e = brb;
        this.f = cVar2;
        this.g = gVar;
        this.h = rVar;
        this.i = eVar;
        this.j = vqd;
        this.k = dVar;
        this.l = eVar2;
        this.m = eVar3;
        this.n = fVar2;
        this.o = dVar2;
        this.p = jrb;
        this.q = prb;
        this.r = cVar3;
        this.s = hVar;
        this.t = grb;
        this.u = bVar2;
        this.v = hVar2;
        this.w = d0Var;
        this.x = eVar4;
        this.y = picasso;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_scrolling_responsive_shuffle_player, viewGroup, false);
        this.z = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.A = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.B = (CloseButton) this.z.findViewById(C0707R.id.close_button);
        this.C = (TitleHeader) this.z.findViewById(C0707R.id.title_header);
        this.D = (ContextMenuButton) this.z.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.z.findViewById(C0707R.id.track_carousel);
        this.E = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.F = (MarqueeTrackInfoView) this.z.findViewById(C0707R.id.track_info_view);
        this.G = (HeartButton) this.z.findViewById(C0707R.id.heart_button);
        this.H = (TrackDownloadButton) this.z.findViewById(C0707R.id.track_download_button);
        this.I = (PersistentSeekbarView) this.z.findViewById(C0707R.id.seek_bar_view);
        this.J = (ShuffleButton) this.z.findViewById(C0707R.id.shuffle_button);
        this.K = (PreviousButton) this.z.findViewById(C0707R.id.previous_button);
        this.L = (PlayPauseButton) this.z.findViewById(C0707R.id.play_pause_button);
        this.M = (NextButton) this.z.findViewById(C0707R.id.next_button);
        this.N = (RepeatButton) this.z.findViewById(C0707R.id.repeat_button);
        this.O = (ConnectView) this.z.findViewById(C0707R.id.connect_view_root);
        this.P = (QueueButton) this.z.findViewById(C0707R.id.queue_button);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) this.z.findViewById(C0707R.id.canvas_artist_view);
        this.Q = canvasArtistWidgetView;
        canvasArtistWidgetView.setPicasso(this.y);
        this.R = (WidgetsContainer) inflate.findViewById(C0707R.id.widgets_container);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.u.b();
        this.t.d(this.z);
        this.a.b(this.B);
        this.b.c(this.C);
        this.c.d(this.D);
        this.d.d(this.E);
        this.f.d(this.F);
        this.g.c(this.G);
        this.h.e(this.H);
        this.i.e(this.I);
        this.j.a(this.I.a());
        this.k.c(this.J);
        this.l.d(this.K);
        this.m.d(this.L);
        this.n.c(this.M);
        this.o.c(this.N);
        this.p.b(this.q.b(this.O));
        this.r.c(this.P);
        this.s.e(this.Q, this.z.t());
        this.x.a(this.z, this.A);
        this.w.f(this.R);
        this.v.b(this.z);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.u.c();
        this.t.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.f.e();
        this.g.d();
        this.h.f();
        this.i.f();
        this.j.b();
        this.k.d();
        this.l.e();
        this.m.e();
        this.n.d();
        this.o.a();
        this.p.a();
        this.r.d();
        this.s.f();
        this.x.b();
        this.w.g();
        this.v.c();
    }
}
