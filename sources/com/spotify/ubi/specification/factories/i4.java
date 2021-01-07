package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class i4 {
    private final rqe a = je.X("music", "mobile-voice-experiments-onboarding", "1.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("give_me_access", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("open_os_settings", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.i4$b$b  reason: collision with other inner class name */
        public final class C0461b {
            private final rqe a;

            C0461b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("maybe_later", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("swipe_down_close", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "swipe", f);
            }
        }

        public final class d {
            private final rqe a;

            d(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("terms_and_conditions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("navigate_to_webview_uri", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        b(i4 i4Var, a aVar) {
            rqe.b p = i4Var.a.p();
            je.l("onboarding_guessing_game_mic_permissions", p);
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

        public C0461b d() {
            return new C0461b(this, null);
        }

        public c e() {
            return new c(this, null);
        }

        public d f() {
            return new d(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("accept_mic_permissions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("decline_mic_permissions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        c(i4 i4Var, a aVar) {
            rqe.b p = i4Var.a.p();
            je.l("os_mic_prompt", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a a() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public mqe d() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
