package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class i {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(i iVar, String str, a aVar) {
            rqe.b p = iVar.a.p();
            je.s("close_button", str, p);
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

        c(i iVar, String str, String str2, a aVar) {
            rqe.b p = iVar.a.p();
            sqe.b c = sqe.c();
            c.c("web_view");
            c.f(str);
            c.e(str2);
            p.n(c.a());
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public i(String str, String str2) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-ads-cmp-android");
        e.m("1.0.0");
        e.j(str);
        e.i(str2);
        this.a = e.d();
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public nqe c(String str) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.W("navigate_to_webview_uri", 1, "hit", "destination", str));
        return (nqe) bVar.c();
    }

    public c d(String str, String str2) {
        return new c(this, str, str2, null);
    }
}
