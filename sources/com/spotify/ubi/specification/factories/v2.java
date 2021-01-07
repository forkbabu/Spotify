package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class v2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(v2 v2Var, String str, String str2, a aVar) {
            rqe.b p = v2Var.a.p();
            je.w("fully_visible_card", str, str2, p);
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

        public final class a {
            private final rqe a;

            a(c cVar, String str, Integer num, a aVar) {
                rqe.b p = cVar.a.p();
                je.t("option_button", str, num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("vote_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str, Integer num) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                qqe.b b = qqe.b();
                b.c("poll_vote");
                b.e(1);
                b.b("hit");
                b.d("poll_id", str);
                b.d("ms_played", num);
                bVar.h(b.a());
                return (nqe) bVar.c();
            }
        }

        c(v2 v2Var, String str, String str2, a aVar) {
            rqe.b p = v2Var.a.p();
            je.w("multi_select_poll_card", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str, Integer num) {
            return new a(this, str, num, null);
        }

        public b d() {
            return new b(this, null);
        }
    }

    public final class d {
        private final rqe a;

        d(v2 v2Var, String str, String str2, a aVar) {
            rqe.b p = v2Var.a.p();
            je.w("multi_select_poll_results_card", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, String str, Integer num, a aVar) {
                rqe.b p = eVar.a.p();
                je.t("option_button", str, num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str, Integer num) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                qqe.b b = qqe.b();
                b.c("poll_vote");
                b.e(1);
                b.b("hit");
                b.d("poll_id", str);
                b.d("ms_played", num);
                bVar.h(b.a());
                return (nqe) bVar.c();
            }
        }

        e(v2 v2Var, String str, String str2, a aVar) {
            rqe.b p = v2Var.a.p();
            je.w("single_select_poll_card", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(String str, Integer num) {
            return new a(this, str, num, null);
        }
    }

    public final class f {
        private final rqe a;

        f(v2 v2Var, String str, String str2, a aVar) {
            rqe.b p = v2Var.a.p();
            je.w("single_select_poll_results_card", str, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public v2(String str, String str2) {
        this.a = je.Y("music", "mobile-podcast-polls", "6.0.0", str, str2);
    }

    public b b(String str, String str2) {
        return new b(this, str, str2, null);
    }

    public c c(String str, String str2) {
        return new c(this, str, str2, null);
    }

    public d d(String str, String str2) {
        return new d(this, str, str2, null);
    }

    public e e(String str, String str2) {
        return new e(this, str, str2, null);
    }

    public f f(String str, String str2) {
        return new f(this, str, str2, null);
    }
}
