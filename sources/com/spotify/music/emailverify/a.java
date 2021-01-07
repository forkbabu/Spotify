package com.spotify.music.emailverify;

import com.google.protobuf.u;
import com.spotify.messages.EmailVerificationEvent;
import kotlin.jvm.internal.h;

public final class a {
    private final gl0<u> a;

    public a(gl0<u> gl0) {
        h.e(gl0, "eventPublisherAdapter");
        this.a = gl0;
    }

    public void a(String str) {
        h.e(str, "errorDescription");
        gl0<u> gl0 = this.a;
        EmailVerificationEvent.b l = EmailVerificationEvent.l();
        l.n(false);
        l.m(str);
        gl0.c(l.build());
    }

    public void b() {
        gl0<u> gl0 = this.a;
        EmailVerificationEvent.b l = EmailVerificationEvent.l();
        l.n(true);
        gl0.c(l.build());
    }
}
