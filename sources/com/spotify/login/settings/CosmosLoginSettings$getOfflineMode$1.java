package com.spotify.login.settings;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.f;

final /* synthetic */ class CosmosLoginSettings$getOfflineMode$1 extends MutablePropertyReference1Impl {
    public static final f a = new CosmosLoginSettings$getOfflineMode$1();

    CosmosLoginSettings$getOfflineMode$1() {
        super(SettingsResponse.class, "offlineMode", "getOfflineMode()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.g
    public Object get(Object obj) {
        return Boolean.valueOf(((SettingsResponse) obj).getOfflineMode());
    }
}
