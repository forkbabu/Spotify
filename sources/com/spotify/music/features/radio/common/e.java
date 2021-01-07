package com.spotify.music.features.radio.common;

import android.os.Handler;
import com.spotify.mobile.android.util.connectivity.c0;

@Deprecated
public final class e {
    private final Handler a = new Handler();
    private final c0 b;
    private Runnable c;

    public e(c0 c0Var) {
        z42.a("Not called on main looper");
        this.b = c0Var;
    }

    public void a() {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.c = null;
        }
    }

    public void b(Runnable runnable, long j) {
        a();
        this.c = runnable;
        this.a.postDelayed(runnable, j);
    }

    public boolean c(Runnable runnable, long j) {
        if (this.b.a()) {
            a();
            this.c = runnable;
            this.a.postDelayed(runnable, j);
            return true;
        }
        a();
        return false;
    }
}
