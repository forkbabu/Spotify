package com.spotify.music.features.ads.audioplus.topbanner;

import com.spotify.ads.uicomponents.secondaryintent.e;

public final class d {
    private final wlf<vp3> a;
    private final wlf<bq3> b;
    private final wlf<ws3> c;
    private final wlf<e> d;

    public d(wlf<vp3> wlf, wlf<bq3> wlf2, wlf<ws3> wlf3, wlf<e> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public c b(com.spotify.music.features.ads.audioplus.d dVar) {
        a(dVar, 1);
        vp3 vp3 = this.a.get();
        a(vp3, 2);
        vp3 vp32 = vp3;
        bq3 bq3 = this.b.get();
        a(bq3, 3);
        bq3 bq32 = bq3;
        ws3 ws3 = this.c.get();
        a(ws3, 4);
        ws3 ws32 = ws3;
        e eVar = this.d.get();
        a(eVar, 5);
        return new c(dVar, vp32, bq32, ws32, eVar);
    }
}
