package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class d {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        b(a aVar) {
            rqe.b p = d.this.a.p();
            je.l("snackbar", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            mqe.b bVar = e;
            bVar.f(d.this.b);
            return (mqe) bVar.c();
        }
    }

    public d() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-account-linking-snackbar");
        e.m("1.0.1");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }
}
