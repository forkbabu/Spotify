package com.google.android.gms.cast.framework.media;

final /* synthetic */ class g0 implements Runnable {
    private final MediaNotificationService a;
    private final int b;

    g0(MediaNotificationService mediaNotificationService, int i) {
        this.a = mediaNotificationService;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.stopSelf(this.b);
    }
}
