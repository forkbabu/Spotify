package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class k4 {
    private final rqe a = je.X("music", "mobile-voice-utterance-banner", "1.0.0");

    public final class b {
        private final rqe a;

        b(k4 k4Var, a aVar) {
            rqe.b p = k4Var.a.p();
            je.l("close_button", p);
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

        c(k4 k4Var, String str, a aVar) {
            rqe.b p = k4Var.a.p();
            je.r("text_utterance_suggetion", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c(String str) {
        return new c(this, str, null);
    }
}
