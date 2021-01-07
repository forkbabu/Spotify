package defpackage;

import com.spotify.music.features.ads.rules.AdRules;

/* renamed from: w9c  reason: default package */
public final class w9c implements fjf<v9c> {
    private final wlf<y9c> a;
    private final wlf<AdRules> b;

    public w9c(wlf<y9c> wlf, wlf<AdRules> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v9c(this.a.get(), this.b.get());
    }
}
