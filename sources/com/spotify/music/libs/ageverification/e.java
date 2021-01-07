package com.spotify.music.libs.ageverification;

import com.spotify.metadata.proto.Metadata$Album;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ n a;

    public /* synthetic */ e(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a((Metadata$Album) obj);
    }
}
