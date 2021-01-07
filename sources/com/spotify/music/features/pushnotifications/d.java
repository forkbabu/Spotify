package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.NotificationCategoryEnum;
import com.spotify.music.notification.NotificationV2;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        NotificationV2 notificationV2 = (NotificationV2) obj;
        return new h0(NotificationCategoryEnum.fromRemoteId(notificationV2.getKey()), notificationV2.getName(), notificationV2.getDescription(), notificationV2.isPushEnabled());
    }
}
