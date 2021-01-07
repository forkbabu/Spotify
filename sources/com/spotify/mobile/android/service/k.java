package com.spotify.mobile.android.service;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import java.util.concurrent.TimeUnit;

public class k implements sn1 {
    public static final long f = TimeUnit.MINUTES.toMillis(10);
    private static final long g = TimeUnit.SECONDS.toMillis(10);
    private final Runnable a = new a(this);
    private final Handler b;
    private final rn1 c;
    private long d = f;
    private boolean e;

    public k(Handler handler, rn1 rn1) {
        this.b = handler;
        this.c = rn1;
    }

    public static void c(k kVar) {
        kVar.getClass();
        Logger.g("The application has been idle too long, stopping service", new Object[0]);
        kVar.b.removeCallbacksAndMessages(null);
        kVar.c.shutdown();
    }

    public void a() {
        if (this.e) {
            this.b.removeCallbacks(this.a);
            this.e = false;
        }
    }

    public void b() {
        this.b.removeCallbacksAndMessages(null);
    }

    public void d() {
        if (!this.e) {
            Handler handler = this.b;
            Runnable runnable = this.a;
            DebugFlag debugFlag = DebugFlag.DEBUG_SHUTDOWN;
            handler.postDelayed(runnable, this.d);
            this.e = true;
        }
    }
}
