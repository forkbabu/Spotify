package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class h4 {
    private final rqe a = je.X("music", "mobile-voice-experiments-experience", "6.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.v("dialog", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.h4$b$b  reason: collision with other inner class name */
        public final class C0454b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.h4$b$b$a */
            public final class a {
                private final rqe a;

                a(C0454b bVar, String str, String str2, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.v("first_transcription", str, str2, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            C0454b(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.v("listening", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(String str, String str2) {
                return new a(this, str, str2, null);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.v("preview_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class d {
            private final rqe a;

            d(b bVar, String str, String str2, a aVar) {
                rqe.b p = bVar.a.p();
                je.v("tts_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(h4 h4Var, String str, a aVar) {
            rqe.b p = h4Var.a.p();
            je.q("generic_dialog", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, String str2) {
            return new a(this, str, str2, null);
        }

        public C0454b c(String str, String str2) {
            return new C0454b(this, str, str2, null);
        }

        public c d(String str, String str2) {
            return new c(this, str, str2, null);
        }

        public d e(String str, String str2) {
            return new d(this, str, str2, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.h4$c$a$a  reason: collision with other inner class name */
            public final class C0455a {
                private final rqe a;

                C0455a(a aVar, String str, String str2, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.v("dialog_buzz_in", str, str2, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            a(c cVar, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.v("dialog", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0455a b(String str, String str2) {
                return new C0455a(this, str, str2, null);
            }

            public mqe c() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, String str, String str2, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.v("idle_buzz_in", str, str2, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.h4$c$b$b  reason: collision with other inner class name */
            public final class C0456b {
                private final rqe a;

                C0456b(b bVar, String str, String str2, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.v("idle_timeout", str, str2, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            b(c cVar, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.v("idle", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(String str, String str2) {
                return new a(this, str, str2, null);
            }

            public C0456b c(String str, String str2) {
                return new C0456b(this, str, str2, null);
            }

            public mqe d() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.h4$c$c  reason: collision with other inner class name */
        public final class C0457c {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.h4$c$c$a */
            public final class a {
                private final rqe a;

                a(C0457c cVar, String str, String str2, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.v("first_transcription", str, str2, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            C0457c(c cVar, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.v("listening", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(String str, String str2) {
                return new a(this, str, str2, null);
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(d dVar, String str, String str2, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.v("preview_buzz_in", str, str2, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            d(c cVar, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.v("preview_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c(String str, String str2) {
                return new a(this, str, str2, null);
            }
        }

        public final class e {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(e eVar, String str, String str2, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.v("tts_buzz_in", str, str2, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            e(c cVar, String str, String str2, a aVar) {
                rqe.b p = cVar.a.p();
                je.v("tts_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c(String str, String str2) {
                return new a(this, str, str2, null);
            }
        }

        c(h4 h4Var, String str, a aVar) {
            rqe.b p = h4Var.a.p();
            je.q("guessing_game", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, String str2) {
            return new a(this, str, str2, null);
        }

        public b c(String str, String str2) {
            return new b(this, str, str2, null);
        }

        public C0457c d(String str, String str2) {
            return new C0457c(this, str, str2, null);
        }

        public d e(String str, String str2) {
            return new d(this, str, str2, null);
        }

        public e f(String str, String str2) {
            return new e(this, str, str2, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.h4$d$a$a  reason: collision with other inner class name */
            public final class C0458a {
                private final rqe a;

                C0458a(a aVar, String str, String str2, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.v("first_transcription", str, str2, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            a(d dVar, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.v("listening", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0458a b(String str, String str2) {
                return new C0458a(this, str, str2, null);
            }
        }

        public final class b {
            private final rqe a;

            b(d dVar, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.v("play_artist", str, str2, p);
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

            c(d dVar, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.v("preview_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.h4$d$d  reason: collision with other inner class name */
        public final class C0459d {
            private final rqe a;

            C0459d(d dVar, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.v("try_another", str, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        public final class e {
            private final rqe a;

            e(d dVar, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                je.v("tts_playback", str, str2, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        d(h4 h4Var, String str, a aVar) {
            rqe.b p = h4Var.a.p();
            je.q("introducer_dialog", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, String str2) {
            return new a(this, str, str2, null);
        }

        public b c(String str, String str2) {
            return new b(this, str, str2, null);
        }

        public c d(String str, String str2) {
            return new c(this, str, str2, null);
        }

        public C0459d e(String str, String str2) {
            return new C0459d(this, str, str2, null);
        }

        public e f(String str, String str2) {
            return new e(this, str, str2, null);
        }
    }

    public final class e {
        private final rqe a;

        e(h4 h4Var, String str, String str2, a aVar) {
            rqe.b p = h4Var.a.p();
            je.v("offline_error", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class f {
        private final rqe a;

        f(h4 h4Var, String str, String str2, a aVar) {
            rqe.b p = h4Var.a.p();
            je.v("swipe_down_close", str, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "swipe", f);
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

    public e e(String str, String str2) {
        return new e(this, str, str2, null);
    }

    public f f(String str, String str2) {
        return new f(this, str, str2, null);
    }
}
