package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class e3 {
    private final rqe a = je.X("music", "mobile-profile-edit", "1.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("cancel", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.e3$b$b  reason: collision with other inner class name */
        public final class C0436b {
            private final rqe a;

            C0436b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("go_to_settings", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        b(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("camera_permission_denied_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0436b c() {
            return new C0436b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("change_photo_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("choose_photo_button", p);
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

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("remove_current_photo_button", p);
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
                je.l("take_photo_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        d(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("change_photo_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
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
                je.l("discard_button", p);
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
                je.l("keep_editing_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        e(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("confirm_discard_dialog", p);
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

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("cancel", p);
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

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("go_to_settings", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        f(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("gallery_permission_denied_dialog", p);
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

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
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

            b(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("image", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("move_image", 1, "drag", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("resize_image", 1, "pinch", f);
            }

            public nqe c() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("resize_image", 1, "spread", f);
            }
        }

        public final class c {
            private final rqe a;

            c(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("retake_photo_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class d {
            private final rqe a;

            d(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("use_photo_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        g(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("image_preview_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e() {
            return new d(this, null);
        }
    }

    public final class h {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("cancel", p);
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

            b(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("retry", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("retry", 1, "hit", f);
            }
        }

        h(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("save_profile_failed_dialog", p);
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

    public final class i {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("close_button", p);
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

        public final class b {
            private final rqe a;

            b(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("savebutton", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        i(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("toolbar", p);
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

    public final class j {
        private final rqe a;

        j(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("user_displayname_text", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("change_display_name", 1, "key_stroke", f);
        }
    }

    public final class k {
        private final rqe a;

        k(e3 e3Var, a aVar) {
            rqe.b p = e3Var.a.p();
            je.l("user_image", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
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

    public i i() {
        return new i(this, null);
    }

    public j j() {
        return new j(this, null);
    }

    public k k() {
        return new k(this, null);
    }
}
