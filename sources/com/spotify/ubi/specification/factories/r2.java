package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class r2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(r2 r2Var, String str, a aVar) {
            rqe.b p = r2Var.a.p();
            je.s("clear_filter", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("all_episodes_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("downloads_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.r2$c$c  reason: collision with other inner class name */
        public final class C0527c {
            private final rqe a;

            C0527c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("unplayed_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        c(r2 r2Var, a aVar) {
            rqe.b p = r2Var.a.p();
            je.l("filter", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public C0527c d() {
            return new C0527c(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("new_to_old_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("sort", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("old_to_new_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("sort", 1, "hit", f);
            }
        }

        d(r2 r2Var, a aVar) {
            rqe.b p = r2Var.a.p();
            je.l("sort", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }
    }

    public r2(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-entity-sort");
        e.m("2.0.0");
        e.j(str);
        this.a = e.d();
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
