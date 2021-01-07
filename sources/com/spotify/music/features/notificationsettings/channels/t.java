package com.spotify.music.features.notificationsettings.channels;

import com.spotify.remoteconfig.NotificationSettingsProperties;
import kotlin.jvm.internal.h;

public final class t implements fjf<k> {
    private final s a;
    private final wlf<NotificationSettingsProperties> b;

    public t(s sVar, wlf<NotificationSettingsProperties> wlf) {
        this.a = sVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s sVar = this.a;
        NotificationSettingsProperties notificationSettingsProperties = this.b.get();
        sVar.getClass();
        h.e(notificationSettingsProperties, "properties");
        return new l(notificationSettingsProperties);
    }
}
