package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class n3 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(n3 n3Var, a aVar) {
            rqe.b p = n3Var.a.p();
            je.l("back", p);
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

        c(n3 n3Var, a aVar) {
            rqe.b p = n3Var.a.p();
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

    public final class d {
        private final rqe a;

        d(n3 n3Var, a aVar) {
            rqe.b p = n3Var.a.p();
            je.l("rename_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("rename_playlist", 1, "hit", "playlist_to_be_renamed", str));
            return (nqe) bVar.c();
        }
    }

    public n3(String str, String str2) {
        this.a = je.Y("music", "mobile-rename-playlist", "1.0.1", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d() {
        return new d(this, null);
    }
}
