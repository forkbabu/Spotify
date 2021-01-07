package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class c3 {
    private final rqe a = je.X("music", "mobile-premium-destination", "1.0.0");

    public final class b {
        private final rqe a;

        b(c3 c3Var, Integer num, a aVar) {
            rqe.b p = c3Var.a.p();
            je.m("scrolling_view", num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(Integer num) {
        return new b(this, num, null);
    }
}
