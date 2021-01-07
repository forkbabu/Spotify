package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class s4 {
    private final rqe a = je.X("music", "mobile-your-library-playlists", "4.0.0");

    public final class b {
        private final rqe a;

        b(s4 s4Var, String str, a aVar) {
            rqe.b p = s4Var.a.p();
            je.q("active_filter", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("clear_filter", 1, "hit", f);
        }
    }

    public final class c {
        private final rqe a;

        c(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("empty_static_filter_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class d {
        private final rqe a;

        d(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("empty_text_filter_view", p);
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

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("create_playlist_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        e(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("empty_view", p);
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
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("filter_or_sort_option_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("text_filter", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "key_stroke", f);
            }
        }

        public final class c {
            private final rqe a;

            c(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("text_filter_cancel_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        f(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("filter_and_sort", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, Integer num, a aVar) {
                rqe.b p = gVar.a.p();
                je.m("create_playlist", num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(g gVar, String str, a aVar) {
                rqe.b p = gVar.a.p();
                je.s("hidden_content", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        public final class c {
            private final rqe a;

            c(g gVar, Integer num, String str, a aVar) {
                rqe.b p = gVar.a.p();
                je.o("item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "long_hit", f);
            }
        }

        public final class d {
            private final rqe a;

            d(g gVar, Integer num, String str, a aVar) {
                rqe.b p = gVar.a.p();
                je.o("liked_songs", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        public final class e {
            private final rqe a;

            e(g gVar, Integer num, String str, a aVar) {
                rqe.b p = gVar.a.p();
                je.o("your_episodes", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        g(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num) {
            return new a(this, num, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }

        public c d(Integer num, String str) {
            return new c(this, num, str, null);
        }

        public d e(Integer num, String str) {
            return new d(this, num, str, null);
        }

        public e f(Integer num, String str) {
            return new e(this, num, str, null);
        }
    }

    public final class h {
        private final rqe a;

        h(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("quick_scroll", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("quick_scroll", 1, "drag", f);
        }

        public nqe b() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("no_action", 1, "hit", f);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class i {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
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

        public final class b {
            private final rqe a;

            b(i iVar, String str, a aVar) {
                rqe.b p = iVar.a.p();
                je.q("filter_option", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("clear_filter", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        public final class c {
            private final rqe a;

            c(i iVar, String str, a aVar) {
                rqe.b p = iVar.a.p();
                je.q("sort_option", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("sort", 1, "hit", f);
            }
        }

        i(s4 s4Var, a aVar) {
            rqe.b p = s4Var.a.p();
            je.l("sort_filter_sheet", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }

        public c d(String str) {
            return new c(this, str, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
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

    public f f() {
        return new f(this, null);
    }

    public g g() {
        return new g(this, null);
    }

    public h h() {
        return new h(this, null);
    }

    public i i() {
        return new i(this, null);
    }
}
