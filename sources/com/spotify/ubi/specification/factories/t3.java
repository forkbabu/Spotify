package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class t3 {
    private final rqe a = je.X("music", "mobile-share-sub-menu", "3.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, Integer num, a aVar) {
                rqe.b p = bVar.a.p();
                je.t("share_destination", str, num, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str, String str2) {
                nqe.b f = nqe.f();
                qqe.b T = je.T(f, this.a, "share", 1, "hit");
                T.d("entity_to_be_shared", str);
                T.d("share_id", str2);
                f.h(T.a());
                return (nqe) f.c();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(t3 t3Var, a aVar) {
            rqe.b p = t3Var.a.p();
            je.l("menu_items", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, Integer num) {
            return new a(this, str, num, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
