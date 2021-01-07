package com.spotify.music.libs.carmodeengine.util;

import com.spotify.music.libs.carmodeengine.util.b0;
import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ b0.a a;

    public /* synthetic */ m(b0.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(((Boolean) obj).booleanValue());
    }
}
