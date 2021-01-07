package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class s3 {
    private final rqe a = je.X("music", "mobile-share-menu", "4.0.0");

    public final class b {
        private final rqe a;

        b(s3 s3Var, String str, a aVar) {
            rqe.b p = s3Var.a.p();
            je.r("error_message", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("retry", 1, "hit", f);
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, Integer num, a aVar) {
                rqe.b p = cVar.a.p();
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

        c(s3 s3Var, a aVar) {
            rqe.b p = s3Var.a.p();
            je.l("menu_items", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str, Integer num) {
            return new a(this, str, num, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        d(s3 s3Var, a aVar) {
            rqe.b p = s3Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d() {
        return new d(this, null);
    }
}
