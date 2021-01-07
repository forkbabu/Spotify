package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class c4 {
    private final rqe a = je.X("music", "mobile-tab-bar", "3.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("home_tab", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.c4$b$b  reason: collision with other inner class name */
        public final class C0416b {
            private final rqe a;

            C0416b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("premium", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("search_tab", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "long_hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        public final class d {
            private final rqe a;

            d(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("your_library_tab", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        b(c4 c4Var, a aVar) {
            rqe.b p = c4Var.a.p();
            je.l("tab_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0416b c() {
            return new C0416b(this, null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e() {
            return new d(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
