package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class z3 {
    private final rqe a = je.X("music", "mobile-social-on-demand", "0.2.1");

    public final class b {
        private final rqe a;

        b(z3 z3Var, String str, a aVar) {
            rqe.b p = z3Var.a.p();
            je.s("playback_error_snackbar", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
