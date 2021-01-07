package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class t0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(t0 t0Var, a aVar) {
            rqe.b p = t0Var.a.p();
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

        c(t0 t0Var, a aVar) {
            rqe.b p = t0Var.a.p();
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

        d(t0 t0Var, a aVar) {
            rqe.b p = t0Var.a.p();
            je.l("create_button_name_generated", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("create_playlist", 1, "hit", f);
        }
    }

    public final class e {
        private final rqe a;

        e(t0 t0Var, a aVar) {
            rqe.b p = t0Var.a.p();
            je.l("create_button_name_provided", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("create_playlist", 1, "hit", f);
        }
    }

    public t0(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-create-playlist");
        e2.m("2.0.1");
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
}
