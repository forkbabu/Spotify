package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class c {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("link_account_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(c.this.b);
                return (nqe) je.S("ui_reveal", 1, "hit", bVar);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.c$b$b  reason: collision with other inner class name */
        public final class C0405b {
            private final rqe a;

            C0405b(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("not_now_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(c.this.b);
                return (nqe) je.S("ui_hide", 1, "hit", bVar);
            }
        }

        b(a aVar) {
            rqe.b p = c.this.a.p();
            je.l("nudge", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            mqe.b bVar = e;
            bVar.f(c.this.b);
            return (mqe) bVar.c();
        }

        public a c() {
            return new a(null);
        }

        public C0405b d() {
            return new C0405b(null);
        }
    }

    public c() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-account-linking-nudges");
        e.m("1.0.1");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }
}
