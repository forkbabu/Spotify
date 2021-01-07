package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class q {
    private final rqe a = je.X("music", "mobile-app-shortcut-android", "1.0.0");

    public final class b {
        private final rqe a;

        b(q qVar, a aVar) {
            rqe.b p = qVar.a.p();
            je.l("add_app_shortcut", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("add_app_shortcut", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public b b() {
        return new b(this, null);
    }
}
