package com.spotify.music.features.premiumdestination;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

public final class b0 implements fjf<String> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final b0 a = new b0();
    }

    public static b0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_OVERRIDE_PAGE_SOURCE;
        return null;
    }
}
