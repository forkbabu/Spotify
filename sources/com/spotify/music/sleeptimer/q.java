package com.spotify.music.sleeptimer;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.sleeptimer.SleepTimerStatusHandler;
import com.spotify.player.controls.c;

public class q implements d, SleepTimerStatusHandler {
    private final n a;
    private final com.spotify.player.controls.d b;
    private final com.spotify.rxjava2.q c = new com.spotify.rxjava2.q();

    q(n nVar, com.spotify.player.controls.d dVar) {
        this.a = nVar;
        this.b = dVar;
    }

    public void a(SleepTimerStatusHandler.State state) {
        if (state == SleepTimerStatusHandler.State.a) {
            this.c.a(this.b.a(c.c()).subscribe());
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.d(this);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
        this.c.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SleepTimerController";
    }
}
