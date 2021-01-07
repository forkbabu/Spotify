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
import com.spotify.music.nowplaying.common.view.queue.QueueButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplaying.musicvideotoggle.widget.nextbutton.MusicVideoToggleNextButton;
import com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton.MusicVideoTogglePreviousButton;
import com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.MusicVideoToggleButton;
import com.spotify.music.offlinetrials.limited.uicomponents.TrackDownloadButton;
import com.spotify.music.offlinetrials.limited.uicomponents.r;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
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
/* renamed from: vyb  reason: default package */
public final class vyb implements cqd.a {
    private OverlayHidingGradientBackgroundView A;
    private PeekScrollView B;
    private CloseButton C;
    private TitleHeader D;
    private ContextMenuButton E;
    private TrackCarouselView F;
    private MarqueeTrackInfoView G;
    private HeartButton H;
    private TrackDownloadButton I;
    private PersistentSeekbarView J;
    private ShuffleButton K;
    private MusicVideoTogglePreviousButton L;
    private PlayPauseButton M;
    private MusicVideoToggleNextButton N;
    private RepeatButton O;
    private ConnectView P;
    private QueueButton Q;
    private CanvasArtistWidgetView R;
    private WidgetsContainer S;
    private MusicVideoToggleButton T;
    private final b a;
    private final c b;
    private final l c;
    private final lzb d;
    private final hzb e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final g g;
    private final r h;
    private final e i;
    private final vqd j;
    private final d k;
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton.d l;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e m;
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.nextbutton.c n;
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
    private final com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.e z;

    vyb(b bVar, c cVar, l lVar, lzb lzb, hzb hzb, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, g gVar, r rVar, e eVar, vqd vqd, d dVar, com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton.d dVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar2, com.spotify.music.nowplaying.musicvideotoggle.widget.nextbutton.c cVar3, com.spotify.nowplaying.ui.components.repeat.d dVar3, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.queue.c cVar4, h hVar, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, com.spotify.nowplaying.ui.components.overlay.h hVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar3, Picasso picasso, tyb tyb, com.spotify.music.nowplaying.musicvideotoggle.widget.togglebutton.e eVar4) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = lzb;
        this.e = hzb;
        this.f = cVar2;
        this.g = gVar;
        this.h = rVar;
        this.i = eVar;
        this.j = vqd;
        this.k = dVar;
        this.l = dVar2;
        this.m = eVar2;
        this.n = cVar3;
        this.o = dVar3;
        this.p = jrb;
        this.q = prb;
        this.r = cVar4;
        this.s = hVar;
        this.t = grb;
        this.u = bVar2;
        this.v = hVar2;
        this.w = d0Var;
        this.x = eVar3;
        this.y = picasso;
        this.z = eVar4;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.music_video_toggle_scrolling_player, viewGroup, false);
        this.A = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.B = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.C = (CloseButton) this.A.findViewById(C0707R.id.close_button);
        this.D = (TitleHeader) this.A.findViewById(C0707R.id.title_header);
        this.E = (ContextMenuButton) this.A.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.A.findViewById(C0707R.id.track_carousel);
        this.F = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.G = (MarqueeTrackInfoView) this.A.findViewById(C0707R.id.track_info_view);
        this.H = (HeartButton) this.A.findViewById(C0707R.id.heart_button);
        this.I = (TrackDownloadButton) this.A.findViewById(C0707R.id.track_download_button);
        this.T = (MusicVideoToggleButton) this.A.findViewById(C0707R.id.music_video_toggle);
        this.J = (PersistentSeekbarView) this.A.findViewById(C0707R.id.seek_bar_view);
        this.K = (ShuffleButton) this.A.findViewById(C0707R.id.shuffle_button);
        this.L = (MusicVideoTogglePreviousButton) this.A.findViewById(C0707R.id.previous_button);
        this.M = (PlayPauseButton) this.A.findViewById(C0707R.id.play_pause_button);
        this.N = (MusicVideoToggleNextButton) this.A.findViewById(C0707R.id.next_button);
        this.O = (RepeatButton) this.A.findViewById(C0707R.id.repeat_button);
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
        this.d.d(this.F);
        this.f.d(this.G);
        this.g.c(this.H);
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
        this.z.d(this.T);
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
        this.z.e();
    }
}
