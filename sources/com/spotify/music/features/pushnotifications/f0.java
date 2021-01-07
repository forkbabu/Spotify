package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.functions.l;

public final /* synthetic */ class f0 implements l {
    public final /* synthetic */ o0 a;

    public /* synthetic */ f0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((NotificationCategoryEnum) obj);
    }
}
