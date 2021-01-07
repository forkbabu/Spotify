package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.s1;

public final class i implements fjf<s1> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final i a = new i();
    }

    public static i a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s1(PageIdentifiers.SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS.name(), ViewUris.O1.toString());
    }
}
