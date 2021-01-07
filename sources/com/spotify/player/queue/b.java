package com.spotify.player.queue;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return d.d(this.a, (Response) obj);
    }
}
