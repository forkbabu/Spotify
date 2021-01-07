package com.spotify.ubi.specification.factories;

import com.spotify.encore.foundation.BuildConfig;
import defpackage.nqe;
import defpackage.rqe;

public final class p0 {
    private final rqe a = je.X("music", "mobile-connect-settings-page", BuildConfig.LIBRARY_VERSION);

    public final class b {
        private final rqe a;

        b(p0 p0Var, a aVar) {
            rqe.b p = p0Var.a.p();
            je.l("device_lock_screen_toggle", p);
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

        c(p0 p0Var, a aVar) {
            rqe.b p = p0Var.a.p();
            je.l("local_device_toggle", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
