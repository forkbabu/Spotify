package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class l1 {
    private final rqe a = je.X("music", "mobile-hubs-new-marketing-format", "2.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, Integer num, a aVar) {
                rqe.b p = bVar.a.p();
                je.t("slide", str, num, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("play_something", 1, "hit", f);
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }

            public mqe c() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public nqe d() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "swipe", f);
            }
        }

        b(l1 l1Var, String str, a aVar) {
            rqe.b p = l1Var.a.p();
            je.s("header_carousel", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, Integer num) {
            return new a(this, str, num, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
