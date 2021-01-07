package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.l;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ NotificationCategoryEnum b;

    public /* synthetic */ n(o0 o0Var, NotificationCategoryEnum notificationCategoryEnum) {
        this.a = o0Var;
        this.b = notificationCategoryEnum;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (String) obj);
    }
}
