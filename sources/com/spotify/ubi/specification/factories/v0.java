package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class v0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(v0 v0Var, a aVar) {
            rqe.b p = v0Var.a.p();
            je.l("jumpstart_trigger", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
            return (nqe) bVar.c();
        }
    }

    public v0(String str, String str2) {
        this.a = je.Y("music", "mobile-driving-jumpstart", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }
}
