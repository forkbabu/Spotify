package com.spotify.music.libs.carmodeengine.util;

import com.spotify.music.libs.carmodeengine.util.b0;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ b0.a a;

    public /* synthetic */ b(b0.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(((Boolean) obj).booleanValue());
    }
}
