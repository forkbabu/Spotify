package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class x3 {
    private final rqe a = je.X("music", "mobile-social-listening-participants", "1.0.3");

    public final class b {
        private final rqe a;

        b(x3 x3Var, String str, a aVar) {
            rqe.b p = x3Var.a.p();
            je.s("invite_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, Integer num, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.o("participant", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        c(x3 x3Var, String str, a aVar) {
            rqe.b p = x3Var.a.p();
            je.s("participant_list", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("invite_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        d(x3 x3Var, a aVar) {
            rqe.b p = x3Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }

    public d d() {
        return new d(this, null);
    }
}
