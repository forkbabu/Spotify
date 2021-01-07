package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class t1 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        b(String str, Integer num, a aVar) {
            rqe.b p = t1.this.a.p();
            je.t("channel", str, num, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(t1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar2.c();
        }
    }

    public t1(String str, String str2) {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-notification-settings-channels");
        e.m("1.0.1");
        e.e("7.0.8");
        e.g(str);
        e.j(str2);
        this.a = e.d();
        this.b = pqe;
    }

    public b c(String str, Integer num) {
        return new b(str, num, null);
    }
}
