package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class n0 {
    private final rqe a = je.X("music", "mobile-connect-nudge", "1.0.1");

    public final class b {
        private final rqe a;

        b(n0 n0Var, a aVar) {
            rqe.b p = n0Var.a.p();
            je.l("connect_destination_action_nudge_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public nqe c() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "swipe", f);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
