package com.spotify.inappmessaging.display;

import com.google.protobuf.u;
import com.spotify.inappmessaging.InAppMessagingLogger;

public final class h implements fjf<InAppMessagingLogger> {
    private final wlf<gl0<u>> a;

    public h(wlf<gl0<u>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new InAppMessagingLogger(this.a.get());
    }
}
