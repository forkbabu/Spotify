package com.spotify.music.appprotocol.volume;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ k a;
    public final /* synthetic */ float b;

    public /* synthetic */ a(k kVar, float f) {
        this.a = kVar;
        this.b = f;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b);
    }
}
