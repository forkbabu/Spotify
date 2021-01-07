package com.spotify.ubi.specification.factories;

import com.spotify.encore.foundation.BuildConfig;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class o {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(o oVar, String str, Integer num, String str2, a aVar) {
            rqe.b p = oVar.a.p();
            je.u("home_item", str, num, str2, p);
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

    public final class c {
        private final rqe a;

        c(o oVar, String str, a aVar) {
            rqe.b p = oVar.a.p();
            je.q("home_page", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public o(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-android-auto-home");
        e.m(BuildConfig.LIBRARY_VERSION);
        e.g(str);
        this.a = e.d();
    }

    public b b(String str, Integer num, String str2) {
        return new b(this, str, num, str2, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }
}
