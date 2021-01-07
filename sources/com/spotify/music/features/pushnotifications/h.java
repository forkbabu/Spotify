package com.spotify.music.features.pushnotifications;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ NotificationCategoryEnum a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ h(NotificationCategoryEnum notificationCategoryEnum, boolean z) {
        this.a = notificationCategoryEnum;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.d("Could not update preference: %s %b \nCause: %s", this.a.getId(), Boolean.valueOf(this.b), ((Throwable) obj).getMessage());
    }
}
