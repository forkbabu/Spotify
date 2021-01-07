package com.spotify.music.features.go.socket;

import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.y;

public final class f implements fjf<e> {
    private final wlf<SocketIo.b> a;
    private final wlf<y> b;
    private final wlf<td5> c;

    public f(wlf<SocketIo.b> wlf, wlf<y> wlf2, wlf<td5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e(this.a.get(), this.b.get(), this.c.get());
    }
}
