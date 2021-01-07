package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class j4 {
    private final rqe a = je.X("music", "mobile-voice-onboarding", "2.0.1");

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

        /* renamed from: com.spotify.ubi.specification.factories.j4$b$b  reason: collision with other inner class name */
        public final class C0463b {
            private final rqe a;

            C0463b(b bVar, a aVar) {
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

        b(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_mic_and_ww_mic_permissions", p);
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

        public C0463b d() {
            return new C0463b(this, null);
        }

        public c e() {
            return new c(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("enable_hey_spotify", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.j4$c$c  reason: collision with other inner class name */
        public final class C0464c {
            private final rqe a;

            C0464c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

            d(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        c(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_mic_and_ww_start", p);
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

        public C0464c e() {
            return new C0464c(this, null);
        }

        public d f() {
            return new d(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class b {
            private final rqe a;

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.j4$d$d  reason: collision with other inner class name */
        public final class C0465d {
            private final rqe a;

            C0465d(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        d(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_mic_only_mic_permissions", p);
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

        public c e() {
            return new c(this, null);
        }

        public C0465d f() {
            return new C0465d(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("get_started", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        public final class b {
            private final rqe a;

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

            c(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

        e(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_mic_only_start", p);
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

        public c e() {
            return new c(this, null);
        }
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("enable_hey_spotify", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        public final class b {
            private final rqe a;

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("maybe_later", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        public final class c {
            private final rqe a;

            c(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

            d(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

        f(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_ww_only_start", p);
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

        public c e() {
            return new c(this, null);
        }

        public d f() {
            return new d(this, null);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("microphone_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        g(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
            je.l("onboarding_ww_tutorial", p);
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

    public final class h {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
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

            b(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
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

        h(j4 j4Var, a aVar) {
            rqe.b p = j4Var.a.p();
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

    public d d() {
        return new d(this, null);
    }

    public e e() {
        return new e(this, null);
    }

    public f f() {
        return new f(this, null);
    }

    public g g() {
        return new g(this, null);
    }

    public h h() {
        return new h(this, null);
    }
}
