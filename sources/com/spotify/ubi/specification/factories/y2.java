package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class y2 {
    private final rqe a = je.X("music", "mobile-podcast-share-interface", "2.0.0");

    public final class b {
        private final rqe a;

        b(y2 y2Var, a aVar) {
            rqe.b p = y2Var.a.p();
            je.l("hide_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("quote_box", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("no_action", 1, "hit", f);
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        c(y2 y2Var, a aVar) {
            rqe.b p = y2Var.a.p();
            je.l("show_page_quote_carousel", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str) {
            return new a(this, str, null);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
