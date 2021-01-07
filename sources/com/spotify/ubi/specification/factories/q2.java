package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class q2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q2$b$a$a  reason: collision with other inner class name */
            public final class C0508a {
                private final rqe a;

                C0508a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("remove_filters_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("clear_filter", 1, "hit", f);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("empty", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0508a b() {
                return new C0508a(this, null);
            }
        }

        b(q2 q2Var, a aVar) {
            rqe.b p = q2Var.a.p();
            je.l("episodes", p);
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

            /* renamed from: com.spotify.ubi.specification.factories.q2$c$a$a  reason: collision with other inner class name */
            public final class C0509a {
                private final rqe a;

                C0509a(a aVar, a aVar2) {
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

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
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

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("actions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0509a b() {
                return new C0509a(this, null);
            }

            public b c() {
                return new b(this, null);
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("podcast_link", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q2$c$b$b  reason: collision with other inner class name */
            public final class C0510b {
                private final rqe a;

                C0510b(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("see_more_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }

                public nqe b() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("description", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0510b c() {
                return new C0510b(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.q2$c$c  reason: collision with other inner class name */
        public final class C0511c {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q2$c$c$a */
            public final class a {
                private final rqe a;

                a(C0511c cVar, Integer num, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.m("topic_button", num, p);
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

            C0511c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("topics", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b(Integer num) {
                return new a(this, num, null);
            }
        }

        c(q2 q2Var, a aVar) {
            rqe.b p = q2Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public C0511c d() {
            return new C0511c(this, null);
        }
    }

    public final class d {
        private final rqe a;

        d(q2 q2Var, String str, a aVar) {
            rqe.b p = q2Var.a.p();
            je.s("trailer", str, p);
            p.f(Boolean.TRUE);
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

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public q2(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-entity");
        e.m("10.0.1");
        e.j(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d(String str) {
        return new d(this, str, null);
    }
}
