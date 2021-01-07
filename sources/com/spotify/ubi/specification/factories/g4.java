package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class g4 {
    private final rqe a = je.X("music", "mobile-voice-experience", "0.0.17");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("backend_error", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.g4$b$b  reason: collision with other inner class name */
        public final class C0451b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.g4$b$b$a */
            public final class a {
                private final rqe a;

                a(C0451b bVar, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.r("microphone_button", str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            C0451b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("input_error", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c(String str) {
                return new a(this, str, null);
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(c cVar, String str, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.r("first_transcription", str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public mqe a() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("listening", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(String str) {
                return new a(this, str, null);
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("open_os_settings_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("open_os_settings", 1, "hit", f);
                }
            }

            d(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("mic_permissions_disabled", p);
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

        public final class e {
            private final rqe a;

            e(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("offline_error", str, p);
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

            f(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("restriction_error", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(g4 g4Var, a aVar) {
            rqe.b p = g4Var.a.p();
            je.l("states", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0451b c(String str) {
            return new C0451b(this, str, null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e() {
            return new d(this, null);
        }

        public e f(String str) {
            return new e(this, str, null);
        }

        public f g(String str) {
            return new f(this, str, null);
        }
    }

    public final class c {
        private final rqe a;

        c(g4 g4Var, String str, a aVar) {
            rqe.b p = g4Var.a.p();
            je.r("swipe_down_close", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "swipe", f);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }
}
