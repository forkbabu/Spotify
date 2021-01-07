package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

final class k0 extends TimerTask {
    private final /* synthetic */ d a;

    k0(d dVar) {
        this.a = dVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d.c(this.a);
    }
}
