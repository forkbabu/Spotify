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
import com.spotify.music.sushi.badge.SushiBadgePresenter;
import com.spotify.music.sushi.badge.a;
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

/* access modifiers changed from: package-private */
/* renamed from: vsb  reason: default package */
public final class vsb implements cqd.a {
    private final Picasso A;
    private OverlayHidingGradientBackgroundView B;
    private PeekScrollView C;
    private CloseButton D;
    private TitleHeader E;
    private ContextMenuButton F;
    private TrackCarouselView G;
    private MarqueeTrackInfoView H;
    private a I;
    private TrackDownloadButton J;
    private HeartButton K;
    private PersistentSeekbarView L;
    private ShuffleButton M;
    private PreviousButton N;
    private PlayPauseButton O;
    private NextButton P;
    private RepeatButton Q;
    private ConnectView R;
    private QueueButton S;
    private CanvasArtistWidgetView T;
    private WidgetsContainer U;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final brb e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final SushiBadgePresenter g;
    private final r h;
    private final g i;
    private final e j;
    private final vqd k;
    private final d l;
    private final com.spotify.nowplaying.ui.components.controls.previous.e m;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e n;
    private final com.spotify.nowplaying.ui.components.controls.next.f o;
    private final com.spotify.nowplaying.ui.components.repeat.d p;
    private final jrb q;
    private final prb r;
    private final com.spotify.music.nowplaying.common.view.queue.c s;
    private final h t;
    private final grb u;
    private final com.spotify.nowplaying.core.orientation.b v;
    private final com.spotify.nowplaying.ui.components.overlay.h w;
    private final d0 x;
    private final com.spotify.music.newplaying.scroll.e y;
    private final gxc z;

    public vsb(b bVar, c cVar, l lVar, f fVar, brb brb, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, SushiBadgePresenter sushiBadgePresenter, r rVar, g gVar, e eVar, vqd vqd, d dVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, com.spotify.nowplaying.ui.components.controls.next.f fVar2, com.spotify.nowplaying.ui.components.repeat.d dVar2, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.queue.c cVar3, h hVar, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, com.spotify.nowplaying.ui.components.overlay.h hVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar4, gxc gxc, Picasso picasso, rsb rsb) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = fVar;
        this.e = brb;
        this.f = cVar2;
        this.g = sushiBadgePresenter;
        this.h = rVar;
        this.i = gVar;
        this.j = eVar;
        this.k = vqd;
        this.l = dVar;
        this.m = eVar2;
        this.n = eVar3;
        this.o = fVar2;
        this.p = dVar2;
        this.q = jrb;
        this.r = prb;
        this.s = cVar3;
        this.t = hVar;
        this.u = grb;
        this.v = bVar2;
        this.w = hVar2;
        this.x = d0Var;
        this.y = eVar4;
        this.A = picasso;
        this.z = gxc;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.newplaying_scrolling_default_player, viewGroup, false);
        this.B = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.C = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.D = (CloseButton) this.B.findViewById(C0707R.id.close_button);
        this.E = (TitleHeader) this.B.findViewById(C0707R.id.title_header);
        this.F = (ContextMenuButton) this.B.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.B.findViewById(C0707R.id.track_carousel);
        this.G = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.H = (MarqueeTrackInfoView) this.B.findViewById(C0707R.id.track_info_view);
        this.I = (a) this.B.findViewById(C0707R.id.sushi_badge);
        this.J = (TrackDownloadButton) this.B.findViewById(C0707R.id.track_download_button);
        this.K = (HeartButton) this.B.findViewById(C0707R.id.heart_button);
        this.L = (PersistentSeekbarView) this.B.findViewById(C0707R.id.seek_bar_view);
        this.M = (ShuffleButton) this.B.findViewById(C0707R.id.shuffle_button);
        this.N = (PreviousButton) this.B.findViewById(C0707R.id.previous_button);
        this.O = (PlayPauseButton) this.B.findViewById(C0707R.id.play_pause_button);
        this.P = (NextButton) this.B.findViewById(C0707R.id.next_button);
        this.Q = (RepeatButton) this.B.findViewById(C0707R.id.repeat_button);
        this.R = (ConnectView) this.B.findViewById(C0707R.id.connect_view_root);
        this.S = (QueueButton) this.B.findViewById(C0707R.id.queue_button);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) this.B.findViewById(C0707R.id.canvas_artist_view);
        this.T = canvasArtistWidgetView;
        canvasArtistWidgetView.setPicasso(this.A);
        this.U = (WidgetsContainer) inflate.findViewById(C0707R.id.widgets_container);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.v.b();
        this.u.d(this.B);
        this.a.b(this.D);
        this.b.c(this.E);
        this.c.d(this.F);
        this.z.b(this.F);
        this.d.d(this.G);
        this.f.d(this.H);
        this.g.e(this.I);
        this.h.e(this.J);
        this.i.c(this.K);
        this.j.e(this.L);
        this.k.a(this.L.a());
        this.l.c(this.M);
        this.m.d(this.N);
        this.n.d(this.O);
        this.o.c(this.P);
        this.p.c(this.Q);
        this.q.b(this.r.b(this.R));
        this.s.c(this.S);
        this.t.e(this.T, this.B.t());
        this.y.a(this.B, this.C);
        this.x.f(this.U);
        this.w.b(this.B);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.v.c();
        this.u.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.f.e();
        this.g.f();
        this.h.f();
        this.i.d();
        this.j.f();
        this.k.b();
        this.l.d();
        this.m.e();
        this.n.e();
        this.o.d();
        this.p.a();
        this.q.a();
        this.s.d();
        this.t.f();
        this.y.b();
        this.x.g();
        this.w.c();
    }
}
