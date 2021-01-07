package com.spotify.music.features.go.socket;

import com.spotify.music.features.go.protocol.b;
import com.spotify.music.features.go.socket.SocketIo;

public final class d implements fjf<SocketIo.b> {
    private final wlf<b> a;

    public d(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SocketIo.b(this.a.get());
    }
}
