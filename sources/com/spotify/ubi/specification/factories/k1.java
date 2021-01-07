package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class k1 {
    private final rqe a = je.X("music", "mobile-home-mix-user-management", "0.1.1");

    public final class b {
        private final rqe a;

        b(k1 k1Var, String str, a aVar) {
            rqe.b p = k1Var.a.p();
            je.s("mix_member_item", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("tune_enabled", 1, "hit", f);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
