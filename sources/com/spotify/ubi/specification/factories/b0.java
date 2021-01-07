package com.spotify.ubi.specification.factories;

import defpackage.rqe;

public final class b0 {
    private final rqe a = je.X("music", "mobile-browse", "1.0.7");

    public final class b {
        private final rqe a;

        b(b0 b0Var, a aVar) {
            rqe.b p = b0Var.a.p();
            je.l("retry_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public rqe a() {
            return this.a;
        }
    }

    public b b() {
        return new b(this, null);
    }
}
