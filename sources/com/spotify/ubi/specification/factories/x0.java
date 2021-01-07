package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class x0 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        b(a aVar) {
            rqe.b p = x0.this.a.p();
            je.l("transcript", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            mqe.b bVar = e;
            bVar.f(x0.this.b);
            return (mqe) bVar.c();
        }
    }

    public x0(String str, String str2) {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-episode-transcript");
        e.m("1.0.0");
        e.e("7.0.8");
        e.g(str);
        e.j(str2);
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }
}
