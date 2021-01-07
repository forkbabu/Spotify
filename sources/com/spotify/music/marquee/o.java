package com.spotify.music.marquee;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.d;

public class o implements d {
    private final n a;
    private boolean b;

    public o(n nVar) {
        this.a = nVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        Logger.b("[Marquee] - onSessionStarted", new Object[0]);
        this.a.b();
        this.b = true;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        Logger.b("[Marquee] - onSessionEnded", new Object[0]);
        if (this.b) {
            this.a.c();
            this.b = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "Marquee";
    }
}
