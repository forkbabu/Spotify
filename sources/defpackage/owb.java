package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import com.spotify.music.newplaying.scroll.container.d0;
import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.nowplaying.common.view.ban.BanButton;
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
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import defpackage.cqd;

/* renamed from: owb  reason: default package */
final class owb implements cqd.a {
    private OverlayHidingGradientBackgroundView A;
    private PeekScrollView B;
    private CloseButton C;
    private TitleHeader D;
    private ContextMenuButton E;
    private TrackCarouselView F;
    private MarqueeTrackInfoView G;
    private a H;
    private TrackDownloadButton I;
    private PersistentSeekbarView J;
    private HeartButton K;
    private PreviousButton L;
    private PlayPauseButton M;
    private NextButton N;
    private BanButton O;
    private ConnectView P;
    private QueueButton Q;
    private CanvasArtistWidgetView R;
    private WidgetsContainer S;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final brb e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final SushiBadgePresenter g;
    private final r h;
    private final e i;
    private final vqd j;
    private final g k;
    private final com.spotify.nowplaying.ui.components.controls.previous.e l;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e m;
    private final com.spotify.nowplaying.ui.components.controls.next.f n;
    private final com.spotify.music.nowplaying.common.view.ban.e o;
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
    private final gxc z;

    public owb(b bVar, c cVar, l lVar, f fVar, brb brb, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, SushiBadgePresenter sushiBadgePresenter, r rVar, e eVar, vqd vqd, g gVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, com.spotify.nowplaying.ui.components.controls.next.f fVar2, com.spotify.music.nowplaying.common.view.ban.e eVar4, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.queue.c cVar3, h hVar, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, com.spotify.nowplaying.ui.components.overlay.h hVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar5, Picasso picasso, gxc gxc, kwb kwb) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = fVar;
        this.e = brb;
        this.f = cVar2;
        this.g = sushiBadgePresenter;
        this.h = rVar;
        this.i = eVar;
        this.j = vqd;
        this.k = gVar;
        this.l = eVar2;
        this.m = eVar3;
        this.n = fVar2;
        this.o = eVar4;
        this.p = jrb;
        this.q = prb;
        this.r = cVar3;
        this.s = hVar;
        this.t = grb;
        this.u = bVar2;
        this.v = hVar2;
        this.w = d0Var;
        this.x = eVar5;
        this.y = picasso;
        this.z = gxc;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.newplaying_scrolling_feedback_player, viewGroup, false);
        this.A = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.B = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.C = (CloseButton) this.A.findViewById(C0707R.id.close_button);
        this.D = (TitleHeader) this.A.findViewById(C0707R.id.title_header);
        this.E = (ContextMenuButton) this.A.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.A.findViewById(C0707R.id.track_carousel);
        this.F = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.G = (MarqueeTrackInfoView) this.A.findViewById(C0707R.id.track_info_view);
        this.H = (a) this.A.findViewById(C0707R.id.sushi_badge);
        this.I = (TrackDownloadButton) this.A.findViewById(C0707R.id.track_download_button);
        this.J = (PersistentSeekbarView) this.A.findViewById(C0707R.id.seek_bar_view);
        this.K = (HeartButton) this.A.findViewById(C0707R.id.heart_button);
        this.L = (PreviousButton) this.A.findViewById(C0707R.id.previous_button);
        this.M = (PlayPauseButton) this.A.findViewById(C0707R.id.play_pause_button);
        this.N = (NextButton) this.A.findViewById(C0707R.id.next_button);
        this.O = (BanButton) this.A.findViewById(C0707R.id.ban_button);
        this.P = (ConnectView) this.A.findViewById(C0707R.id.connect_view_root);
        this.Q = (QueueButton) this.A.findViewById(C0707R.id.queue_button);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) this.A.findViewById(C0707R.id.canvas_artist_view);
        this.R = canvasArtistWidgetView;
        canvasArtistWidgetView.setPicasso(this.y);
        this.S = (WidgetsContainer) inflate.findViewById(C0707R.id.widgets_container);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.u.b();
        this.t.d(this.A);
        this.a.b(this.C);
        this.b.c(this.D);
        this.c.d(this.E);
        this.z.b(this.E);
        this.d.d(this.F);
        this.g.e(this.H);
        this.f.d(this.G);
        this.h.e(this.I);
        this.i.e(this.J);
        this.j.a(this.J.a());
        this.k.c(this.K);
        this.l.d(this.L);
        this.m.d(this.M);
        this.n.c(this.N);
        this.o.c(this.O);
        this.p.b(this.q.b(this.P));
        this.r.c(this.Q);
        this.s.e(this.R, this.A.t());
        this.x.a(this.A, this.B);
        this.w.f(this.S);
        this.v.b(this.A);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.u.c();
        this.t.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.g.f();
        this.f.e();
        this.h.f();
        this.i.f();
        this.j.b();
        this.k.d();
        this.l.e();
        this.m.e();
        this.n.d();
        this.o.d();
        this.p.a();
        this.r.d();
        this.s.f();
        this.x.b();
        this.w.g();
        this.v.c();
    }
}
