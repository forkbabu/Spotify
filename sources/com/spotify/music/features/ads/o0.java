package com.spotify.music.features.ads;

import com.spotify.music.features.ads.rules.AdRules;

public final class o0 {
    private final wlf<AdRules> a;

    public o0(wlf<AdRules> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public n0 b() {
        AdRules adRules = this.a.get();
        a(adRules, 1);
        return new n0(adRules);
    }
}
