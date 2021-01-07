package com.spotify.player.sub;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ h a;

    public /* synthetic */ c(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b((Response) obj);
    }
}
