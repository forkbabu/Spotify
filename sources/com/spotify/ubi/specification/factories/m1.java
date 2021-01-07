package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class m1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(m1 m1Var, a aVar) {
            rqe.b p = m1Var.a.p();
            je.l("back", p);
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

        c(m1 m1Var, a aVar) {
            rqe.b p = m1Var.a.p();
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

    public final class d {
        private final rqe a;

        d(m1 m1Var, a aVar) {
            rqe.b p = m1Var.a.p();
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

    public final class e {
        private final rqe a;

        e(m1 m1Var, a aVar) {
            rqe.b p = m1Var.a.p();
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

    public final class f {
        private final rqe a;

        f(m1 m1Var, a aVar) {
            rqe.b p = m1Var.a.p();
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

    public m1(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-image-picker");
        e2.m("1.0.0");
        e2.g(str);
        this.a = e2.d();
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
}
