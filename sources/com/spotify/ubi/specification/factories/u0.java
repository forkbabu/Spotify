package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class u0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.u0$b$a$a  reason: collision with other inner class name */
            public final class C0548a {
                private final rqe a;

                C0548a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("close_button", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("header", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0548a b() {
                return new C0548a(this, null);
            }
        }

        b(u0 u0Var, a aVar) {
            rqe.b p = u0Var.a.p();
            je.l("skip_limit_suggestions", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public u0(String str, String str2) {
        this.a = je.Y("music", "mobile-darwin-experiments", "2.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }
}
