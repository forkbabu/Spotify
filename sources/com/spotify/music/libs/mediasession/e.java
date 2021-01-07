package com.spotify.music.libs.mediasession;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.spotify.music.libs.mediasession.j0;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ j0.a a;

    public /* synthetic */ e(j0.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.a aVar = this.a;
        aVar.getClass();
        Logger.b("onSkipToNext", new Object[0]);
        ((SpotifyRemoteControlClient.c) j0.this.d).i();
        j0.this.g.a(j0.this.e.s(j0.k(j0.this)).subscribe());
    }
}
