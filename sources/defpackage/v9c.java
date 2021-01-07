package defpackage;

import com.spotify.music.features.ads.rules.AdRules;

/* renamed from: v9c  reason: default package */
public class v9c {
    private final y9c a;
    private final AdRules b;

    v9c(y9c y9c, AdRules adRules) {
        this.a = y9c;
        this.b = adRules;
    }

    public void a() {
        if (this.a.b()) {
            this.b.c(AdRules.StateType.PLAYING_SOCIAL_ON_DEMAND_TRACK, true);
        }
    }

    public void b() {
        if (this.a.b()) {
            this.b.c(AdRules.StateType.PLAYING_SOCIAL_ON_DEMAND_TRACK, false);
        }
    }

    public boolean c(String str) {
        if (!this.a.a() || !(!str.isEmpty())) {
            return false;
        }
        return true;
    }
}
