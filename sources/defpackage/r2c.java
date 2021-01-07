package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.contextmenu.ContextMenuButton;
import com.spotify.music.nowplaying.common.view.contextmenu.l;
import com.spotify.music.nowplaying.common.view.header.TitleHeader;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.share.ShareButton;
import com.spotify.music.nowplaying.podcast.sleeptimer.SleepTimerButton;
import com.spotify.music.nowplaying.podcast.speedcontrol.SpeedControlButton;
import com.spotify.music.nowplaying.podcastads.cta.CallToActionButton;
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

/* renamed from: r2c  reason: default package */
final class r2c implements cqd.a {
    private PlayPauseButton A;
    private SeekForwardButton B;
    private SleepTimerButton C;
    private ConnectView D;
    private ShareButton E;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final e0c e;
    private final com.spotify.music.nowplaying.podcastads.cta.c f;
    private final e g;
    private final com.spotify.music.nowplaying.podcast.speedcontrol.e h;
    private final h i;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e j;
    private final g k;
    private final com.spotify.music.nowplaying.podcast.sleeptimer.e l;
    private final jrb m;
    private final prb n;
    private final com.spotify.music.nowplaying.common.view.share.e o;
    private final grb p;
    private final com.spotify.nowplaying.core.orientation.b q;
    private OverlayHidingGradientBackgroundView r;
    private CloseButton s;
    private TitleHeader t;
    private ContextMenuButton u;
    private TrackCarouselView v;
    private CallToActionButton w;
    private PersistentSeekbarView x;
    private SpeedControlButton y;
    private SeekBackwardButton z;

    r2c(b bVar, c cVar, l lVar, f fVar, e0c e0c, com.spotify.music.nowplaying.podcastads.cta.c cVar2, e eVar, com.spotify.music.nowplaying.podcast.speedcontrol.e eVar2, h hVar, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, g gVar, com.spotify.music.nowplaying.podcast.sleeptimer.e eVar4, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.share.e eVar5, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, n2c n2c) {
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
        this.p = grb;
        this.q = bVar2;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.nowplaying_podcast_ads_player, viewGroup, false);
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) inflate.findViewById(C0707R.id.overlay_hiding_layout);
        this.r = overlayHidingGradientBackgroundView;
        overlayHidingGradientBackgroundView.setHidingEnabled(false);
        this.s = (CloseButton) this.r.findViewById(C0707R.id.close_button);
        this.t = (TitleHeader) this.r.findViewById(C0707R.id.title_header);
        this.u = (ContextMenuButton) this.r.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.r.findViewById(C0707R.id.track_carousel);
        this.v = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.w = (CallToActionButton) this.r.findViewById(C0707R.id.podcast_ad_cta_button);
        this.x = (PersistentSeekbarView) this.r.findViewById(C0707R.id.seek_bar_view);
        this.y = (SpeedControlButton) this.r.findViewById(C0707R.id.speed_control_button);
        this.z = (SeekBackwardButton) this.r.findViewById(C0707R.id.seek_backward_button);
        this.A = (PlayPauseButton) this.r.findViewById(C0707R.id.play_pause_button);
        this.B = (SeekForwardButton) this.r.findViewById(C0707R.id.seek_forward_button);
        this.C = (SleepTimerButton) this.r.findViewById(C0707R.id.sleep_timer_button);
        this.D = (ConnectView) this.r.findViewById(C0707R.id.connect_view_root);
        this.E = (ShareButton) this.r.findViewById(C0707R.id.share_button);
        return inflate;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.q.b();
        this.p.d(this.r);
        this.a.b(this.s);
        this.b.c(this.t);
        this.c.d(this.u);
        this.d.d(this.v);
        this.f.c(this.w);
        this.g.e(this.x);
        this.h.e(this.y);
        this.i.d(this.z);
        this.j.d(this.A);
        this.k.d(this.B);
        this.l.d(this.C);
        this.m.b(this.n.b(this.D));
        this.o.c(this.E);
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.q.c();
        this.p.c();
        this.a.c();
        this.b.d();
        this.c.e();
        this.d.e();
        this.f.d();
        this.g.f();
        this.h.f();
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.a();
        this.o.d();
    }
}
