package com.spotify.inappmessaging.display;

import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.inappmessaging.display.o;
import java.util.Map;

public final class j implements fjf<o> {
    private final wlf<fp0> a;
    private final wlf<gp0> b;
    private final wlf<Map<ActionType, com.spotify.inappmessaging.j>> c;
    private final wlf<InAppMessagingLogger> d;
    private final wlf<o.a> e;
    private final wlf<cqe> f;

    public j(wlf<fp0> wlf, wlf<gp0> wlf2, wlf<Map<ActionType, com.spotify.inappmessaging.j>> wlf3, wlf<InAppMessagingLogger> wlf4, wlf<o.a> wlf5, wlf<cqe> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        fp0 fp0 = this.a.get();
        gp0 gp0 = this.b.get();
        Map<ActionType, com.spotify.inappmessaging.j> map = this.c.get();
        InAppMessagingLogger inAppMessagingLogger = this.d.get();
        return new o(fp0, gp0, map, this.e.get(), inAppMessagingLogger, this.f.get());
    }
}
