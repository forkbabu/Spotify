package com.spotify.music.features.go.socket;

import com.spotify.music.features.go.socket.SocketIo;
import io.reactivex.functions.l;
import java.io.InputStream;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ SocketIo.b a;

    public /* synthetic */ c(SocketIo.b bVar) {
        this.a = bVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((InputStream) obj);
    }
}
