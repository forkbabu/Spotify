package com.spotify.music.features.album.di;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

public final class j0 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final j0 a = new j0();
    }

    public static j0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.FREE_TIER_ALBUM_LOCAL_HUBS;
        return Boolean.FALSE;
    }
}
