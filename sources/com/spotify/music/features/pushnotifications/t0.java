package com.spotify.music.features.pushnotifications;

import com.google.common.base.Optional;
import com.spotify.music.notification.NotificationCategoryEnum;
import io.reactivex.a;
import io.reactivex.z;
import java.util.List;

public interface t0 {
    a a(NotificationCategoryEnum notificationCategoryEnum, boolean z);

    Optional<NotificationCategoryEnum> b(String str);

    z<List<n0>> c();

    List<NotificationCategoryEnum> d();
}
