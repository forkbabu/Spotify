package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class r0 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(r0 r0Var, a aVar) {
            rqe.b p = r0Var.a.p();
            je.l("remote_volume_overlay", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        c(r0 r0Var, a aVar) {
            rqe.b p = r0Var.a.p();
            je.l("system_volume_slider", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(Integer num) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.U("set_volume", 1, "drag", "new_volume_percentage", num));
            return (nqe) bVar.c();
        }
    }

    public final class d {
        private final rqe a;

        d(r0 r0Var, a aVar) {
            rqe.b p = r0Var.a.p();
            je.l("volume_slider", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(Integer num) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.U("set_volume", 1, "drag", "new_volume_percentage", num));
            return (nqe) bVar.c();
        }
    }

    public r0(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-connect-volume-control");
        e.m("4.0.1");
        e.g(str);
        this.a = e.d();
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
