package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class o3 {
    private final rqe a = je.X("music", "mobile-scannables", "1.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("allow_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.o3$b$b  reason: collision with other inner class name */
        public final class C0494b {
            private final rqe a;

            C0494b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("disallow_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        b(o3 o3Var, a aVar) {
            rqe.b p = o3Var.a.p();
            je.l("camera_permission_request_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0494b c() {
            return new C0494b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("cancel_button", p);
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

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("scan_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        c(o3 o3Var, a aVar) {
            rqe.b p = o3Var.a.p();
            je.l("information_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("close_button", p);
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

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("select_photo_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        d(o3 o3Var, a aVar) {
            rqe.b p = o3Var.a.p();
            je.l("scanning_view", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public nqe c() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("join_social_listening_session", 1, "scan_code", f);
        }

        public nqe d(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "scan_code", "destination", str));
            return (nqe) bVar.c();
        }

        public b e() {
            return new b(this, null);
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
}
