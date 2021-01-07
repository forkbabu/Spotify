package com.spotify.login;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;
import java.util.Set;

public final class t0 implements fjf<s0> {
    private final wlf<v0> a;
    private final wlf<SessionClient> b;
    private final wlf<Set<o0>> c;
    private final wlf<BootstrapHandler> d;
    private final wlf<ke0> e;
    private final wlf<Boolean> f;

    public t0(wlf<v0> wlf, wlf<SessionClient> wlf2, wlf<Set<o0>> wlf3, wlf<BootstrapHandler> wlf4, wlf<ke0> wlf5, wlf<Boolean> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static t0 a(wlf<v0> wlf, wlf<SessionClient> wlf2, wlf<Set<o0>> wlf3, wlf<BootstrapHandler> wlf4, wlf<ke0> wlf5, wlf<Boolean> wlf6) {
        return new t0(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new s0(this.a.get(), this.b.get(), ejf.a(this.c), this.d.get(), this.e.get(), this.f.get().booleanValue());
    }
}
