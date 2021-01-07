package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class e4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(e4 e4Var, a aVar) {
            rqe.b p = e4Var.a.p();
            je.l("add_to_playlist_button", p);
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
    }

    public e4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-track-page-free");
        e.m("1.0.5");
        e.i(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }
}
