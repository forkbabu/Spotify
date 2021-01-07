package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class o0 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(String str, a aVar) {
                rqe.b p = b.this.a.p();
                je.r("close", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(o0.this.b);
                return (nqe) je.S("ui_hide", 1, "hit", bVar);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.o0$b$b  reason: collision with other inner class name */
        public final class C0493b {
            private final rqe a;

            C0493b(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("later_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(o0.this.b);
                return (nqe) je.S("ui_hide", 1, "hit", bVar);
            }
        }

        public final class c {
            private final rqe a;

            c(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("listen_now_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(o0.this.b);
                nqe.b bVar2 = bVar;
                bVar2.h(je.W("connect_to_remote_device", 1, "hit", "remote_device_id", str));
                return (nqe) bVar2.c();
            }
        }

        b(String str, a aVar) {
            rqe.b p = o0.this.a.p();
            je.q("container_view", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(str, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            mqe.b bVar = e;
            bVar.f(o0.this.b);
            return (mqe) bVar.c();
        }

        public C0493b d() {
            return new C0493b(null);
        }

        public c e() {
            return new c(null);
        }
    }

    public o0(String str) {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-connect-onboarding-popup");
        e.m("4.0.0");
        e.e("7.0.8");
        e.g(str);
        this.a = e.d();
        this.b = pqe;
    }

    public b c(String str) {
        return new b(str, null);
    }
}
