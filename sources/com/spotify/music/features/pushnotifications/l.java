package com.spotify.music.features.pushnotifications;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ NotificationCategoryEnum a;

    public /* synthetic */ l(NotificationCategoryEnum notificationCategoryEnum) {
        this.a = notificationCategoryEnum;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Could not get notification channel cache item: %s, \nreason:%s", this.a.getId(), ((Throwable) obj).getMessage());
    }
}
