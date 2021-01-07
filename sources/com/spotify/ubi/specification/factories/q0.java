package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class q0 {
    private final rqe a = je.X("music", "mobile-connect-snacks", "1.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("snacks_action", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("connect_to_remote_device", 1, "hit", "remote_device_id", str));
                return (nqe) bVar.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        b(q0 q0Var, a aVar) {
            rqe.b p = q0Var.a.p();
            je.l("columns", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c() {
            return new a(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
