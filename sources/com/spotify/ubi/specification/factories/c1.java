package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class c1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("entity_card", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        b(c1 c1Var, Integer num, String str, a aVar) {
            rqe.b p = c1Var.a.p();
            je.o("automated_messaging_item", num, str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.c1$c$a$a  reason: collision with other inner class name */
            public final class C0406a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.c1$c$a$a$a  reason: collision with other inner class name */
                public final class C0407a {
                    private final rqe a;

                    C0407a(C0406a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("avatar_image", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.c1$c$a$a$b */
                public final class b {
                    private final rqe a;

                    b(C0406a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("dismiss_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("remove_recommendation", 1, "hit", "recommended_item_uri", str));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.c1$c$a$a$c  reason: collision with other inner class name */
                public final class C0408c {
                    private final rqe a;

                    C0408c(C0406a aVar, a aVar2) {
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
                }

                C0406a(a aVar, Integer num, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.o("artist_card", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public C0407a b() {
                    return new C0407a(this, null);
                }

                public b c() {
                    return new b(this, null);
                }

                public C0408c d() {
                    return new C0408c(this, null);
                }

                public mqe e() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("carousel", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0406a b(Integer num, String str) {
                return new C0406a(this, num, str, null);
            }
        }

        c(c1 c1Var, Integer num, a aVar) {
            rqe.b p = c1Var.a.p();
            je.m("follow_recommendations", num, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
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

            /* renamed from: com.spotify.ubi.specification.factories.c1$d$a$a  reason: collision with other inner class name */
            public final class C0409a {
                private final rqe a;

                C0409a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("back_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_navigate_back", 1, "hit", f);
                }
            }

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("toolbar", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0409a b() {
                return new C0409a(this, null);
            }
        }

        d(c1 c1Var, a aVar) {
            rqe.b p = c1Var.a.p();
            je.l("header", p);
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

            /* renamed from: com.spotify.ubi.specification.factories.c1$e$a$a  reason: collision with other inner class name */
            public final class C0410a {
                private final rqe a;

                C0410a(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.s("artist_avatar_image", str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("more_artists", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("header", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0410a b(String str) {
                return new C0410a(this, str, null);
            }

            public b c() {
                return new b(this, null);
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.c1$e$b$a$a  reason: collision with other inner class name */
                public final class C0411a {
                    private final rqe a;

                    C0411a(a aVar, a aVar2) {
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

                /* renamed from: com.spotify.ubi.specification.factories.c1$e$b$a$b  reason: collision with other inner class name */
                public final class C0412b {
                    private final rqe a;

                    C0412b(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("entity", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                        return (nqe) bVar.c();
                    }
                }

                public final class c {
                    private final rqe a;

                    c(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("play_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W(ContextTrack.TrackAction.PAUSE, 1, "hit", "item_to_be_paused", str));
                        return (nqe) bVar.c();
                    }

                    public nqe b(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                        return (nqe) bVar.c();
                    }

                    public nqe c(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W(ContextTrack.TrackAction.RESUME, 1, "hit", "item_to_be_resumed", str));
                        return (nqe) bVar.c();
                    }
                }

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("content", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0411a b() {
                    return new C0411a(this, null);
                }

                public C0412b c() {
                    return new C0412b(this, null);
                }

                public c d() {
                    return new c(this, null);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.c1$e$b$b  reason: collision with other inner class name */
            public final class C0413b {
                private final rqe a;

                C0413b(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("footer", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            public final class c {
                private final rqe a;

                public final class a {
                    private final rqe a;

                    a(c cVar, a aVar) {
                        rqe.b p = cVar.a.p();
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

                c(b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("track_row", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public a b() {
                    return new a(this, null);
                }

                public nqe c(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                    return (nqe) bVar.c();
                }

                public nqe d() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "long_hit", f);
                }
            }

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("release_card", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0413b c() {
                return new C0413b(this, null);
            }

            public c d(Integer num, String str) {
                return new c(this, num, str, null);
            }
        }

        e(c1 c1Var, Integer num, String str, a aVar) {
            rqe.b p = c1Var.a.p();
            je.o("music_release", num, str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public b d() {
            return new b(this, null);
        }
    }

    public c1(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-followfeed");
        e2.m("3.0.1");
        e2.j(str);
        this.a = e2.d();
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }

    public c c(Integer num) {
        return new c(this, num, null);
    }

    public d d() {
        return new d(this, null);
    }

    public e e(Integer num, String str) {
        return new e(this, num, str, null);
    }
}
