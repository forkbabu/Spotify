package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.rqe;

public final class o2 {
    private final rqe a = je.X("music", "mobile-playlist-story-header-view", "4.1.0");

    public final class b {
        private final rqe a;

        b(o2 o2Var, String str, a aVar) {
            rqe.b p = o2Var.a.p();
            je.s("header_view_story", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
