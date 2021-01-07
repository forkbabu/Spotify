package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class x2 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("share_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(x2.this.b);
                return (nqe) je.S("ui_reveal", 1, "hit", bVar);
            }
        }

        b(a aVar) {
            rqe.b p = x2.this.a.p();
            je.l("button_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(null);
        }
    }

    public x2(String str, String str2) {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-share-card");
        e.m("1.0.0");
        e.e("7.0.8");
        e.g(str);
        e.j(str2);
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }
}
