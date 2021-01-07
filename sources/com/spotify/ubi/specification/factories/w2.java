package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class w2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(w2 w2Var, Integer num, String str, a aVar) {
            rqe.b p = w2Var.a.p();
            je.o("recommendation_row", num, str, p);
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

    public w2(String str, String str2) {
        this.a = je.Y("music", "mobile-podcast-recommendations-component", "2.2.0", str, str2);
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }
}
