package com.spotify.music.nowplaying.videoads.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout;
import com.spotify.nowplaying.ui.components.overlay.k;
import java.util.LinkedHashSet;
import java.util.Set;

public class VideoAdOverlayHidingFrameLayout extends OverlayHidingFrameLayout implements b {
    private final Set<k.a> w;
    private final GestureDetector x;
    private final Runnable y;
    private ViewGroup z;

    private class b extends GestureDetector.SimpleOnGestureListener {
        b(a aVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                return true;
            }
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout = VideoAdOverlayHidingFrameLayout.this;
            VideoAdOverlayHidingFrameLayout.z(videoAdOverlayHidingFrameLayout, !videoAdOverlayHidingFrameLayout.isVisible());
            return false;
        }
    }

    public VideoAdOverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setPlayPauseVisibility(int i) {
        ViewGroup viewGroup = this.z;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    static void z(VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout, boolean z2) {
        for (k.a aVar : videoAdOverlayHidingFrameLayout.w) {
            aVar.a(z2);
        }
    }

    public /* synthetic */ void A() {
        setPlayPauseVisibility(4);
    }

    @Override // com.spotify.music.nowplaying.videoads.overlay.b
    public boolean c() {
        ViewGroup viewGroup = this.z;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout, android.view.View, android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        removeCallbacks(this.y);
        super.dispatchTouchEvent(motionEvent);
        return this.x.onTouchEvent(motionEvent);
    }

    @Override // com.spotify.music.nowplaying.videoads.overlay.b
    public void e() {
        setPlayPauseVisibility(4);
    }

    @Override // com.spotify.music.nowplaying.videoads.overlay.b
    public void f(boolean z2) {
        setPlayPauseVisibility(0);
        a(false);
        if (z2) {
            postDelayed(this.y, 2000);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.overlay.k
    public void g(k.a aVar) {
        this.w.add(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.z = (ViewGroup) findViewById(C0707R.id.play_pause_button_container);
    }

    public VideoAdOverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new LinkedHashSet();
        this.x = new GestureDetector(getContext(), new b(null));
        this.y = new a(this);
    }
}
