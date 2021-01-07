package com.spotify.music.nowplaying.videoads.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.C0707R;

public class VideoAdsRendererView extends ConstraintLayout {
    private VideoSurfaceView a;

    public VideoAdsRendererView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final VideoSurfaceView getVideoSurfaceView() {
        return this.a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public VideoAdsRendererView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(getContext(), C0707R.layout.video_ads_renderer, this);
        this.a = (VideoSurfaceView) findViewById(C0707R.id.video_surface_view);
    }
}
