package com.spotify.music.features.payfail;

import com.google.protobuf.u;
import com.spotify.messages.PaymentFailureNotificationMessage;

public class a0 {
    private final gl0<u> a;

    public a0(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(String str, long j) {
        PaymentFailureNotificationMessage.b l = PaymentFailureNotificationMessage.l();
        l.n(str);
        l.m(j);
        this.a.c(l.build());
    }
}
