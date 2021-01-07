package com.spotify.music.libs.mediasession;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.spotify.music.libs.mediasession.j0;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ j0.a a;

    public /* synthetic */ d(j0.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.a aVar = this.a;
        aVar.getClass();
        Logger.b("onPlay", new Object[0]);
        ((SpotifyRemoteControlClient.c) j0.this.d).g();
        j0.this.g.a(j0.this.e.h(j0.k(j0.this)).subscribe());
    }
}
