package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class i3 {
    private final rqe a = je.X("music", "mobile-profile-public-playlists", "1.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("playlist", num, str, p);
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

        b(i3 i3Var, a aVar) {
            rqe.b p = i3Var.a.p();
            je.l("public_playlists", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
