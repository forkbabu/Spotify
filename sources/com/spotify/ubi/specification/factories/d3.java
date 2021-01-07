package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class d3 {
    private final rqe a = je.X("music", "mobile-premium-mini", "2.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("cancel_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.d3$b$b  reason: collision with other inner class name */
        public final class C0422b {
            private final rqe a;

            C0422b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("remove_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("no_action", 1, "hit", f);
            }
        }

        b(d3 d3Var, a aVar) {
            rqe.b p = d3Var.a.p();
            je.l("remove_all_songs_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public C0422b d() {
            return new C0422b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(d3 d3Var, a aVar) {
            rqe.b p = d3Var.a.p();
            je.l("song_limit_dialog", p);
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

    public c c() {
        return new c(this, null);
    }
}
