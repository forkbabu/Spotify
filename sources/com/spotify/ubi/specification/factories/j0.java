package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class j0 {
    private final rqe a = je.X("music", "mobile-concerts-hub", "1.0.2");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("change_location_button", str, p);
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

        b(j0 j0Var, String str, a aVar) {
            rqe.b p = j0Var.a.p();
            je.s("header", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, Integer num, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.o("concert", num, str, p);
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

        c(j0 j0Var, String str, a aVar) {
            rqe.b p = j0Var.a.p();
            je.s("recommended", str, p);
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
                je.o("virtual_concert", num, str, p);
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

        d(j0 j0Var, String str, a aVar) {
            rqe.b p = j0Var.a.p();
            je.s("virtual_events_section", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }

    public d d(String str) {
        return new d(this, str, null);
    }
}
