package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.mobile.android.util.x;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.b0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.l0;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.carousel.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.remoteconfig.u8;
import java.util.List;
import java.util.concurrent.Executor;

public class j extends e<ContextTrack> implements a.AbstractC0362a {
    private final VideoSurfaceView C;
    private final l0 D;
    private final ViewGroup E;
    private final v8 F;
    private final Executor G;
    private final u8 H;
    private s3<l8> I;
    private final int J;

    private static final class b implements s3<l8> {
        private final j a;

        b(j jVar, a aVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.s3
        public void accept(l8 l8Var) {
            this.a.w0();
        }
    }

    private static final class c implements b0 {
        private final ContextTrack a;
        private final j b;

        c(ContextTrack contextTrack, j jVar) {
            this.b = jVar;
            contextTrack.getClass();
            this.a = contextTrack;
        }

        @Override // com.spotify.mobile.android.video.b0
        public boolean a(d0 d0Var) {
            d0Var.getClass();
            return PlayerTrackUtil.areUidsOrUrisEqual(ixd.b(this.a), d0Var.c().get("endvideo_track_uid"), d0Var.c().get("endvideo_track_uri")) && ((com.spotify.paste.widgets.carousel.a) this.b.a.getTag(C0707R.id.paste_carousel_tag)).c();
        }
    }

    public j(LayoutInflater layoutInflater, l0 l0Var, DisplayMetrics displayMetrics, v8 v8Var, Executor executor, u8 u8Var, ViewGroup viewGroup) {
        super(layoutInflater.inflate(C0707R.layout.player_v2_horizontal_video_content, viewGroup, false));
        this.E = (ViewGroup) viewGroup.getParent();
        View findViewById = this.a.findViewById(C0707R.id.video_surface);
        findViewById.getClass();
        this.C = (VideoSurfaceView) findViewById;
        this.D = l0Var;
        this.J = displayMetrics.heightPixels;
        this.F = v8Var;
        this.G = executor;
        this.H = u8Var;
    }

    private void v0() {
        this.C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void w0() {
        if (x.f(this.C.getContext())) {
            if (!(this.F.b().a() == 2) || !Boolean.valueOf(this.H.a()).booleanValue()) {
                v0();
                return;
            }
            List<m8> a2 = this.F.c().a();
            if (a2.size() >= 1) {
                Rect a3 = a2.get(0).a();
                int i = a3.top;
                if (i == a3.bottom) {
                    this.C.setLayoutParams(new FrameLayout.LayoutParams(((FrameLayout.LayoutParams) this.C.getLayoutParams()).width, i, 49));
                } else {
                    v0();
                }
            } else {
                v0();
            }
        } else {
            int i2 = this.J;
            View findViewById = this.E.findViewById(C0707R.id.player_overlay_header);
            View findViewById2 = this.E.findViewById(C0707R.id.player_overlay_footer);
            if (findViewById == null || findViewById2 == null) {
                throw new IllegalStateException("The Player Fragment layout is missing player_overlay_header and/or player_overlay_footer views, needed to position the video in between.");
            }
            int bottom = findViewById.getBottom() + nud.g(8.0f, this.E.getResources());
            int top = i2 - findViewById2.getTop();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.C.getLayoutParams();
            int i3 = layoutParams.height;
            int i4 = ((i2 - bottom) - i3) - top;
            if (i4 <= 0) {
                layoutParams.height = i3 + i4;
            } else {
                int i5 = i4 / 2;
                bottom += i5;
                top += i5;
            }
            layoutParams.setMargins(0, bottom, 0, top);
            this.C.setLayoutParams(layoutParams);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        w0();
        this.C.setPlayablePredicate(new c(contextTrack, this));
    }

    @Override // com.spotify.paste.widgets.carousel.a.AbstractC0362a
    public void i() {
        this.C.g();
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void l0() {
        this.D.e(this.C);
        com.spotify.paste.widgets.carousel.a aVar = (com.spotify.paste.widgets.carousel.a) this.a.getTag(C0707R.id.paste_carousel_tag);
        if (aVar != null) {
            aVar.e(this);
        }
        if (Build.VERSION.SDK_INT >= 28 && Boolean.valueOf(this.H.a()).booleanValue() && this.F.c().a().size() >= 1) {
            b bVar = new b(this, null);
            this.I = bVar;
            this.F.d(this.G, bVar);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void m0() {
        s3<l8> s3Var;
        this.C.setVideoSurfaceCallback(null);
        this.D.k(this.C);
        com.spotify.paste.widgets.carousel.a aVar = (com.spotify.paste.widgets.carousel.a) this.a.getTag(C0707R.id.paste_carousel_tag);
        if (aVar != null) {
            aVar.e(null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (s3Var = this.I) != null) {
            this.F.e(s3Var);
            this.I = null;
        }
    }
}
