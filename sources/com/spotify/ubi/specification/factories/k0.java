package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class k0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("close", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.k0$b$b  reason: collision with other inner class name */
        public final class C0467b {
            private final rqe a;

            C0467b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("continue_button", p);
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

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("listen_on_this_device_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("disconnect_from_remote_device", 1, "hit", "remote_device_id", str));
                return (nqe) bVar.c();
            }
        }

        b(k0 k0Var, a aVar) {
            rqe.b p = k0Var.a.p();
            je.l("container_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0467b c() {
            return new C0467b(this, null);
        }

        public mqe d() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public c e() {
            return new c(this, null);
        }
    }

    public k0(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-connect-attach-popup");
        e.m("3.0.3");
        e.g(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }
}
