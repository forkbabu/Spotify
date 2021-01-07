package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class i0 {
    private final rqe a = je.X("music", "mobile-concerts-entity", "0.0.5");

    public final class b {
        private final rqe a;

        b(i0 i0Var, a aVar) {
            rqe.b p = i0Var.a.p();
            je.l("find_tickets_button", p);
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

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("concert", p);
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

        c(i0 i0Var, a aVar) {
            rqe.b p = i0Var.a.p();
            je.l("related_concerts_list", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class d {
        private final rqe a;

        d(i0 i0Var, a aVar) {
            rqe.b p = i0Var.a.p();
            je.l("see_more_concerts_button", p);
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

    public final class e {
        private final rqe a;

        e(i0 i0Var, a aVar) {
            rqe.b p = i0Var.a.p();
            je.l("share_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
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

    public e e() {
        return new e(this, null);
    }
}
