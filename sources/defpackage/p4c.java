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
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.nowplaying.ui.components.controls.next.NextButton;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.SeekBackwardButton;
import com.spotify.nowplaying.ui.components.controls.seekbackward.h;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.controls.seekbar.live.LiveIndicatorView;
import com.spotify.nowplaying.ui.components.controls.seekforward.SeekForwardButton;
import com.spotify.nowplaying.ui.components.controls.seekforward.g;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import com.spotify.player.model.ContextTrack;
import defpackage.cqd;

/* renamed from: p4c  reason: default package */
final class p4c implements cqd.a {
    private MarqueeTrackInfoView A;
    private PersistentSeekbarView B;
    private LiveIndicatorView C;
    private SeekBackwardButton D;
    private PreviousButton E;
    private PlayPauseButton F;
    private NextButton G;
    private SeekForwardButton H;
    private ConnectView I;
    private ShareButton J;
    private final b a;
    private final c b;
    private final l c;
    private final f d;
    private final r4c e;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c f;
    private final e g;
    private final com.spotify.nowplaying.ui.components.controls.seekbar.live.c h;
    private final h i;
    private final com.spotify.nowplaying.ui.components.controls.previous.e j;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e k;
    private final com.spotify.nowplaying.ui.components.controls.next.f l;
    private final g m;
    private final jrb n;
    private final prb o;
    private final com.spotify.music.nowplaying.common.view.share.e p;
    private final wrb q;
    private final com.spotify.nowplaying.ui.components.overlay.h r;
    private final com.spotify.nowplaying.core.immersive.c s;
    private final grb t;
    private final com.spotify.nowplaying.core.orientation.b u;
    private OverlayHidingGradientBackgroundView v;
    private CloseButton w;
    private TitleHeader x;
    private ContextMenuButton y;
    private TrackCarouselView z;

    public p4c(b bVar, c cVar, l lVar, f fVar, r4c r4c, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, e eVar, com.spotify.nowplaying.ui.components.controls.seekbar.live.c cVar3, h hVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, com.spotify.nowplaying.ui.components.controls.next.f fVar2, g gVar, jrb jrb, prb prb, com.spotify.music.nowplaying.common.view.share.e eVar4, wrb wrb, com.spotify.nowplaying.ui.components.overlay.h hVar2, com.spotify.nowplaying.core.immersive.c cVar4, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, l4c l4c) {
        this.a = bVar;
        this.b = cVar;
        this.c = lVar;
        this.d = fVar;
        this.e = r4c;
        this.f = cVar2;
        this.g = eVar;
        this.h = cVar3;
        this.i = hVar;
        this.j = eVar2;
        this.k = eVar3;
        this.l = fVar2;
        this.m = gVar;
        this.n = jrb;
        this.o = prb;
        this.p = eVar4;
        this.q = wrb;
        this.r = hVar2;
        this.s = cVar4;
        this.t = grb;
        this.u = bVar2;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) layoutInflater.inflate(C0707R.layout.newplaying_video_show_player, viewGroup, false);
        this.v = overlayHidingGradientBackgroundView;
        this.w = (CloseButton) overlayHidingGradientBackgroundView.findViewById(C0707R.id.close_button);
        this.x = (TitleHeader) this.v.findViewById(C0707R.id.title_header);
        this.y = (ContextMenuButton) this.v.findViewById(C0707R.id.context_menu_button);
        TrackCarouselView trackCarouselView = (TrackCarouselView) this.v.findViewById(C0707R.id.track_carousel);
        this.z = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.e);
        this.A = (MarqueeTrackInfoView) this.v.findViewById(C0707R.id.track_info_view);
        this.B = (PersistentSeekbarView) this.v.findViewById(C0707R.id.seek_bar_view);
        this.C = (LiveIndicatorView) this.v.findViewById(C0707R.id.live_indicator);
        this.D = (SeekBackwardButton) this.v.findViewById(C0707R.id.seek_backward_button);
        this.E = (PreviousButton) this.v.findViewById(C0707R.id.previous_button);
        this.F = (PlayPauseButton) this.v.findViewById(C0707R.id.play_pause_button);
        this.G = (NextButton) this.v.findViewById(C0707R.id.next_button);
        this.H = (SeekForwardButton) this.v.findViewById(C0707R.id.seek_forward_button);
        this.I = (ConnectView) this.v.findViewById(C0707R.id.connect_view_root);
        this.J = (ShareButton) this.v.findViewById(C0707R.id.share_button);
        return this.v;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.u.b();
        this.t.d(this.v);
        this.a.b(this.w);
        this.b.c(this.x);
        this.c.d(this.y);
        this.d.d(this.z);
        this.f.d(this.A);
        this.g.e(this.B);
        this.h.a(this.C);
        this.i.d(this.D);
        this.j.d(this.E);
        this.k.d(this.F);
        this.l.c(this.G);
        this.m.d(this.H);
        this.n.b(this.o.b(this.I));
        this.p.c(this.J);
        this.q.c(this.v);
        this.r.b(this.v);
        this.s.b(com.spotify.nowplaying.core.immersive.e.a(this.v.t()));
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
        this.g.f();
        this.h.b();
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.d();
        this.m.e();
        this.n.a();
        this.p.d();
        this.q.d();
        this.r.c();
        this.s.c();
    }
}
