package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class u3 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(u3 u3Var, a aVar) {
            rqe.b p = u3Var.a.p();
            je.l("invalid_sleep_option", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        c(u3 u3Var, a aVar) {
            rqe.b p = u3Var.a.p();
            je.l("remove_sleep_timer", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("remove_sleep_timer", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        d(u3 u3Var, a aVar) {
            rqe.b p = u3Var.a.p();
            je.l("sleep_at_end_of_track", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("set_sleep_timer_end_of_item", 1, "hit", "sleep_item", str));
            return (nqe) bVar.c();
        }
    }

    public final class e {
        private final rqe a;

        e(u3 u3Var, a aVar) {
            rqe.b p = u3Var.a.p();
            je.l("sleep_in_x_minutes", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(Integer num) {
            nqe.b f = nqe.f();
            if (num.intValue() < 0) {
                f.g("Input parameter is negative");
            }
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.U("set_sleep_timer_in_minutes", 1, "hit", "sleep_time_in_minutes", num));
            return (nqe) bVar.c();
        }
    }

    public u3(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-sleep-timer");
        e2.m("4.0.1");
        e2.j(str);
        this.a = e2.d();
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

    public e e() {
        return new e(this, null);
    }
}
