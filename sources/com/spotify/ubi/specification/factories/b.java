package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class b {
    private final rqe a = je.X("music", "login-welcome-view", "0.0.5");

    /* renamed from: com.spotify.ubi.specification.factories.b$b  reason: collision with other inner class name */
    public final class C0398b {
        private final rqe a;

        C0398b(b bVar, a aVar) {
            rqe.b p = bVar.a.p();
            je.l("login_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public C0398b b() {
        return new C0398b(this, null);
    }
}
