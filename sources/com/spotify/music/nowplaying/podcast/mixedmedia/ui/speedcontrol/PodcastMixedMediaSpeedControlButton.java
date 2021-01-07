package com.spotify.music.nowplaying.podcast.mixedmedia.ui.speedcontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.nowplaying.podcast.speedcontrol.SpeedControlButton;
import com.spotify.music.nowplaying.podcast.speedcontrol.g;
import kotlin.jvm.internal.h;

public final class PodcastMixedMediaSpeedControlButton extends FrameLayout implements g {
    private final SpeedControlButton a;

    static final class a implements View.OnClickListener {
        final /* synthetic */ PodcastMixedMediaSpeedControlButton a;

        a(PodcastMixedMediaSpeedControlButton podcastMixedMediaSpeedControlButton) {
            this.a = podcastMixedMediaSpeedControlButton;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a.performClick();
        }
    }

    public PodcastMixedMediaSpeedControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setActive(boolean z) {
        this.a.setActive(z);
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setListener(g.a aVar) {
        h.e(aVar, "listener");
        this.a.setListener(aVar);
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.g
    public void setSpeed(String str) {
        h.e(str, "speed");
        this.a.setSpeed(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodcastMixedMediaSpeedControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.c(context);
        SpeedControlButton speedControlButton = new SpeedControlButton(context, attributeSet, i);
        this.a = speedControlButton;
        addView(speedControlButton);
        setOnClickListener(new a(this));
    }
}
