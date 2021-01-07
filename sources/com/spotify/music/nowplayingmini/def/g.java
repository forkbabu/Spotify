package com.spotify.music.nowplayingmini.def;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;

public final class g implements fjf<String> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final g a = new g();
    }

    public static g a() {
        return a.a;
    }

    public static String b() {
        StringBuilder V0 = je.V0("Mini");
        V0.append(NowPlayingMode.DEFAULT.d());
        V0.append('_');
        String sb = V0.toString();
        yif.g(sb, "Cannot return null from a non-@Nullable @Provides method");
        return sb;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
