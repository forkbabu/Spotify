package com.spotify.music.marquee.trigger;

import com.spotify.mobius.e0;
import com.spotify.music.marquee.trigger.AutoValue_MarqueeTriggerModel;
import com.spotify.music.marquee.trigger.h0;

public final /* synthetic */ class r implements ti0 {
    public final /* synthetic */ MarqueeTriggerModel a;

    public /* synthetic */ r(MarqueeTriggerModel marqueeTriggerModel) {
        this.a = marqueeTriggerModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        MarqueeTriggerModel marqueeTriggerModel = this.a;
        h0.f fVar = (h0.f) obj;
        fVar.getClass();
        boolean g = fVar.g();
        AutoValue_MarqueeTriggerModel.b bVar = (AutoValue_MarqueeTriggerModel.b) marqueeTriggerModel.c();
        bVar.c(g);
        return e0.f(bVar.a());
    }
}
