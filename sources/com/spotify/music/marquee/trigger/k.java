package com.spotify.music.marquee.trigger;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ zr3 a;

    public /* synthetic */ k(zr3 zr3) {
        this.a = zr3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        return this.a.b().Q(e.a);
    }
}
