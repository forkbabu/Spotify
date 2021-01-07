package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class p2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(p2 p2Var, a aVar) {
            rqe.b p = p2Var.a.p();
            je.l("browse_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public p2(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-empty");
        e.m("2.0.0");
        e.j(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }
}
