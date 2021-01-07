package com.spotify.music.superbird.setup.domain;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.music.superbird.setup.domain.f;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class j<T, R> implements l<ConnectionType, f> {
    public static final j a = new j();

    j() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(ConnectionType connectionType) {
        ConnectionType connectionType2 = connectionType;
        h.e(connectionType2, "it");
        return new f.b0(connectionType2 == ConnectionType.CONNECTION_TYPE_WLAN);
    }
}
