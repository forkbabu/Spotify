package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.notification.c;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class v implements fjf<m> {
    private final u a;
    private final wlf<c> b;
    private final wlf<y> c;

    public v(u uVar, wlf<c> wlf, wlf<y> wlf2) {
        this.a = uVar;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        u uVar = this.a;
        c cVar = this.b.get();
        y yVar = this.c.get();
        uVar.getClass();
        h.e(cVar, "endpoint");
        h.e(yVar, "scheduler");
        return new n(cVar, yVar);
    }
}
