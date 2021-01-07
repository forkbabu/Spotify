package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class h {
    private final rqe a = je.X("music", "mobile-ads-bookmark-reminder-android", "1.0.0");

    public final class b {
        private final rqe a;

        b(h hVar, a aVar) {
            rqe.b p = hVar.a.p();
            je.l("close_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        c(h hVar, a aVar) {
            rqe.b p = hVar.a.p();
            je.l("view_hub_button", p);
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

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
