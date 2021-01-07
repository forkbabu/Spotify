package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class v3 {
    private final rqe a = je.X("music", "mobile-social-listening", "1.0.5");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("cancel_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.v3$b$b  reason: collision with other inner class name */
        public final class C0564b {
            private final rqe a;

            C0564b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("end_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("stop_hosting_social_listening_session", 1, "hit", f);
            }
        }

        b(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("confirm_end_session_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0564b c(String str) {
            return new C0564b(this, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("join_session_button", str, p);
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

            b(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("not_now_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        c(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("confirm_join_session_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("cancel_button", str, p);
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

            b(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("leave_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("leave_social_listening_session", 1, "hit", f);
            }
        }

        d(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("confirm_leave_session_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }
    }

    public final class e {
        private final rqe a;

        e(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("deeplinking", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("join_social_listening_session", 1, "hit", f);
        }
    }

    public final class f {
        private final rqe a;

        f(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("end_session_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("stop_hosting_social_listening_session", 1, "hit", f);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("retry_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("retry", 1, "hit", f);
            }
        }

        g(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("error_layout", p);
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

        h(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("facepile", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public final class i {
        private final rqe a;

        i(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("join_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("launch_camera", 1, "hit", f);
        }
    }

    public final class j {
        private final rqe a;

        j(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("leave_session_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("leave_social_listening_session", 1, "hit", f);
        }
    }

    public final class k {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(k kVar, String str, a aVar) {
                rqe.b p = kVar.a.p();
                je.s("cancel", str, p);
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

            b(k kVar, String str, a aVar) {
                rqe.b p = kVar.a.p();
                je.s("continue_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("join_social_listening_session", 1, "hit", f);
            }
        }

        public final class c {
            private final rqe a;

            c(k kVar, String str, a aVar) {
                rqe.b p = kVar.a.p();
                je.s("listen_on_host_device_radio_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        public final class d {
            private final rqe a;

            d(k kVar, String str, a aVar) {
                rqe.b p = kVar.a.p();
                je.s("listen_on_own_device_radio_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        k(v3 v3Var, a aVar) {
            rqe.b p = v3Var.a.p();
            je.l("output_mode_selection_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }

        public c d(String str) {
            return new c(this, str, null);
        }

        public d e(String str) {
            return new d(this, str, null);
        }
    }

    public final class l {
        private final rqe a;

        l(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("scanning", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("join_social_listening_session", 1, "scan_code", f);
        }
    }

    public final class m {
        private final rqe a;

        m(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("see_listeners_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public final class n {
        private final rqe a;

        n(v3 v3Var, String str, a aVar) {
            rqe.b p = v3Var.a.p();
            je.s("start_session_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
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

    public e e(String str) {
        return new e(this, str, null);
    }

    public f f(String str) {
        return new f(this, str, null);
    }

    public g g() {
        return new g(this, null);
    }

    public h h(String str) {
        return new h(this, str, null);
    }

    public i i() {
        return new i(this, null);
    }

    public j j(String str) {
        return new j(this, str, null);
    }

    public k k() {
        return new k(this, null);
    }

    public l l(String str) {
        return new l(this, str, null);
    }

    public m m(String str) {
        return new m(this, str, null);
    }

    public n n(String str) {
        return new n(this, str, null);
    }
}
