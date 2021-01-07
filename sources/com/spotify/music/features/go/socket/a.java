package com.spotify.music.features.go.socket;

import io.reactivex.functions.f;

public final /* synthetic */ class a implements f {
    public final /* synthetic */ SocketIo a;

    public /* synthetic */ a(SocketIo socketIo) {
        this.a = socketIo;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        SocketIo.a(this.a);
    }
}
