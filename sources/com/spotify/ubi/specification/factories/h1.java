package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class h1 {
    private final rqe a = je.X("music", "mobile-home-mix-entity", "4.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("chill_button", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("tune_disabled", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("tune_enabled", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.h1$b$b  reason: collision with other inner class name */
        public final class C0452b {
            private final rqe a;

            C0452b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("play_pause_button", str, p);
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
        }

        public final class c {
            private final rqe a;

            c(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("upbeat_button", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("tune_disabled", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("tune_enabled", 1, "hit", f);
            }
        }

        b(h1 h1Var, String str, a aVar) {
            rqe.b p = h1Var.a.p();
            je.s("mix_control_buttons", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0452b c(String str) {
            return new C0452b(this, str, null);
        }

        public c d(String str) {
            return new c(this, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.h1$c$a$a  reason: collision with other inner class name */
            public final class C0453a {
                private final rqe a;

                C0453a(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.s("facepile", str, p);
                    p.f(Boolean.TRUE);
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

                b(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.s("track_entity", str, p);
                    p.f(Boolean.TRUE);
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

            a(c cVar, Integer num, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.o("track_item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0453a b(String str) {
                return new C0453a(this, str, null);
            }

            public b c(String str) {
                return new b(this, str, null);
            }
        }

        c(h1 h1Var, a aVar) {
            rqe.b p = h1Var.a.p();
            je.l("track_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c() {
        return new c(this, null);
    }
}
