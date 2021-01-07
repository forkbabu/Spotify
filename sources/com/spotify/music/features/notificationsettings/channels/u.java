package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.pageloader.t0;
import java.util.List;
import kotlin.jvm.internal.h;

public final class u implements fjf<t0<List<Channel>>> {
    private final s a;
    private final wlf<k> b;
    private final wlf<zac> c;

    public u(s sVar, wlf<k> wlf, wlf<zac> wlf2) {
        this.a = sVar;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        s sVar = this.a;
        k kVar = this.b.get();
        zac zac = this.c.get();
        sVar.getClass();
        h.e(kVar, "loadableFactory");
        h.e(zac, "pageLoaderFactory");
        t0 a2 = zac.a(kVar.a());
        h.d(a2, "pageLoaderFactory.create…adableFactory.loadable())");
        return a2;
    }
}
