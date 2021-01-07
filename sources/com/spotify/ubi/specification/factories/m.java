package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class m {
    private final rqe a = je.X("music", "mobile-allboarding-contentpicker", "6.0.0");

    public final class b {
        private final rqe a;

        b(m mVar, a aVar) {
            rqe.b p = mVar.a.p();
            je.l("action_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, Integer num, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                sqe.b c = sqe.c();
                c.c("banner_button");
                c.d(num);
                c.f(str);
                c.e(str2);
                p.n(c.a());
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("add_interest", 1, "hit", f);
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        c(m mVar, Integer num, a aVar) {
            rqe.b p = mVar.a.p();
            je.m("banner_section", num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num, String str, String str2) {
            return new a(this, num, str, str2, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("input_field", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        d(m mVar, a aVar) {
            rqe.b p = mVar.a.p();
            je.l("search_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("abort_skip_button", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class b {
            private final rqe a;

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("confirm_skip_button", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        e(m mVar, a aVar) {
            rqe.b p = mVar.a.p();
            je.l("skip_modal", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a a() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public mqe d() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, Integer num, String str, String str2, a aVar) {
                rqe.b p = fVar.a.p();
                sqe.b c = sqe.c();
                c.c("squircle_button");
                c.d(num);
                c.f(str);
                c.e(str2);
                p.n(c.a());
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("add_interest", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }

            public mqe c() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        f(m mVar, Integer num, a aVar) {
            rqe.b p = mVar.a.p();
            je.m("squircle_section", num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(Integer num, String str, String str2) {
            return new a(this, num, str, str2, null);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c(Integer num) {
        return new c(this, num, null);
    }

    public d d() {
        return new d(this, null);
    }

    public e e() {
        return new e(this, null);
    }

    public f f(Integer num) {
        return new f(this, num, null);
    }
}
