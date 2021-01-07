package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class u2 {
    private final rqe a = je.X("music", "mobile-podcast-featured-tracklist", "0.0.4");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.u2$b$a$a  reason: collision with other inner class name */
            public final class C0550a {
                private final rqe a;

                C0550a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            a(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0550a b() {
                return new C0550a(this, null);
            }

            public nqe c(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        b(u2 u2Var, a aVar) {
            rqe.b p = u2Var.a.p();
            je.l("tracklist", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
