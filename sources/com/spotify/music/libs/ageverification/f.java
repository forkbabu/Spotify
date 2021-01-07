package com.spotify.music.libs.ageverification;

import com.spotify.metadata.proto.Metadata$Track;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ n a;

    public /* synthetic */ f(n nVar) {
        this.a = nVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((Metadata$Track) obj);
    }
}
