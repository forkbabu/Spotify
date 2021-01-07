package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class c0 {
    private final rqe a = je.X("music", "mobile-car-mode-home", "3.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.u("nav_card", str, num, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        b(c0 c0Var, String str, Integer num, a aVar) {
            rqe.b p = c0Var.a.p();
            je.t("shelf", str, num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str, Integer num, String str2) {
            return new a(this, str, num, str2, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.u("nav_card", str, num, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        c(c0 c0Var, String str, Integer num, a aVar) {
            rqe.b p = c0Var.a.p();
            je.t("shortcuts", str, num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str, Integer num, String str2) {
            return new a(this, str, num, str2, null);
        }
    }

    public b b(String str, Integer num) {
        return new b(this, str, num, null);
    }

    public c c(String str, Integer num) {
        return new c(this, str, num, null);
    }
}
