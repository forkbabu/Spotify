package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.skippable.view.SkippableAdTextView;
import com.spotify.music.nowplaying.videoads.overlay.VideoAdOverlayHidingFrameLayout;
import com.spotify.music.nowplaying.videoads.widget.view.PlayPauseButton;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsActionView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsInfoView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsRendererView;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsTitleView;
import com.spotify.nowplaying.core.immersive.c;
import com.spotify.nowplaying.core.orientation.b;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import defpackage.cqd;

/* renamed from: n5c  reason: default package */
final class n5c implements cqd.a {
    private final e7c a;
    private final l7c b;
    private final e c;
    private final h7c d;
    private final z6c e;
    private final c7c f;
    private final x6c g;
    private final l0 h;
    private final b i;
    private final c j;
    private final wrb k;
    private final e5c l;
    private final c5c m;
    private final m6c n;
    private final hp3 o;
    private VideoAdOverlayHidingFrameLayout p;
    private VideoAdsTitleView q;
    private VideoAdsInfoView r;
    private SkippableAdTextView s;
    private com.spotify.music.nowplaying.videoads.widget.view.c t;
    private VideoSurfaceView u;
    private PlayPauseButton v;
    private VideoAdsActionView w;
    private BookmarkAdButton x;

    n5c(e7c e7c, l7c l7c, e eVar, h7c h7c, z6c z6c, c7c c7c, x6c x6c, l0 l0Var, b bVar, c cVar, wrb wrb, e5c e5c, c5c c5c, m6c m6c, hp3 hp3, j5c j5c) {
        this.a = e7c;
        this.b = l7c;
        this.c = eVar;
        this.d = h7c;
        this.e = z6c;
        this.f = c7c;
        this.g = x6c;
        this.h = l0Var;
        this.i = bVar;
        this.j = cVar;
        this.k = wrb;
        this.l = e5c;
        this.m = c5c;
        this.n = m6c;
        this.o = hp3;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = (VideoAdOverlayHidingFrameLayout) layoutInflater.inflate(C0707R.layout.fragment_video_ads_npv, viewGroup, false);
        this.p = videoAdOverlayHidingFrameLayout;
        videoAdOverlayHidingFrameLayout.setOverlayView(videoAdOverlayHidingFrameLayout.findViewById(C0707R.id.video_ads_player_overlay));
        this.p.setTimeoutDuration(this.o.a());
        this.q = (VideoAdsTitleView) this.p.findViewById(C0707R.id.video_ads_display_title);
        this.r = (VideoAdsInfoView) this.p.findViewById(C0707R.id.video_ads_info);
        this.v = (PlayPauseButton) this.p.findViewById(C0707R.id.play_pause_button);
        this.w = (VideoAdsActionView) this.p.findViewById(C0707R.id.ad_call_to_action);
        this.x = (BookmarkAdButton) this.p.findViewById(C0707R.id.video_ads_bookmark);
        this.s = (SkippableAdTextView) this.p.findViewById(C0707R.id.skip_ad_button);
        this.t = new com.spotify.music.nowplaying.videoads.widget.view.c((ProgressBar) this.p.findViewById(C0707R.id.playback_progress));
        this.u = ((VideoAdsRendererView) this.p.findViewById(C0707R.id.video_ads_renderer_view)).getVideoSurfaceView();
        return this.p;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.i.b();
        this.j.b(com.spotify.nowplaying.core.immersive.e.a(this.p.t()));
        e5c e5c = this.l;
        VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = this.p;
        e5c.b(videoAdOverlayHidingFrameLayout, (ConstraintLayout) videoAdOverlayHidingFrameLayout.findViewById(C0707R.id.video_ads_renderer_layout), (ConstraintLayout) this.p.findViewById(C0707R.id.video_ads_player_overlay), (ViewGroup) this.p.findViewById(C0707R.id.play_pause_button_container));
        this.l.e(this.m);
        this.b.b(this.q);
        this.a.b(this.r);
        this.m.f(this.p);
        this.c.d(this.v);
        this.e.e(this.w);
        this.f.f(this.x);
        this.g.c(this.s);
        this.d.b(this.t);
        this.k.c(this.p);
        this.h.e(this.u);
        this.n.c();
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.i.c();
        this.j.c();
        this.l.c();
        this.l.d();
        this.b.c();
        this.a.c();
        this.m.g();
        this.c.e();
        this.e.f();
        this.f.g();
        this.g.d();
        this.d.c();
        this.k.d();
        this.h.k(this.u);
        this.n.d();
    }
}
