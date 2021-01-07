package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ NotificationCategoryEnum b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ k(o0 o0Var, NotificationCategoryEnum notificationCategoryEnum, boolean z, boolean z2) {
        this.a = o0Var;
        this.b = notificationCategoryEnum;
        this.c = z;
        this.f = z2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, this.c, this.f, (String) obj);
    }
}
