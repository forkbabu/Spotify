package com.spotify.music.features.ads;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.rules.AdRules;

public class n0 implements a2 {
    private final AdRules a;

    public n0(AdRules adRules) {
        this.a = adRules;
    }

    @Override // com.spotify.music.features.ads.a2
    public void a() {
        Logger.b("Enabled ad slot preroll", new Object[0]);
    }

    @Override // com.spotify.music.features.ads.a2
    public void b() {
        this.a.c(AdRules.StateType.WATCH_NOW_SLOT, true);
    }

    @Override // com.spotify.music.features.ads.a2
    public void c() {
        Logger.b("Enabled ad slot mobile screensaver", new Object[0]);
    }

    @Override // com.spotify.music.features.ads.a2
    public void d() {
        this.a.c(AdRules.StateType.WATCH_NOW_SLOT, true);
    }

    @Override // com.spotify.music.features.ads.a2
    public void e() {
        Logger.b("[Marquee] - Enabled ad slot marquee", new Object[0]);
    }
}
