package com.spotify.music.features.notificationsettings.channels;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.t1;

public final class g implements fjf<t1> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final g a = new g();
    }

    public static g a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t1(PageIdentifiers.SETTINGS_NOTIFICATIONS_CHANNELS.name(), ViewUris.N1.toString());
    }
}
