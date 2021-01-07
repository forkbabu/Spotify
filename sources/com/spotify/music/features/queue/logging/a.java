package com.spotify.music.features.queue.logging;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectStates$State;
import com.spotify.libs.connect.g;
import com.spotify.music.libs.viewuri.ViewUris;

public class a implements g {
    private final mba a;

    public a(mba mba) {
        this.a = mba;
    }

    @Override // com.spotify.libs.connect.g
    public void a(ConnectStates$State connectStates$State) {
        this.a.d(connectStates$State, PageIdentifiers.NOWPLAYING_QUEUE.path(), ViewUris.i0.toString());
    }
}
