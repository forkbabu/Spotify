package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class g1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.g1$b$a$a  reason: collision with other inner class name */
            public final class C0448a {
                private final rqe a;

                C0448a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("not_now_button", p);
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
                je.l("taste_onboarding", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0448a b() {
                return new C0448a(this, null);
            }
        }

        b(g1 g1Var, String str, Integer num, a aVar) {
            rqe.b p = g1Var.a.p();
            je.t("page_header", str, num, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.u("nav_card", str, num, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        c(g1 g1Var, String str, Integer num, a aVar) {
            rqe.b p = g1Var.a.p();
            je.t("recently_played", str, num, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, Integer num, String str2) {
            return new a(this, null, num, str2, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.u("follow_and_nav_card", str, num, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
                return (nqe) bVar.c();
            }
        }

        public final class b {
            private final rqe a;

            b(d dVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.u("nav_card", str, num, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        public final class c {
            private final rqe a;

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("section_header", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        d(g1 g1Var, String str, Integer num, a aVar) {
            rqe.b p = g1Var.a.p();
            je.t("shelf", str, num, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, Integer num, String str2) {
            return new a(this, str, num, str2, null);
        }

        public b c(String str, Integer num, String str2) {
            return new b(this, null, num, str2, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, String str, String str2, a aVar) {
                rqe.b p = eVar.a.p();
                sqe.b c = sqe.c();
                c.c("feed_icon");
                c.f(str);
                c.e(str2);
                p.n(c.a());
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class b {
            private final rqe a;

            b(e eVar, String str, String str2, a aVar) {
                rqe.b p = eVar.a.p();
                sqe.b c = sqe.c();
                c.c("listening_history_icon");
                c.f(str);
                c.e(str2);
                p.n(c.a());
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class c {
            private final rqe a;

            c(e eVar, String str, a aVar) {
                rqe.b p = eVar.a.p();
                je.r("settings_icon", str, p);
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

        e(g1 g1Var, a aVar) {
            rqe.b p = g1Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, String str2) {
            return new a(this, str, str2, null);
        }

        public b c(String str, String str2) {
            return new b(this, str, str2, null);
        }

        public c d(String str) {
            return new c(this, str, null);
        }
    }

    public g1(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-home");
        e2.m("4.0.0");
        e2.i(str);
        this.a = e2.d();
    }

    public b b(String str, Integer num) {
        return new b(this, str, num, null);
    }

    public c c(String str, Integer num) {
        return new c(this, str, num, null);
    }

    public d d(String str, Integer num) {
        return new d(this, str, num, null);
    }

    public e e() {
        return new e(this, null);
    }
}
