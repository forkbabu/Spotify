package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class l3 {
    private final rqe a = je.X("music", "mobile-push-quick-actions", "3.0.0");

    public final class b {
        private final rqe a;

        b(l3 l3Var, String str, a aVar) {
            rqe.b p = l3Var.a.p();
            je.q("push_message_quick_action", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
            return (nqe) bVar.c();
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
