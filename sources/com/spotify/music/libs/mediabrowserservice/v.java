package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.connection.OfflineReason;
import com.spotify.music.connection.g;

public final /* synthetic */ class v implements ti0 {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        return Boolean.valueOf(((g.b) obj).d() == OfflineReason.FORCED_OFFLINE);
    }
}
