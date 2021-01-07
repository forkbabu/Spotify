package com.spotify.player.di;

import com.spotify.cosmos.router.RxRouterProvider;
import com.spotify.remoteconfig.rj;

public class h {
    private final pxd a;
    private final RxRouterProvider b;
    private final cqe c;
    private final rj d;

    public h(pxd pxd, RxRouterProvider rxRouterProvider, cqe cqe, rj rjVar) {
        this.a = pxd;
        this.b = rxRouterProvider;
        this.c = cqe;
        this.d = rjVar;
    }

    public cqe a() {
        return this.c;
    }

    public pxd b() {
        return this.a;
    }

    public rj c() {
        return this.d;
    }

    public RxRouterProvider d() {
        return this.b;
    }
}
