package com.spotify.music.features.ads.audioplus.video.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.r;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.audioplus.video.views.VideoPlayPauseButton;

public class VideoRendererView extends ConstraintLayout implements f {
    private final VideoSurfaceView a;
    private final VideoPlayPauseButton b;
    String c;
    private boolean f;

    public VideoRendererView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean C() {
        return !TextUtils.isEmpty(this.c);
    }

    public void D(r rVar) {
        if (C()) {
            rVar.pause();
            this.b.c();
        }
    }

    public void E(r rVar, boolean z) {
        if (C()) {
            rVar.resume();
            this.b.e();
        }
    }

    public void G(r rVar, l0 l0Var, boolean z) {
        if (C()) {
            l0Var.e(this.a);
            rVar.a0(!z);
            e0.a a2 = e0.a();
            a2.f(this.c);
            a2.d(false);
            a2.e(false);
            rVar.K(a2.b());
        }
    }

    public void J(r rVar, l0 l0Var) {
        if (C()) {
            rVar.stop();
            l0Var.k(this.a);
        }
    }

    @Override // com.spotify.music.features.ads.audioplus.video.views.f
    public boolean getIsPlaying() {
        return this.f;
    }

    @Override // com.spotify.music.features.ads.audioplus.video.views.f
    public void setIsPlaying(boolean z) {
        this.f = z;
    }

    @Override // com.spotify.music.features.ads.audioplus.video.views.f
    public void setPlayPauseListener(VideoPlayPauseButton.a aVar) {
        this.b.setListener(aVar);
    }

    @Override // com.spotify.music.features.ads.audioplus.video.views.f
    public void setVideoRequest(String str) {
        this.c = str;
    }

    public VideoRendererView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(getContext(), C0707R.layout.video_renderer_layout, this);
        this.a = (VideoSurfaceView) findViewById(C0707R.id.video_surface);
        this.b = (VideoPlayPauseButton) findViewById(C0707R.id.btn_play_pause);
    }
}
