package com.spotify.music.appprotocol.volume;

import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ Float a;

    public /* synthetic */ j(Float f) {
        this.a = f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return VolumeState.create(this.a.floatValue(), ((Boolean) obj).booleanValue());
    }
}
