package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class s {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.s$b$a$a  reason: collision with other inner class name */
            public final class C0540a {
                private final rqe a;

                C0540a(a aVar) {
                    rqe.b p = a.this.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.f(s.this.b);
                    return (nqe) je.S("ui_reveal", 1, "hit", bVar);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.s$b$a$b  reason: collision with other inner class name */
            public final class C0541b {
                private final rqe a;

                C0541b(a aVar) {
                    rqe.b p = a.this.a.p();
                    je.l("follow_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.f(s.this.b);
                    nqe.b bVar2 = bVar;
                    bVar2.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
                    return (nqe) bVar2.c();
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.f(s.this.b);
                    nqe.b bVar2 = bVar;
                    bVar2.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
                    return (nqe) bVar2.c();
                }
            }

            a(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("top_bar", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0540a b() {
                return new C0540a(null);
            }

            public C0541b c() {
                return new C0541b(null);
            }
        }

        b(a aVar) {
            rqe.b p = s.this.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(Integer num, String str, a aVar) {
                rqe.b p = c.this.a.p();
                je.o("track_row", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(s.this.b);
                nqe.b bVar2 = bVar;
                bVar2.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar2.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(s.this.b);
                return (nqe) je.S("ui_reveal", 1, "hit", bVar);
            }
        }

        c(a aVar) {
            rqe.b p = s.this.a.p();
            je.l("top_tracks", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(num, str, null);
        }
    }

    public s() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-artist-page");
        e.m("18.0.0");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }

    public c d() {
        return new c(null);
    }
}
