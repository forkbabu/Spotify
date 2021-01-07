package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import com.spotify.music.newplaying.scroll.container.d0;
import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.music.nowplaying.podcast.sleeptimer.SleepTimerButton;
import com.spotify.music.nowplaying.podcast.speedcontrol.SpeedControlButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import com.spotify.player.model.ContextTrack;
import defpackage.cqd;

/* renamed from: c0c  reason: default package */
final class c0c implements cqd.a {
    private MarqueeTrackInfoView A;
    private PersistentSeekbarView B;
    private SpeedControlButton C;
    private SeekBackwardButton D;
    private PlayPauseButton E;
    private SeekForwardButton F;
    private SleepTimerButton G;
    private ConnectView H;
    private ShareButton I;
    private WidgetsContainer J;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final e0c e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final e g;
    private final com.spotify.music.nowplaying.podcast.speedcontrol.e h;
    private final h i;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e j;
    private final g k;
    private final com.spotify.music.nowplaying.podcast.sleeptimer.e l;
    private final jrb m;
    private final prb n;
    private final com.spotify.music.nowplaying.common.view.share.e o;
    private final com.spotify.nowplaying.ui.components.overlay.h p;
    private final grb q;
    private final com.spotify.nowplaying.core.orientation.b r;
    private final d0 s;
    private final com.spotify.music.newplaying.scroll.e t;
    private OverlayHidingGradientBackgroundView u;
    private PeekScrollView v;
    private CloseButton w;
    private TitleHeader x;
    private ContextMenuButton y;
    private TrackCarouselView z;

    public c0c(b bVar, c cVar, l lVar, f fVar, e0c e0c, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, e eVar, com.spotify.music.nowplaying.podcast.speedcontrol.e eVar2, h hVar, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, g gVar, com.spotify.music.nowplaying.podcast.sleeptimer.e eVar4, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.share.e eVar5, com.spotify.nowplaying.ui.components.overlay.h hVar2, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, d0 d0Var, com.spotify.music.newplaying.scroll.e eVar6, yzb yzb) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = fVar;
        this.e = e0c;
        this.f = cVar2;
        this.g = eVar;
        this.h = eVar2;
        this.i = hVar;
        this.j = eVar3;
        this.k = gVar;
        this.l = eVar4;
        this.m = jrb;
        this.n = prb;
        this.o = eVar5;
        this.p = hVar2;
        this.q = grb;
        this.r = bVar2;
        this.s = d0Var;
        this.t = eVar6;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.newplaying_scrolling_podcast_player, viewGroup, false);
        this.u = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.v = (PeekScrollView) inflate.findViewById(C0707R.id.scroll_container);
        this.w = (CloseButton) this.u.findViewById(C0707R.id.close_button);
        this.x = (TitleHeader) this.u.findViewById(C0707R.id.title_header);
        this.y = (ContextMenuButton) this.u.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.u.findViewById(C0707R.id.track_carousel);
        this.z = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.A = (MarqueeTrackInfoView) this.u.findViewById(C0707R.id.track_info_view);
        this.B = (PersistentSeekbarView) this.u.findViewById(C0707R.id.seek_bar_view);
        this.C = (SpeedControlButton) this.u.findViewById(C0707R.id.speed_control_button);
        this.D = (SeekBackwardButton) this.u.findViewById(C0707R.id.seek_backward_button);
        this.E = (PlayPauseButton) this.u.findViewById(C0707R.id.play_pause_button);
        this.F = (SeekForwardButton) this.u.findViewById(C0707R.id.seek_forward_button);
        this.G = (SleepTimerButton) this.u.findViewById(C0707R.id.sleep_timer_button);
        this.H = (ConnectView) this.u.findViewById(C0707R.id.connect_view_root);
        this.I = (ShareButton) this.u.findViewById(C0707R.id.share_button);
        this.J = (WidgetsContainer) inflate.findViewById(C0707R.id.widgets_container);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.r.b();
        this.q.d(this.u);
        this.a.b(this.w);
        this.b.c(this.x);
        this.c.d(this.y);
        this.d.d(this.z);
        this.f.d(this.A);
        this.g.e(this.B);
        this.h.e(this.C);
        this.i.d(this.D);
        this.j.d(this.E);
        this.k.d(this.F);
        this.l.d(this.G);
        this.m.b(this.n.b(this.H));
        this.o.c(this.I);
        this.t.a(this.u, this.v);
        this.s.f(this.J);
        this.p.b(this.u);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.r.c();
        this.q.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.f.e();
        this.g.f();
        this.h.f();
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.a();
        this.o.d();
        this.t.b();
        this.s.g();
        this.p.c();
    }
}
