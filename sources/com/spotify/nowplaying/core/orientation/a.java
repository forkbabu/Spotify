package com.spotify.nowplaying.core.orientation;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ b a;

    public /* synthetic */ a(b bVar) {
        this.a = bVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        b.a(this.a, (OrientationMode) obj);
    }
}
