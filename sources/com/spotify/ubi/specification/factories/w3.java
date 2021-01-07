package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class w3 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.w3$b$a$a  reason: collision with other inner class name */
            public final class C0569a {
                private final rqe a;

                C0569a(a aVar) {
                    rqe.b p = a.this.a.p();
                    je.l("join_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.f(w3.this.b);
                    return (nqe) je.S("ui_reveal", 1, "hit", bVar);
                }
            }

            a(Integer num, String str, a aVar) {
                rqe.b p = b.this.a.p();
                je.o("session", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0569a b() {
                return new C0569a(null);
            }
        }

        b(a aVar) {
            rqe.b p = w3.this.a.p();
            je.l("sessions_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(num, str, null);
        }
    }

    public w3() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-social-listening-nearby");
        e.m("1.0.1");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }
}
