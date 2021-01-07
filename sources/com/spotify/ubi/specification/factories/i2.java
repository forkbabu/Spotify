package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class i2 {
    private final rqe a = je.X("music", "mobile-partner-account-linking", "2.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("dismiss_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.i2$b$b  reason: collision with other inner class name */
        public final class C0460b {
            private final rqe a;

            C0460b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("link_accounts_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        b(i2 i2Var, a aVar) {
            rqe.b p = i2Var.a.p();
            je.l("account_linking_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public C0460b d() {
            return new C0460b(this, null);
        }

        public nqe e() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "swipe", f);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
