package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdRules {
    private static final String c = "AdRules";
    private final Set<ifd> a = new HashSet();
    private final Map<Class<? extends o>, o> b;

    public enum StateType {
        CAR_CONNECTED,
        DISABLED_NAVIGATION_ITEM,
        MIDROLL_VIDEO_ADS,
        ON_SPONSORED_PAGE,
        PLAYING_FROM_SPONSORED_CONTEXT,
        WATCH_NOW_SLOT,
        WIFI_DISCONNECTED,
        PLAYING_SOCIAL_ON_DEMAND_TRACK
    }

    public AdRules(p pVar) {
        this.b = pVar.a();
    }

    private void d(j jVar) {
        Logger.b("%s onStateUpdate state: %s", c, jVar);
        for (o oVar : this.b.values()) {
            oVar.c(jVar);
        }
    }

    public boolean a(Class<? extends o> cls) {
        return this.b.get(cls).b();
    }

    public void b(ifd ifd) {
        if (ifd != null) {
            d(new j(StateType.DISABLED_NAVIGATION_ITEM, this.a.contains(ifd)));
        }
    }

    public void c(StateType stateType, boolean z) {
        d(new j(stateType, z));
    }

    public void e() {
        for (Map.Entry<Class<? extends o>, o> entry : this.b.entrySet()) {
            entry.getValue().a();
        }
    }
}
