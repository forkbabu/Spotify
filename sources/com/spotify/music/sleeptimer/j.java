package com.spotify.music.sleeptimer;

import android.os.Handler;
import kotlin.jvm.internal.h;

public final class j implements i {
    private Handler a;

    @Override // com.spotify.music.sleeptimer.i
    public void a(Runnable runnable) {
        h.e(runnable, "runnable");
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // com.spotify.music.sleeptimer.i
    public void b(Runnable runnable, long j) {
        h.e(runnable, "runnable");
        Handler handler = new Handler();
        this.a = handler;
        h.c(handler);
        handler.postDelayed(runnable, j);
    }
}
