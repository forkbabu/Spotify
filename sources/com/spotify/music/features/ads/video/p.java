package com.spotify.music.features.ads.video;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Map;

public class p {
    private final cqe a;
    private final wlf<y> b;
    private final s c;

    p(s sVar, cqe cqe, wlf<y> wlf) {
        this.c = sVar;
        this.a = cqe;
        this.b = wlf;
    }

    public o a(String str, Map<String, String> map, s<AdSlotEvent> sVar, dv3 dv3) {
        return new o(str, map, sVar, dv3, this.c, this.a, this.b);
    }
}
