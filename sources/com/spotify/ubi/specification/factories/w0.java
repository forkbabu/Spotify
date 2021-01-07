package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class w0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("back", p);
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

    public final class c {
        private final rqe a;

        c(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("cancel_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("choose_image_button", p);
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

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("remove_current_image_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.w0$d$d  reason: collision with other inner class name */
        public final class C0567d {
            private final rqe a;

            C0567d(d dVar, a aVar) {
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

        d(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("change_image_dialog", p);
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

        public C0567d e() {
            return new C0567d(this, null);
        }
    }

    public final class e {
        private final rqe a;

        e(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
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

    public final class f {
        private final rqe a;

        f(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("cover_art", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class g {
        private final rqe a;

        g(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("description_field", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("set_playlist_description", 1, "key_stroke", "playlist_to_change_description_on", str));
            return (nqe) bVar.c();
        }
    }

    public final class h {
        private final rqe a;

        h(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
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

    public final class i {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("error_cancel_button", p);
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

            b(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("progress_cancel_button", p);
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

            c(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("save_others_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        i(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("error_dialog", p);
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

    public final class j {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(j jVar, a aVar) {
                rqe.b p = jVar.a.p();
                je.l("remove_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("remove_item_from_playlist", 1, "hit", "item_to_be_removed_from_playlist", str));
                return (nqe) bVar.c();
            }
        }

        j(w0 w0Var, String str, a aVar) {
            rqe.b p = w0Var.a.p();
            je.s("item", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe b() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("sort", 1, "drag", f);
        }

        public a c() {
            return new a(this, null);
        }
    }

    public final class k {
        private final rqe a;

        k(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("name_field", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("rename_playlist", 1, "key_stroke", "playlist_to_be_renamed", str));
            return (nqe) bVar.c();
        }
    }

    public final class l {
        private final rqe a;

        l(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("save_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class m {
        private final rqe a;

        m(w0 w0Var, a aVar) {
            rqe.b p = w0Var.a.p();
            je.l("undo_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public w0(String str, String str2) {
        this.a = je.Y("music", "mobile-edit-playlist", "5.0.0", str, str2);
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

    public j j(String str) {
        return new j(this, str, null);
    }

    public k k() {
        return new k(this, null);
    }

    public l l() {
        return new l(this, null);
    }

    public m m() {
        return new m(this, null);
    }
}
