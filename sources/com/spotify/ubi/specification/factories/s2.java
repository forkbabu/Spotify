package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class s2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.s2$b$a$a  reason: collision with other inner class name */
            public final class C0542a {
                private final rqe a;

                C0542a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("add_episode_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "like", 1, "hit"), "item_to_be_liked", str, f);
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.s2$b$a$b  reason: collision with other inner class name */
            public final class C0543b {
                private final rqe a;

                C0543b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("download_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "download", 1, "hit"), "item_to_download", str, f);
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "remove_download", 1, "hit"), "item_to_remove_from_downloads", str, f);
                }
            }

            public final class c {
                private final rqe a;

                c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("mark_as_played_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "mark_as_played", 1, "hit"), "item_played", str, f);
                }
            }

            public final class d {
                private final rqe a;

                d(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("play_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.PAUSE, 1, "hit"), "item_to_be_paused", str, f);
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("actions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0542a b() {
                return new C0542a(this, null);
            }

            public C0543b c() {
                return new C0543b(this, null);
            }

            public c d() {
                return new c(this, null);
            }

            public d e() {
                return new d(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.s2$b$b  reason: collision with other inner class name */
        public final class C0544b {
            private final rqe a;

            C0544b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("context_menu_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        b(s2 s2Var, Integer num, String str, a aVar) {
            rqe.b p = s2Var.a.p();
            je.o("episode_card_container", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0544b c(String str) {
            return new C0544b(this, str, null);
        }

        public nqe d(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public s2(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-episode-card");
        e.m("2.1.0");
        e.j(str);
        this.a = e.d();
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }
}
