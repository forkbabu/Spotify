package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class h0 {
    private final rqe a = je.X("music", "mobile-concerts-artist-concerts", "0.0.10");

    public final class b {
        private final rqe a;

        b(h0 h0Var, a aVar) {
            rqe.b p = h0Var.a.p();
            je.l("change_location", p);
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

            a(c cVar, Integer num, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.o("concert_nearby", num, str, p);
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

        c(h0 h0Var, a aVar) {
            rqe.b p = h0Var.a.p();
            je.l("nearyou_listing", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("concert_in_other_venues", num, str, p);
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

        d(h0 h0Var, a aVar) {
            rqe.b p = h0Var.a.p();
            je.l("othervenues_listing", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
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
}
