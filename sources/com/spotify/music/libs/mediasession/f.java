package com.spotify.music.libs.mediasession;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.spotify.music.libs.mediasession.j0;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ j0.a a;
    public final /* synthetic */ long b;

    public /* synthetic */ f(j0.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.a aVar = this.a;
        long j = this.b;
        aVar.getClass();
        Logger.b("onSeekTo %d", Long.valueOf(j));
        ((SpotifyRemoteControlClient.c) j0.this.d).h(j);
        j0.this.g.a(j0.this.e.g(j0.k(j0.this), j).subscribe());
    }
}
