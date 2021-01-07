package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class t2 {
    private final rqe a = je.X("music", "mobile-podcast-episode-notifications-shelf", "1.0.0");

    public final class b {
        private final rqe a;

        b(t2 t2Var, String str, a aVar) {
            rqe.b p = t2Var.a.p();
            je.s("follow_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
            return (nqe) bVar.c();
        }
    }

    public final class c {
        private final rqe a;

        c(t2 t2Var, String str, a aVar) {
            rqe.b p = t2Var.a.p();
            je.s("opt_in_toggle", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("disable_release_notifications", 1, "hit", "release_source_to_not_get_notifications_from", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("enable_release_notifications", 1, "hit", "release_source_to_get_notifications_from", str));
            return (nqe) bVar.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }
}
