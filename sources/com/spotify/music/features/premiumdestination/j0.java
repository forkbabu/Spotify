package com.spotify.music.features.premiumdestination;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

public final class j0 implements fjf<String> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final j0 a = new j0();
    }

    public static j0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.PREMIUM_DESTINATION_SHOW_UNSAFE_UNPUBLISHED_CONTENT;
        return "false";
    }
}
