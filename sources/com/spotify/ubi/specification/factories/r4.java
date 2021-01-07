package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class r4 {
    private final rqe a = je.X("music", "mobile-your-library-liked-songs", "2.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("discover_button", p);
                p.f(Boolean.FALSE);
                p.d();
            }
        }

        b(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
            je.l("empty_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.r4$c$a$a  reason: collision with other inner class name */
            public final class C0532a {
                private final rqe a;

                C0532a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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

            /* renamed from: com.spotify.ubi.specification.factories.r4$c$a$c  reason: collision with other inner class name */
            public final class C0533c {
                private final rqe a;

                C0533c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("text_filter_clear_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("text_clear", 1, "hit", f);
                }
            }

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("filter_and_sort", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0532a b() {
                return new C0532a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public C0533c d() {
                return new C0533c(this, null);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.r("play_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "shuffle_play", 1, "hit"), "context_to_be_played", str, f);
            }
        }

        c(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$a$a  reason: collision with other inner class name */
            public final class C0534a {
                C0534a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("cancel", p);
                    p.f(Boolean.FALSE);
                    p.d();
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("confirm_remove_downloads", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "remove_download", 1, "hit"), "item_to_remove_from_downloads", str, f);
                }
            }

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("download_toggle", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0534a b() {
                return new C0534a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public nqe d(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "download", 1, "hit"), "item_to_download", str, f);
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("clear_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("clear_filter", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$b$b  reason: collision with other inner class name */
            public final class C0535b {
                private final rqe a;

                C0535b(b bVar, String str, Integer num, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.t("filter_chip", str, num, p);
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

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("filter_chips", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0535b c(String str, Integer num) {
                return new C0535b(this, str, num, null);
            }

            public mqe d() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                a(c cVar, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    p.d();
                }
            }

            c(d dVar, Integer num, String str, String str2, a aVar) {
                rqe.b p = dVar.a.p();
                sqe.b c = sqe.c();
                c.c("item");
                c.d(num);
                c.f(str);
                c.e(str2);
                p.n(c.a());
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public nqe c(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }

            public nqe d() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "long_hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.r4$d$d  reason: collision with other inner class name */
        public final class C0536d {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$d$a */
            public final class a {
                private final rqe a;

                a(C0536d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("album_cover", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                    return (nqe) bVar.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$d$b */
            public final class b {
                b(C0536d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    p.d();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$d$c */
            public final class c {
                private final rqe a;

                c(C0536d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("heart_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("remove_like", 1, "hit", "item_no_longer_liked", str));
                    return (nqe) bVar.c();
                }
            }

            C0536d(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("preview_item", num, str, p);
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

            public nqe e(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        public final class e {
            private final rqe a;

            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.r4$d$e$a$a  reason: collision with other inner class name */
                public final class C0537a {
                    private final rqe a;

                    C0537a(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("ok_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_hide", 1, "hit", f);
                    }
                }

                a(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("why_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe b() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }

                public C0537a c() {
                    return new C0537a(this, null);
                }
            }

            e(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("recommendation_header", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }
        }

        public final class f {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
                    je.l("album_cover", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                    return (nqe) bVar.c();
                }
            }

            public final class b {
                b(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    p.d();
                }
            }

            public final class c {
                private final rqe a;

                c(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
                    je.l("heart_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
                    return (nqe) bVar.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.r4$d$f$d  reason: collision with other inner class name */
            public final class C0538d {
                private final rqe a;

                C0538d(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
                    je.l("hide_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("dislike", 1, "hit", "item_to_be_disliked", str));
                    return (nqe) bVar.c();
                }
            }

            f(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("recommended_preview_item", num, str, p);
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

            public C0538d e() {
                return new C0538d(this, null);
            }

            public nqe f(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        d(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d(Integer num, String str, String str2) {
            return new c(this, num, str, str2, null);
        }

        public C0536d e(Integer num, String str) {
            return new C0536d(this, num, str, null);
        }

        public e f() {
            return new e(this, null);
        }

        public f g(Integer num, String str) {
            return new f(this, num, str, null);
        }
    }

    public final class e {
        private final rqe a;

        e(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
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

    public final class f {
        private final rqe a;

        public final class a {
            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("cancel_button", p);
                p.f(Boolean.FALSE);
                p.d();
            }
        }

        public final class b {
            private final rqe a;

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("dismiss", p);
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

            c(f fVar, String str, a aVar) {
                rqe.b p = fVar.a.p();
                je.q("sort_option", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        f(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
            je.l("sort_filter_sheet", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d(String str) {
            return new c(this, str, null);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("back_button", p);
                p.f(Boolean.FALSE);
                p.d();
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("find_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.r4$g$b$b  reason: collision with other inner class name */
            public final class C0539b {
                private final rqe a;

                C0539b(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("sort_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            b(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("context_menu_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0539b c() {
                return new C0539b(this, null);
            }
        }

        g(r4 r4Var, a aVar) {
            rqe.b p = r4Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }
    }

    public b b() {
        return new b(this, null);
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
}
