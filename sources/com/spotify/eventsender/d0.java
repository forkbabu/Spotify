package com.spotify.eventsender;

import com.google.common.collect.FluentIterable;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.eventsender.w;

/* access modifiers changed from: package-private */
public class d0 {
    private final kl0 a;

    public d0(kl0 kl0) {
        this.a = kl0;
    }

    /* access modifiers changed from: package-private */
    public c0 a(uk0 uk0) {
        FragmentsContainer l = FragmentsContainer.l();
        try {
            l = FragmentsContainer.o(uk0.f);
        } catch (InvalidProtocolBufferException e) {
            this.a.a(e, "Error in parsing contexts.");
        }
        w.b bVar = new w.b();
        bVar.d(uk0.a);
        bVar.b(uk0.c);
        bVar.e(ByteString.h(uk0.d));
        bVar.f(uk0.e);
        bVar.c(FluentIterable.from(l.m()).transform(f.a));
        return bVar.a();
    }
}
