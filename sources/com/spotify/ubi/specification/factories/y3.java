package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class y3 {
    private final rqe a = je.X("music", "mobile-social-listening-tap-to-queue", "1.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("cancel", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.y3$b$b  reason: collision with other inner class name */
        public final class C0574b {
            private final rqe a;

            C0574b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("play_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("queue_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "add_item_to_queue", 1, "hit"), "item_to_add_to_queue", str, f);
            }
        }

        b(y3 y3Var, a aVar) {
            rqe.b p = y3Var.a.p();
            je.l("tap_to_queue_dialog", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0574b c() {
            return new C0574b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
