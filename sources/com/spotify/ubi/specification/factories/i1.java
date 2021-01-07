package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class i1 {
    private final rqe a = je.X("music", "mobile-home-mix-face-pile-detail", "0.1.1");

    public final class b {
        private final rqe a;

        b(i1 i1Var, a aVar) {
            rqe.b p = i1Var.a.p();
            je.l("detail_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }
}
