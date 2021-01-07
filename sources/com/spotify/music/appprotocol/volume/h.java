package com.spotify.music.appprotocol.volume;

import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public final /* synthetic */ ik1 a;

    public /* synthetic */ h(ik1 ik1) {
        this.a = ik1;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a().j0(new j((Float) obj));
    }
}
