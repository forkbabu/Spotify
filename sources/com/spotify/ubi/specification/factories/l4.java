package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class l4 {
    private final rqe a = je.X("music", "mobile-wrapped-datastories", "6.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.w("correct_answer", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.l4$b$b  reason: collision with other inner class name */
        public final class C0484b {
            private final rqe a;

            C0484b(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.w("wrong_answer", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(l4 l4Var, String str, String str2, a aVar) {
            rqe.b p = l4Var.a.p();
            je.w("wrapped_datastory", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, String str2) {
            return new a(this, str, str2, null);
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "like", 1, "hit"), "item_to_be_liked", str, f);
        }

        public nqe d(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "navigate_to_external_uri", 1, "hit"), "destination", str, f);
        }

        public nqe e() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }

        public nqe f() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("refresh_content", 1, "hit", f);
        }

        public mqe g() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public C0484b h(String str, String str2) {
            return new C0484b(this, str, str2, null);
        }
    }

    public b b(String str, String str2) {
        return new b(this, str, str2, null);
    }
}
