package com.spotify.inappmessaging.display;

import com.spotify.inappmessaging.display.o;
import retrofit2.w;

public final class i implements fjf<o.a> {
    private final wlf<w> a;

    public i(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o.a aVar = (o.a) this.a.get().d(o.a.class);
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
