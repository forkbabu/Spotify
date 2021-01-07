package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class b1 {
    private final rqe a = je.X("music", "mobile-findfriends", "1.0.1");

    public final class b {
        private final rqe a;

        b(b1 b1Var, a aVar) {
            rqe.b p = b1Var.a.p();
            je.l("connect_to_facebook_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        c(b1 b1Var, a aVar) {
            rqe.b p = b1Var.a.p();
            je.l("filter_text", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("filter", 1, "key_stroke", f);
        }
    }

    public final class d {
        private final rqe a;

        d(b1 b1Var, a aVar) {
            rqe.b p = b1Var.a.p();
            je.l("follow_all_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "follow", 1, "hit"), "item_to_be_followed", str, f);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.b1$e$a$a  reason: collision with other inner class name */
            public final class C0399a {
                private final rqe a;

                C0399a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("follow_button", p);
                    p.f(Boolean.FALSE);
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

            a(e eVar, Integer num, String str, a aVar) {
                rqe.b p = eVar.a.p();
                je.o("user", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0399a b() {
                return new C0399a(this, null);
            }

            public nqe c(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        e(b1 b1Var, a aVar) {
            rqe.b p = b1Var.a.p();
            je.l("user_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d() {
        return new d(this, null);
    }

    public e e() {
        return new e(this, null);
    }
}
