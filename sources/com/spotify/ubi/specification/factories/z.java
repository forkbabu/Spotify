package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class z {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(z zVar, a aVar) {
            rqe.b p = zVar.a.p();
            je.l("face_pile_image", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        c(z zVar, a aVar) {
            rqe.b p = zVar.a.p();
            je.l("invite_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public z(String str, String str2) {
        this.a = je.Y("music", "mobile-blend-invitation", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
