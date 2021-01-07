package com.spotify.music.libs.podcast.download;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.functions.c;

public final /* synthetic */ class r implements c {
    public static final /* synthetic */ r a = new r();

    private /* synthetic */ r() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        ConnectionType connectionType = (ConnectionType) obj;
        return (!connectionType.g() || connectionType == ConnectionType.CONNECTION_TYPE_COMPANION_PROXY) ? Boolean.TRUE : (Boolean) obj2;
    }
}
