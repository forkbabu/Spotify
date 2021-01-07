package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class m2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(m2 m2Var, a aVar) {
            rqe.b p = m2Var.a.p();
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

        c(m2 m2Var, a aVar) {
            rqe.b p = m2Var.a.p();
            je.l("back_button", p);
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

        d(m2 m2Var, Integer num, String str, a aVar) {
            rqe.b p = m2Var.a.p();
            je.o("participant", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public m2(String str, String str2) {
        this.a = je.Y("music", "mobile-playlist-participants", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d(Integer num, String str) {
        return new d(this, num, str, null);
    }
}
