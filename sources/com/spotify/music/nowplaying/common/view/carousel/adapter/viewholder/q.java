package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.b0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.k0;
import com.spotify.mobile.android.video.l0;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.carousel.a;
import com.spotify.player.model.ContextTrack;

public class q extends i implements a.AbstractC0362a {
    private final l0 F;
    private final VideoSurfaceView G;
    private final View H = this.a.findViewById(C0707R.id.content);

    class a implements k0 {
        a() {
        }

        @Override // com.spotify.mobile.android.video.k0
        public void a(VideoSurfaceView videoSurfaceView) {
            q.this.B0();
        }

        @Override // com.spotify.mobile.android.video.k0
        public void b(VideoSurfaceView videoSurfaceView) {
            q.this.G.requestLayout();
        }

        @Override // com.spotify.mobile.android.video.k0
        public void c(VideoSurfaceView videoSurfaceView) {
            q.this.w0();
        }

        @Override // com.spotify.mobile.android.video.k0
        public void d(VideoSurfaceView videoSurfaceView) {
        }
    }

    private static final class b implements b0 {
        private final ContextTrack a;
        private final q b;

        b(ContextTrack contextTrack, q qVar) {
            this.a = contextTrack;
            this.b = qVar;
        }

        @Override // com.spotify.mobile.android.video.b0
        public boolean a(d0 d0Var) {
            d0Var.getClass();
            return PlayerTrackUtil.areUidsOrUrisEqual(ixd.b(this.a), d0Var.c().get("endvideo_track_uid"), d0Var.c().get("endvideo_track_uri")) && ((com.spotify.paste.widgets.carousel.a) this.b.a.getTag(C0707R.id.paste_carousel_tag)).c();
        }
    }

    public q(LayoutInflater layoutInflater, zvd zvd, l0 l0Var, ViewGroup viewGroup) {
        super(layoutInflater, zvd, C0707R.layout.player_v2_video_content, viewGroup);
        View findViewById = this.a.findViewById(C0707R.id.video_surface);
        findViewById.getClass();
        this.G = (VideoSurfaceView) findViewById;
        this.F = l0Var;
    }

    private void E0() {
        this.G.setVideoSurfaceCallback(null);
        this.F.k(this.G);
        com.spotify.paste.widgets.carousel.a aVar = (com.spotify.paste.widgets.carousel.a) this.a.getTag(C0707R.id.paste_carousel_tag);
        if (aVar != null) {
            aVar.e(null);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(ContextTrack contextTrack, int i) {
        VideoSurfaceView.ScaleType scaleType;
        ContextTrack contextTrack2 = contextTrack;
        super.u0(contextTrack2, i);
        VideoSurfaceView videoSurfaceView = this.G;
        String str = contextTrack2.metadata().get("context_uri");
        if (str == null || !str.contains("spotify:user:spotify:playlist:37i9dQZF1DWVhx3Jw2ZqKI")) {
            scaleType = VideoSurfaceView.ScaleType.ASPECT_FILL;
        } else {
            scaleType = VideoSurfaceView.ScaleType.ASPECT_FIT;
        }
        videoSurfaceView.setScaleType(scaleType);
        this.G.setPlayablePredicate(new b(contextTrack2, this));
    }

    @Override // com.spotify.paste.widgets.carousel.a.AbstractC0362a
    public void i() {
        this.G.g();
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void l0() {
        this.G.setVideoSurfaceCallback(new a());
        this.F.e(this.G);
        com.spotify.paste.widgets.carousel.a aVar = (com.spotify.paste.widgets.carousel.a) this.a.getTag(C0707R.id.paste_carousel_tag);
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void m0() {
        E0();
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void s0() {
        E0();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.i
    public View v0() {
        return this.H;
    }
}
