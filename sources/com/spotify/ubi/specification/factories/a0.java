package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class a0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("join_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("create_playlist", 1, "hit", f);
            }
        }

        b(a0 a0Var, a aVar) {
            rqe.b p = a0Var.a.p();
            je.l("card", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public a0(String str, String str2) {
        this.a = je.Y("music", "mobile-blend-taste-match", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }
}
