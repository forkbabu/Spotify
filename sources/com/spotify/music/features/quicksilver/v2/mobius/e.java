package com.spotify.music.features.quicksilver.v2.mobius;

import com.spotify.mobius.e0;
import com.spotify.music.features.quicksilver.v2.mobius.AutoValue_InAppMessagingModel;
import com.spotify.music.features.quicksilver.v2.mobius.h;

public final /* synthetic */ class e implements ti0 {
    public final /* synthetic */ InAppMessagingModel a;

    public /* synthetic */ e(InAppMessagingModel inAppMessagingModel) {
        this.a = inAppMessagingModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        InAppMessagingModel inAppMessagingModel = this.a;
        boolean g = ((h.a) obj).g();
        AutoValue_InAppMessagingModel.b bVar = (AutoValue_InAppMessagingModel.b) inAppMessagingModel.g();
        bVar.a(g);
        return e0.f(bVar.d());
    }
}
