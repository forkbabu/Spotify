package com.spotify.player.sub;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ h a;

    public /* synthetic */ d(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((Response) obj);
    }
}
