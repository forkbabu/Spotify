package com.spotify.mobile.android.hubframework.defaults.fallbacks;

import com.spotify.music.libs.viewuri.c;
import defpackage.j91;

/* access modifiers changed from: package-private */
public final class a implements j91.a {
    private final SpotifyHubsFallbackUsageReporter a;

    a(c.a aVar) {
        this.a = new SpotifyHubsFallbackUsageReporter(aVar);
    }

    @Override // defpackage.j91.a
    public void a(s81 s81, int i) {
        if (i != 0) {
            SpotifyHubsFallbackUsageReporter spotifyHubsFallbackUsageReporter = this.a;
            StringBuilder V0 = je.V0("Using fallback binder for category ");
            V0.append(s81.componentId().category());
            spotifyHubsFallbackUsageReporter.a(V0.toString(), s81);
        }
    }
}
