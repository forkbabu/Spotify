package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class f0 {
    private final rqe a = je.X("music", "mobile-car-mode-opt-in", "1.0.1");

    public final class b {
        private final rqe a;

        b(f0 f0Var, a aVar) {
            rqe.b p = f0Var.a.p();
            je.l("optin_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        c(f0 f0Var, a aVar) {
            rqe.b p = f0Var.a.p();
            je.l("optout_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
