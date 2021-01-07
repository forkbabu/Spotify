package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class t4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(t4 t4Var, Integer num, String str, a aVar) {
            rqe.b p = t4Var.a.p();
            je.o("shows_row", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public t4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-your-library-shows");
        e.m("0.2.0");
        e.j(str);
        this.a = e.d();
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }
}
