package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class k3 {
    private final rqe a = je.X("music", "mobile-push-messaging", "2.0.0");

    public final class b {
        private final rqe a;

        b(k3 k3Var, String str, a aVar) {
            rqe.b p = k3Var.a.p();
            je.q("push_notification", str, p);
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

    public b b(String str) {
        return new b(this, str, null);
    }
}
