package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class q1 {
    private final rqe a = je.X("music", "mobile-lyrics", "3.0.0");

    public final class b {
        private final rqe a;

        b(q1 q1Var, String str, a aVar) {
            rqe.b p = q1Var.a.p();
            je.s("card_view", str, p);
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

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q1$c$a$a  reason: collision with other inner class name */
            public final class C0503a {
                private final rqe a;

                C0503a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("less_vocal_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("decrease_vocals_volume", 1, "hit", f);
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("more_vocal_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("increase_vocals_volume", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q1$c$a$c  reason: collision with other inner class name */
            public final class C0504c {
                private final rqe a;

                C0504c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("report_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("report_quality", 1, "hit", f);
                }
            }

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("context_menu", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0503a b() {
                return new C0503a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public C0504c d() {
                return new C0504c(this, null);
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q1$c$b$b  reason: collision with other inner class name */
            public final class C0505b {
                private final rqe a;

                C0505b(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("play_pause_button", p);
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

            /* renamed from: com.spotify.ubi.specification.factories.q1$c$b$c  reason: collision with other inner class name */
            public final class C0506c {
                private final rqe a;

                C0506c(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("vocal_removal_button", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("vocal_removal_disabled", 1, "hit", f);
                }

                public nqe b() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("vocal_removal_enabled", 1, "hit", f);
                }

                public mqe c() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("footer_view", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0505b c() {
                return new C0505b(this, null);
            }

            public C0506c d() {
                return new C0506c(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.q1$c$c  reason: collision with other inner class name */
        public final class C0507c {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q1$c$c$a */
            public final class a {
                private final rqe a;

                a(C0507c cVar, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.l("sync_these_lyrics", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "navigate_to_external_uri", 1, "hit"), "destination", str, f);
                }
            }

            C0507c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("lyrics_view", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("ok_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            d(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("report_banner", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c() {
                return new a(this, null);
            }
        }

        c(q1 q1Var, String str, a aVar) {
            rqe.b p = q1Var.a.p();
            je.s("fullscreen_view", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public C0507c d() {
            return new C0507c(this, null);
        }

        public d e() {
            return new d(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class b {
            private final rqe a;

            b(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.q("share_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str, String str2) {
                nqe.b f = nqe.f();
                qqe.b T = je.T(f, this.a, "share", 1, "hit");
                T.d("entity_to_be_shared", str);
                T.d("share_id", str2);
                f.h(T.a());
                return (nqe) f.c();
            }
        }

        public final class c {
            private final rqe a;

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("share_card", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("no_action", 1, "hit", f);
            }
        }

        d(q1 q1Var, String str, a aVar) {
            rqe.b p = q1Var.a.p();
            je.s("share_destination_picker_view", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

        public final class b {
            private final rqe a;

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("next_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        e(q1 q1Var, String str, a aVar) {
            rqe.b p = q1Var.a.p();
            je.s("share_lyrics_selection_view", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }

    public d d(String str) {
        return new d(this, str, null);
    }

    public e e(String str) {
        return new e(this, str, null);
    }
}
