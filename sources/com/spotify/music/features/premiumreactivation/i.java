package com.spotify.music.features.premiumreactivation;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ p a;

    public /* synthetic */ i(p pVar) {
        this.a = pVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        p pVar = this.a;
        NotificationDay notificationDay = (NotificationDay) obj;
        Logger.b("[PremiumReactivationTrigger] trigger the modal for notificationDay(%s) with url(%s)", notificationDay.d(), pVar.b());
        return new q(notificationDay, pVar.b());
    }
}
