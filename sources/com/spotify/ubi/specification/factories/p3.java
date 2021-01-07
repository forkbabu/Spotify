package com.spotify.ubi.specification.factories;

import defpackage.rqe;
import defpackage.sqe;

public final class p3 {
    private final rqe a = je.X("music", "mobile-search-drilldown", "1.0.1");

    public final class b {
        private final rqe a;

        b(p3 p3Var, Integer num, String str, String str2, a aVar) {
            rqe.b p = p3Var.a.p();
            sqe.b c = sqe.c();
            c.c("content");
            c.d(num);
            c.f(str);
            c.e(str2);
            p.n(c.a());
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public rqe a() {
            return this.a;
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("retry_button", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        c(p3 p3Var, String str, a aVar) {
            rqe.b p = p3Var.a.p();
            je.r("empty_state", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public b b(Integer num, String str, String str2) {
        return new b(this, num, str, str2, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }
}
