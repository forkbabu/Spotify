package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class a {
    private final rqe a = je.X("music", "background-restrictions-checker-dialog", "1.0.5");

    public final class b {
        private final rqe a;

        b(a aVar, C0393a aVar2) {
            rqe.b p = aVar.a.p();
            je.l("dismiss_dialog_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        c(a aVar, C0393a aVar2) {
            rqe.b p = aVar.a.p();
            je.l("go_to_settings_button", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("open_os_settings", 1, "hit", f);
        }

        public mqe b() {
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
