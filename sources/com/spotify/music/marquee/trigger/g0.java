package com.spotify.music.marquee.trigger;

import com.spotify.mobius.e0;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.marquee.trigger.AutoValue_MarqueeTriggerModel;
import com.spotify.music.marquee.trigger.f0;
import com.spotify.music.marquee.trigger.h0;

public final class g0 {
    private static boolean a(String str) {
        return str.equalsIgnoreCase(ViewUris.d.toString());
    }

    static e0 b(MarqueeTriggerModel marqueeTriggerModel, h0.g gVar) {
        gVar.getClass();
        String g = gVar.g();
        AutoValue_MarqueeTriggerModel.b bVar = (AutoValue_MarqueeTriggerModel.b) marqueeTriggerModel.c();
        bVar.b(g);
        MarqueeTriggerModel a = bVar.a();
        if (a(a.a())) {
            return e0.g(a, z42.l(new f0.f(a.a())));
        }
        return e0.g(a, z42.l(new f0.a()));
    }

    static e0 c(MarqueeTriggerModel marqueeTriggerModel, h0.c cVar) {
        cVar.getClass();
        AdSlotEvent g = cVar.g();
        if (a(marqueeTriggerModel.a())) {
            return e0.a(z42.l(new f0.b(g)));
        }
        return e0.h();
    }

    static e0 d(MarqueeTriggerModel marqueeTriggerModel, h0.e eVar) {
        eVar.getClass();
        hjb g = eVar.g();
        String a = marqueeTriggerModel.a();
        if (!marqueeTriggerModel.b() && a(a)) {
            return e0.a(z42.l(new f0.e(g)));
        }
        if (marqueeTriggerModel.b()) {
            return e0.a(z42.l(new f0.d(g.a())));
        }
        return e0.h();
    }
}
