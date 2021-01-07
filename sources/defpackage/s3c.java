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
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.r;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.next.f;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import defpackage.cqd;

/* renamed from: s3c  reason: default package */
final class s3c implements cqd.a {
    private TitleHeader A;
    private ContextMenuButton B;
    private TrackCarouselView C;
    private MarqueeTrackInfoView D;
    private TrackDownloadButton E;
    private PersistentSeekbarView F;
    private HeartButton G;
    private PreviousButton H;
    private PlayPauseButton I;
    private NextButton J;
    private BanButton K;
    private ConnectView L;
    private ShareButton M;
    private CanvasArtistWidgetView N;
    private WidgetsContainer O;
    private final b a;
    private final c b;
    private final l c;
    private final gyb d;
    private final brb e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final r g;
    private final e h;
    private final g i;
    private final com.spotify.nowplaying.ui.components.controls.previous.e j;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e k;
    private final f l;
    private final com.spotify.music.nowplaying.common.view.ban.e m;
    private final jrb n;
    private final prb o;
    private final com.spotify.music.nowplaying.common.view.share.e p;
    private final h q;
    private final grb r;
    private final com.spotify.nowplaying.core.orientation.b s;
    private final com.spotify.nowplaying.ui.components.overlay.h t;
    private final d0 u;
    private final com.spotify.music.newplaying.scroll.e v;
    private final Picasso w;
    private OverlayHidingGradientBackgroundView x;
    private PeekScrollView y;
    private CloseButton z;

    s3c(b bVar, c cVar, l lVar, gyb gyb, brb brb, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, r rVar, e eVar, g gVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, f fVar, com.spotify.music.nowplaying.common.view.ban.e eVar4, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.share.e eVar5, h hVar, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, com.spotify.nowplaying.ui.components.overlay.h hVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar6, Picasso picasso, o3c o3c) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = gyb;
        this.e = brb;
        this.f = cVar2;
        this.g = rVar;
        this.h = eVar;
        this.i = gVar;
        this.j = eVar2;
        this.k = eVar3;
        this.l = fVar;
        this.m = eVar4;
        this.n = jrb;
        this.o = prb;
        this.p = eVar5;
        this.q = hVar;
        this.r = grb;
        this.s = bVar2;
        this.t = hVar2;
        this.u = d0Var;
        this.v = eVar6;
        this.w = picasso;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_scrolling_responsive_shuffle_freetier_player, viewGroup, false);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.x = overlayHidingGradientBackgroundView;
        overlayHidingGradientBackgroundView.setOverlayView(overlayHidingGradientBackgroundView.findViewById(C0707R.id.player_overlay));
        this.y = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.z = (CloseButton) this.x.findViewById(C0707R.id.close_button);
        this.A = (TitleHeader) this.x.findViewById(C0707R.id.title_header);
        this.B = (ContextMenuButton) this.x.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.x.findViewById(C0707R.id.track_carousel);
        this.C = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.D = (MarqueeTrackInfoView) this.x.findViewById(C0707R.id.track_info_view);
        this.E = (TrackDownloadButton) this.x.findViewById(C0707R.id.track_download_button);
        this.F = (PersistentSeekbarView) this.x.findViewById(C0707R.id.seek_bar_view);
        this.G = (HeartButton) this.x.findViewById(C0707R.id.heart_button);
        this.H = (PreviousButton) this.x.findViewById(C0707R.id.previous_button);
        this.I = (PlayPauseButton) this.x.findViewById(C0707R.id.play_pause_button);
        this.J = (NextButton) this.x.findViewById(C0707R.id.next_button);
        this.K = (BanButton) this.x.findViewById(C0707R.id.ban_button);
        this.L = (ConnectView) this.x.findViewById(C0707R.id.connect_view_root);
        this.M = (ShareButton) this.x.findViewById(C0707R.id.share_button);
        CanvasArtistWidgetView canvasArtistWidgetView = (CanvasArtistWidgetView) this.x.findViewById(C0707R.id.canvas_artist_view);
        this.N = canvasArtistWidgetView;
        canvasArtistWidgetView.setPicasso(this.w);
        this.O = (WidgetsContainer) inflate.findViewById(C0707R.id.widgets_container);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.s.b();
        this.r.d(this.x);
        this.a.b(this.z);
        this.b.c(this.A);
        this.c.d(this.B);
        this.d.d(this.C);
        this.f.d(this.D);
        this.g.e(this.E);
        this.h.e(this.F);
        this.i.c(this.G);
        this.j.d(this.H);
        this.k.d(this.I);
        this.l.c(this.J);
        this.m.c(this.K);
        this.n.b(this.o.b(this.L));
        this.p.c(this.M);
        this.q.e(this.N, this.x.t());
        this.v.a(this.x, this.y);
        this.u.f(this.O);
        this.t.b(this.x);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.s.c();
        this.r.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.f.e();
        this.g.f();
        this.h.f();
        this.i.d();
        this.j.e();
        this.k.e();
        this.l.d();
        this.m.d();
        this.n.a();
        this.p.d();
        this.q.f();
        this.v.b();
        this.u.g();
        this.t.c();
    }
}
