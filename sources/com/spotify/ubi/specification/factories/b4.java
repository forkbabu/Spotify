package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class b4 {
    private final rqe a;

    public b4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-storytelling-container");
        e.m("2.0.0");
        e.g(str);
        this.a = e.d();
    }

    public nqe a() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("decrease_volume", 1, "hit", f);
    }

    public nqe b() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("increase_volume", 1, "hit", f);
    }

    public nqe c() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("retry", 1, "hit", f);
    }

    public nqe d(String str) {
        nqe.b f = nqe.f();
        return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
    }
}
