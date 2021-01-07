package com.spotify.nowplaying.ui.components.overlay;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ OverlayHidingFrameLayout a;

    public /* synthetic */ d(OverlayHidingFrameLayout overlayHidingFrameLayout) {
        this.a = overlayHidingFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.r(true);
    }
}
