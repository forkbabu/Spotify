package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.ads.uicomponents.secondaryintent.BookmarkAdButton;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.skippable.view.SkippableAdTextView;
import com.spotify.music.nowplaying.ads.view.AudioAdsActionsView;
import com.spotify.music.nowplaying.ads.view.AudioAdsHeaderView;
import com.spotify.music.nowplaying.ads.view.VoiceAdsView;
import com.spotify.music.nowplaying.ads.view.nextbutton.AudioAdsNextButton;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.nowplaying.core.immersive.c;
import com.spotify.nowplaying.ui.components.controls.playpause.PlayPauseButton;
import com.spotify.nowplaying.ui.components.controls.previous.PreviousButton;
import com.spotify.nowplaying.ui.components.controls.seekbar.PersistentSeekbarView;
import com.spotify.nowplaying.ui.components.controls.seekbar.e;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingGradientBackgroundView;
import defpackage.cqd;

/* renamed from: lob  reason: default package */
final class lob implements cqd.a {
    private SkippableAdTextView A;
    private BookmarkAdButton B;
    private VoiceAdsView C;
    private TextView D;
    private final aqb a;
    private final wpb b;
    private final e c;
    private final b d;
    private final ypb e;
    private final c f;
    private final com.spotify.nowplaying.ui.components.controls.previous.e g;
    private final com.spotify.nowplaying.ui.components.controls.playpause.e h;
    private final com.spotify.music.nowplaying.ads.view.nextbutton.c i;
    private final eqb j;
    private final cqb k;
    private final grb l;
    private final com.spotify.nowplaying.core.orientation.b m;
    private final gqb n;
    private final lqb o;
    private final oob p;
    private final iqb q;
    private OverlayHidingGradientBackgroundView r;
    private CloseButton s;
    private AudioAdsHeaderView t;
    private AudioAdsActionsView u;
    private ImageView v;
    private PersistentSeekbarView w;
    private PreviousButton x;
    private PlayPauseButton y;
    private AudioAdsNextButton z;

    lob(aqb aqb, wpb wpb, e eVar, b bVar, ypb ypb, c cVar, com.spotify.nowplaying.ui.components.controls.previous.e eVar2, com.spotify.nowplaying.ui.components.controls.playpause.e eVar3, com.spotify.music.nowplaying.ads.view.nextbutton.c cVar2, eqb eqb, cqb cqb, grb grb, com.spotify.nowplaying.core.orientation.b bVar2, gqb gqb, lqb lqb, oob oob, hob hob, iqb iqb) {
        this.a = aqb;
        this.b = wpb;
        this.c = eVar;
        this.d = bVar;
        this.e = ypb;
        this.f = cVar;
        this.g = eVar2;
        this.h = eVar3;
        this.i = cVar2;
        this.j = eqb;
        this.k = cqb;
        this.l = grb;
        this.m = bVar2;
        this.n = gqb;
        this.o = lqb;
        this.p = oob;
        this.q = iqb;
    }

    @Override // defpackage.cqd.a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.fragment_audio_ads_npv, viewGroup, false);
        coordinatorLayout.setFitsSystemWindows(!x.f(coordinatorLayout.getContext()));
        OverlayHidingGradientBackgroundView overlayHidingGradientBackgroundView = (OverlayHidingGradientBackgroundView) coordinatorLayout.findViewById(C0707R.id.overlay_hiding_layout);
        this.r = overlayHidingGradientBackgroundView;
        overlayHidingGradientBackgroundView.setAutoHide(false);
        this.l.d(this.r);
        this.s = (CloseButton) coordinatorLayout.findViewById(C0707R.id.audio_ads_close_button);
        this.t = (AudioAdsHeaderView) coordinatorLayout.findViewById(C0707R.id.audio_ads_header);
        this.u = (AudioAdsActionsView) coordinatorLayout.findViewById(C0707R.id.audio_ads_action);
        this.v = (ImageView) coordinatorLayout.findViewById(C0707R.id.image);
        this.w = (PersistentSeekbarView) coordinatorLayout.findViewById(C0707R.id.seek_bar_view);
        this.x = (PreviousButton) coordinatorLayout.findViewById(C0707R.id.btn_prev);
        this.y = (PlayPauseButton) coordinatorLayout.findViewById(C0707R.id.btn_play);
        this.z = (AudioAdsNextButton) coordinatorLayout.findViewById(C0707R.id.btn_next);
        this.A = (SkippableAdTextView) coordinatorLayout.findViewById(C0707R.id.skip_ad_countdown);
        this.B = (BookmarkAdButton) coordinatorLayout.findViewById(C0707R.id.audio_ads_bookmark);
        this.C = (VoiceAdsView) coordinatorLayout.findViewById(C0707R.id.voice_ads_options);
        this.D = (TextView) coordinatorLayout.findViewById(C0707R.id.voice_legal_data_policy);
        return coordinatorLayout;
    }

    @Override // defpackage.cqd.a
    public void start() {
        this.l.c();
        this.m.b();
        this.f.b(com.spotify.nowplaying.core.immersive.e.a(this.r.t()));
        this.d.b(this.s);
        this.a.b(this.t);
        this.b.f(this.u);
        this.e.e(this.v);
        this.c.e(this.w);
        this.g.d(this.x);
        this.h.d(this.y);
        this.i.e(this.z);
        this.j.b(this.A, this.i);
        this.k.e(this.B);
        gqb gqb = this.n;
        gqb.j(this.C, this.y, this.o.b(gqb));
        this.b.h(this.n);
        this.e.g(this.n);
        this.q.b(this.D);
        this.p.g();
    }

    @Override // defpackage.cqd.a
    public void stop() {
        this.m.c();
        this.f.c();
        this.d.c();
        this.a.c();
        this.b.g();
        this.e.f();
        this.c.f();
        this.g.e();
        this.h.e();
        this.i.f();
        this.j.c();
        this.k.f();
        this.n.k();
        this.b.h(null);
        this.e.g(null);
        this.q.c();
    }
}
