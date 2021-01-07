package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class a1 {
    private final rqe a = je.X("music", "mobile-find", "1.0.0");

    public final class b {
        private final rqe a;

        b(a1 a1Var, a aVar) {
            rqe.b p = a1Var.a.p();
            je.l("search_bar", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public rqe a() {
            return this.a;
        }
    }

    public final class c {
        private final rqe a;

        c(a1 a1Var, a aVar) {
            rqe.b p = a1Var.a.p();
            je.l("voice_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
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
