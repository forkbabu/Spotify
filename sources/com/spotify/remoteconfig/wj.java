package com.spotify.remoteconfig;

public final class wj implements fjf<NotificationSettingsProperties> {
    private final wlf<l0e> a;

    public wj(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        NotificationSettingsProperties notificationSettingsProperties = (NotificationSettingsProperties) this.a.get().a(w.a);
        yif.g(notificationSettingsProperties, "Cannot return null from a non-@Nullable @Provides method");
        return notificationSettingsProperties;
    }
}
