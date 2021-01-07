package com.spotify.mobile.android.service;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.plugininterfaces.b;
import java.util.Locale;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ SpotifyService a;

    public /* synthetic */ d(SpotifyService spotifyService) {
        this.a = spotifyService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpotifyService spotifyService = this.a;
        for (b bVar : spotifyService.u.a()) {
            ColdStartTracker coldStartTracker = spotifyService.z;
            bVar.getClass();
            String str = "dssc_" + bVar.name().toLowerCase(Locale.US);
            coldStartTracker.B(str);
            bVar.a();
            coldStartTracker.e(str);
        }
    }
}
