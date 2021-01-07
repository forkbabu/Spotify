package com.spotify.music.features.ads;

import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ z a;
    public final /* synthetic */ z b;

    public /* synthetic */ d(z zVar, z zVar2) {
        this.a = zVar;
        this.b = zVar2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.a : this.b;
    }
}
