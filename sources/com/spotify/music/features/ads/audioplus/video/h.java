package com.spotify.music.features.ads.audioplus.video;

import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.t;
import com.spotify.music.features.ads.audioplus.video.views.VideoPlayPauseButton;
import com.spotify.music.features.ads.audioplus.video.views.VideoRendererView;
import com.spotify.music.features.ads.audioplus.video.views.f;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.rxjava2.p;
import io.reactivex.z;

/* access modifiers changed from: package-private */
public class h implements VideoPlayPauseButton.a {
    private final Ad a;
    private final l0 b;
    private final z<s> c;
    private r d;
    private f e;
    private final p f = new p();

    protected h(Ad ad, z<s> zVar, l0 l0Var) {
        this.a = ad;
        this.c = zVar;
        this.b = l0Var;
    }

    @Override // com.spotify.music.features.ads.audioplus.video.views.VideoPlayPauseButton.a
    public void a() {
        if (this.e.getIsPlaying()) {
            ((VideoRendererView) this.e).D(this.d);
            this.e.setIsPlaying(false);
            return;
        }
        ((VideoRendererView) this.e).E(this.d, true);
        this.e.setIsPlaying(true);
    }

    public void b(s sVar) {
        l0 l0Var = this.b;
        sVar.d(kfd.a.getName());
        sVar.i(l0Var);
        sVar.g(false);
        r a2 = sVar.a();
        this.d = a2;
        ((t) a2).P(false);
        ((VideoRendererView) this.e).G(this.d, this.b, false);
        this.e.setIsPlaying(true);
    }

    /* access modifiers changed from: protected */
    public void c(f fVar) {
        String str;
        this.e = fVar;
        if (this.a.getVideos().isEmpty() || (str = this.a.getVideos().get(0).getUrl()) == null) {
            str = "";
        }
        this.e.setPlayPauseListener(this);
        this.e.setVideoRequest(str);
        this.f.b(this.c.subscribe(new d(this)));
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f.a();
        ((VideoRendererView) this.e).J(this.d, this.b);
        this.e.setIsPlaying(false);
    }
}
