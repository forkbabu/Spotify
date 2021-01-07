package com.spotify.mobile.android.service;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.plugininterfaces.d;
import java.util.Locale;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ SpotifyService a;

    public /* synthetic */ e(SpotifyService spotifyService) {
        this.a = spotifyService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpotifyService spotifyService = this.a;
        for (d dVar : spotifyService.v.a()) {
            ColdStartTracker coldStartTracker = spotifyService.z;
            StringBuilder V0 = je.V0("dsss_");
            V0.append(dVar.name().toLowerCase(Locale.US));
            String sb = V0.toString();
            coldStartTracker.B(sb);
            dVar.d();
            coldStartTracker.e(sb);
        }
    }
}
