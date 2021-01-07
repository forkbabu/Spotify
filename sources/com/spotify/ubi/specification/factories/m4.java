package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class m4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(m4 m4Var, Integer num, String str, a aVar) {
            rqe.b p = m4Var.a.p();
            je.o("your_episodes_card_container", num, str, p);
            p.f(Boolean.TRUE);
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

    public m4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-your-episodes-card");
        e.m("0.0.1");
        e.j(str);
        this.a = e.d();
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }
}
