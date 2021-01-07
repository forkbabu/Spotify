package com.spotify.music.features.premiumdestination;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

public final class i0 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final i0 a = new i0();
    }

    public static i0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_SAMSUNG_ELIGIBILITY_OVERRIDE;
        return Boolean.FALSE;
    }
}
