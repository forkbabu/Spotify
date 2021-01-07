package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.nowplaying.common.view.BackgroundColorView;
import com.spotify.music.carmode.nowplaying.common.view.CarModePlayPauseButton;
import com.spotify.music.carmode.nowplaying.common.view.CarModeSeekBarView;
import com.spotify.music.carmode.nowplaying.common.view.ContextHeaderView;
import com.spotify.music.carmode.nowplaying.common.view.optout.CarModeOptOutButton;
import com.spotify.music.nowplaying.common.view.close.CloseButton;
import com.spotify.music.nowplaying.common.view.close.b;
import com.spotify.music.nowplaying.common.view.header.c;
import com.spotify.music.nowplaying.common.view.pager.TrackCarouselView;
import com.spotify.music.nowplaying.common.view.pager.f;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.player.model.ContextTrack;

/* renamed from: no2  reason: default package */
public class no2 implements fqd {
    private CarModeOptOutButton A;
    private final b a;
    private final c b;
    private final grb c;
    private final vo2 f;
    private final f n;
    private final com.spotify.music.nowplaying.common.view.trackinfo.c o;
    private final e p;
    private final com.spotify.nowplaying.ui.components.controls.seekbar.e q;
    private final com.spotify.music.carmode.nowplaying.common.view.optout.e r;
    private final com.spotify.nowplaying.core.orientation.b s;
    private CloseButton t;
    private ContextHeaderView u;
    private BackgroundColorView v;
    private TrackCarouselView w;
    private MarqueeTrackInfoView x;
    private CarModeSeekBarView y;
    private CarModePlayPauseButton z;

    public no2(b bVar, c cVar, grb grb, vo2 vo2, f fVar, com.spotify.music.nowplaying.common.view.trackinfo.c cVar2, com.spotify.nowplaying.ui.components.controls.seekbar.e eVar, e eVar2, com.spotify.music.carmode.nowplaying.common.view.optout.e eVar3, com.spotify.nowplaying.core.orientation.b bVar2) {
        this.a = bVar;
        this.b = cVar;
        this.c = grb;
        this.f = vo2;
        this.n = fVar;
        this.o = cVar2;
        this.q = eVar;
        this.p = eVar2;
        this.r = eVar3;
        this.s = bVar2;
    }

    public /* synthetic */ void a(View view, View view2) {
        View view3;
        if (q4.o(view) == 0) {
            view3 = view.findViewById(C0707R.id.guideline_content_start);
        } else {
            view3 = view.findViewById(C0707R.id.guideline_content_end);
        }
        int left = view3.getLeft();
        this.y.setPadding(left, 0, left, 0);
    }

    public b5 b(View view, b5 b5Var) {
        CloseButton closeButton = this.t;
        int j = b5Var.j();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) closeButton.getLayoutParams();
        if (marginLayoutParams.topMargin != j) {
            marginLayoutParams.topMargin = j;
            closeButton.setLayoutParams(marginLayoutParams);
        }
        return b5Var;
    }

    public void c(View view) {
        CloseButton closeButton = (CloseButton) q4.G(view, C0707R.id.close_button);
        this.t = closeButton;
        closeButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.u = (ContextHeaderView) q4.G(view, C0707R.id.context_header);
        this.v = (BackgroundColorView) q4.G(view, C0707R.id.background_color_view);
        this.x = (MarqueeTrackInfoView) q4.G(view, C0707R.id.track_info_view);
        this.y = (CarModeSeekBarView) q4.G(view, C0707R.id.seek_bar_view);
        this.A = (CarModeOptOutButton) q4.G(view, C0707R.id.car_mode_opt_out_button);
        bd0.b(view, new jo2(this, view), false);
        TrackCarouselView trackCarouselView = (TrackCarouselView) q4.G(view, C0707R.id.track_carousel);
        this.w = trackCarouselView;
        trackCarouselView.setAdapter((drb<com.spotify.mobile.android.spotlets.common.recyclerview.e<ContextTrack>>) this.f);
        this.z = (CarModePlayPauseButton) q4.G(view, C0707R.id.play_pause_button);
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            int d = a.d(this.t.getContext());
            CloseButton closeButton2 = this.t;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) closeButton2.getLayoutParams();
            if (marginLayoutParams.topMargin != d) {
                marginLayoutParams.topMargin = d;
                closeButton2.setLayoutParams(marginLayoutParams);
            }
        } else {
            q4.P(this.t, new io2(this));
        }
        if (i >= 21) {
            view.setSystemUiVisibility(768);
            q4.P(view, new ho2(view));
        }
    }

    public void d() {
        this.a.b(this.t);
        this.b.c(this.u);
        this.n.d(this.w);
        this.o.d(this.x);
        this.q.e(this.y);
        this.p.d(this.z);
        this.r.c(this.A);
        this.c.d(this);
        this.s.b();
    }

    public void e() {
        this.c.c();
        this.a.c();
        this.b.d();
        this.n.e();
        this.o.e();
        this.q.f();
        this.p.e();
        this.r.d();
        this.s.c();
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        this.v.setColor(i);
        this.z.setColor(i);
    }
}
