package com.spotify.music.alarmlauncher;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.o;
import kotlin.jvm.internal.h;

final class f implements Runnable {
    final /* synthetic */ SpotifyServiceLauncherService a;

    f(SpotifyServiceLauncherService spotifyServiceLauncherService) {
        this.a = spotifyServiceLauncherService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpotifyServiceLauncherService spotifyServiceLauncherService = this.a;
        h2e h2e = spotifyServiceLauncherService.a;
        if (h2e != null) {
            Context applicationContext = spotifyServiceLauncherService.getApplicationContext();
            h.d(applicationContext, "applicationContext");
            o oVar = spotifyServiceLauncherService.b;
            if (oVar != null) {
                Intent c = oVar.c(spotifyServiceLauncherService.getApplicationContext(), "com.spotify.mobile.android.service.action.PREPARE");
                c.putExtra("com.spotify.music.EXTRA_PREPARE_REASON_KEY", "PREPARE_ALARM");
                h.d(c, "intentFactory.getSpotify…A_PREPARE_REASON_ALARM) }");
                h2e.b(applicationContext, c, "PREPARE_ALARM", new Object[0]);
                SpotifyServiceLauncherService.e(this.a);
                return;
            }
            h.k("intentFactory");
            throw null;
        }
        h.k("serviceStarter");
        throw null;
    }
}
