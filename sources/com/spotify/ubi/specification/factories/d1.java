package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class d1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.d1$b$a$a  reason: collision with other inner class name */
            public final class C0417a {
                private final rqe a;

                C0417a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("album_cover", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                    return (nqe) bVar.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.d1$b$a$b  reason: collision with other inner class name */
            public final class C0418b {
                private final rqe a;

                C0418b(a aVar, a aVar2) {
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

            public final class c {
                private final rqe a;

                c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("heart_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
                    return (nqe) bVar.c();
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("remove_like", 1, "hit", "item_no_longer_liked", str));
                    return (nqe) bVar.c();
                }
            }

            public final class d {
                private final rqe a;

                d(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("hide_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("dislike", 1, "hit", "item_to_be_disliked", str));
                    return (nqe) bVar.c();
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("remove_dislike", 1, "hit", "item_no_longer_disliked", str));
                    return (nqe) bVar.c();
                }
            }

            a(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("preview_item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0417a b() {
                return new C0417a(this, null);
            }

            public C0418b c() {
                return new C0418b(this, null);
            }

            public c d() {
                return new c(this, null);
            }

            public d e() {
                return new d(this, null);
            }

            public nqe f(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        b(d1 d1Var, a aVar) {
            rqe.b p = d1Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("back_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        c(d1 d1Var, a aVar) {
            rqe.b p = d1Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public d1(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-free-tier-all-songs");
        e.m("2.0.1");
        e.j(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
