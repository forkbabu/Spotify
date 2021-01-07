package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class j1 {
    private final rqe a = je.X("music", "mobile-home-mix-taste-viz", "1.0.1");

    public final class b {
        private final rqe a;

        b(j1 j1Var, String str, a aVar) {
            rqe.b p = j1Var.a.p();
            je.s("listen_now_button", str, p);
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

        c(j1 j1Var, a aVar) {
            rqe.b p = j1Var.a.p();
            je.l("taste_viz_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c() {
        return new c(this, null);
    }
}
