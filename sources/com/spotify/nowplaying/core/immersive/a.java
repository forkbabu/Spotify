package com.spotify.nowplaying.core.immersive;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c cVar) {
        this.a = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        c.a(this.a, (ImmersiveMode) obj);
    }
}
