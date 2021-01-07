package com.spotify.music.features.queue.service;

import io.reactivex.functions.a;

public final /* synthetic */ class h implements a {
    public final /* synthetic */ s a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ h(s sVar, boolean z) {
        this.a = sVar;
        this.b = z;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.g(this.b);
    }
}
