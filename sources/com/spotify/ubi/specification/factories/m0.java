package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class m0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(m0 m0Var, a aVar) {
            rqe.b p = m0Var.a.p();
            je.l("connect_button_available", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class c {
        private final rqe a;

        c(m0 m0Var, a aVar) {
            rqe.b p = m0Var.a.p();
            je.l("connect_button_connected", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class d {
        private final rqe a;

        d(m0 m0Var, a aVar) {
            rqe.b p = m0Var.a.p();
            je.l("connect_button_connecting", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class e {
        private final rqe a;

        e(m0 m0Var, a aVar) {
            rqe.b p = m0Var.a.p();
            je.l("connect_button_unavailable", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public m0(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-connect-devices-available");
        e2.m("3.0.1");
        e2.j(str);
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
