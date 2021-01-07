package com.spotify.music.marquee;

import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.ads.api.e;
import com.spotify.music.marquee.trigger.MarqueeTriggerModel;
import com.spotify.music.marquee.trigger.f0;
import com.spotify.music.marquee.trigger.h0;

public final class f {
    public static void a(MarqueeService marqueeService, ds3 ds3) {
        marqueeService.b = ds3;
    }

    public static void b(MarqueeService marqueeService, boolean z) {
        marqueeService.n = z;
    }

    public static void c(MarqueeService marqueeService, MobiusLoop.f<MarqueeTriggerModel, h0, f0> fVar) {
        marqueeService.f = fVar;
    }

    public static void d(MarqueeActivity marqueeActivity, j jVar) {
        marqueeActivity.G = jVar;
    }

    public static void e(MarqueeService marqueeService, e eVar) {
        marqueeService.c = eVar;
    }
}
