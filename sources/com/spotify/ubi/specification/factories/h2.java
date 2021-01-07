package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class h2 {
    private final rqe a = je.X("music", "mobile-page-loader-toast", "1.0.0");

    public final class b {
        private final rqe a;

        b(h2 h2Var, a aVar) {
            rqe.b p = h2Var.a.p();
            je.l("toast_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("open_os_settings", 1, "hit", f);
        }

        public nqe b() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("retry", 1, "hit", f);
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
