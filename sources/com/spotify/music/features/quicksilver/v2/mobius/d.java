package com.spotify.music.features.quicksilver.v2.mobius;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.mobius.e0;
import com.spotify.music.features.quicksilver.v2.mobius.AutoValue_InAppMessagingModel;
import com.spotify.music.features.quicksilver.v2.mobius.g;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import java.util.EnumMap;

public final /* synthetic */ class d implements ti0 {
    public final /* synthetic */ InAppMessagingModel a;

    public /* synthetic */ d(InAppMessagingModel inAppMessagingModel) {
        this.a = inAppMessagingModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        EnumMap enumMap;
        InAppMessagingModel inAppMessagingModel = this.a;
        h.e eVar = (h.e) obj;
        if (!inAppMessagingModel.f()) {
            return e0.h();
        }
        TriggerType h = eVar.h();
        String g = eVar.g();
        if (inAppMessagingModel.b().isEmpty()) {
            enumMap = new EnumMap(TriggerType.class);
        } else {
            enumMap = new EnumMap(inAppMessagingModel.b());
        }
        enumMap.put((EnumMap) h, (TriggerType) g);
        AutoValue_InAppMessagingModel.b bVar = (AutoValue_InAppMessagingModel.b) inAppMessagingModel.g();
        bVar.b(ImmutableMap.copyOf(enumMap));
        return e0.g(bVar.d(), z42.l(new g.a(eVar.g(), eVar.h())));
    }
}
