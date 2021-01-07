package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class f4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(f4 f4Var, String str, a aVar) {
            rqe.b p = f4Var.a.p();
            je.r("results_page", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        c(f4 f4Var, Integer num, String str, a aVar) {
            rqe.b p = f4Var.a.p();
            sqe.b c = sqe.c();
            c.c("tile");
            c.d(num);
            c.e(str);
            p.n(c.a());
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

    public f4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-voice-alternative-search");
        e.m("3.0.1");
        e.i(str);
        this.a = e.d();
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public nqe c() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("ui_hide", 1, "swipe", f);
    }

    public c d(Integer num, String str) {
        return new c(this, num, str, null);
    }
}
