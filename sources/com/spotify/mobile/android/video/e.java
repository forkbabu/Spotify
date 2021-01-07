package com.spotify.mobile.android.video;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ VideoSurfaceView a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ e(VideoSurfaceView videoSurfaceView, boolean z) {
        this.a = videoSurfaceView;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setKeepScreenOn(this.b);
    }
}
