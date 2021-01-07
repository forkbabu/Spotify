package com.spotify.music.libs.podcast.download;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.e0;
import io.reactivex.s;

public class v {
    private final e0 a;

    public v(e0 e0Var) {
        this.a = e0Var;
    }

    public s<ConnectionType> a() {
        return this.a.b().G0(this.a.c());
    }
}
