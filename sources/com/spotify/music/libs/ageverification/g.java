package com.spotify.music.libs.ageverification;

import com.spotify.metadata.proto.Metadata$Artist;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ n a;

    public /* synthetic */ g(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((Metadata$Artist) obj);
    }
}
