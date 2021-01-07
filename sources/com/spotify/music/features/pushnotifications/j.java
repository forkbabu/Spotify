package com.spotify.music.features.pushnotifications;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.g;

public final /* synthetic */ class j implements g {
    public final /* synthetic */ NotificationCategoryEnum a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j(NotificationCategoryEnum notificationCategoryEnum, boolean z, boolean z2) {
        this.a = notificationCategoryEnum;
        this.b = z;
        this.c = z2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Could not update notification channel cache for item: %s, %b, %b, \nreason:%s", this.a.getId(), Boolean.valueOf(this.b), Boolean.valueOf(this.c), ((Throwable) obj).getMessage());
    }
}
