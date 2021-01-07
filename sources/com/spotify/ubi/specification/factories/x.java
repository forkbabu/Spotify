package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class x {
    private final rqe a = je.X("music", "mobile-audioplus-interface", "1.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, Integer num, a aVar) {
                rqe.b p = bVar.a.p();
                je.m("add_song_button", num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("search", 1, "hit", f);
            }
        }

        b(x xVar, a aVar) {
            rqe.b p = xVar.a.p();
            je.l("add_songs", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num) {
            return new a(this, num, null);
        }
    }

    public final class c {
        private final rqe a;

        c(x xVar, a aVar) {
            rqe.b p = xVar.a.p();
            je.l("header", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
