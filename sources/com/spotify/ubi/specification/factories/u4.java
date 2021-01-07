package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class u4 {
    private final rqe a = je.X("music", "mobile-your-library-x", "3.0.1");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.u4$b$a$a  reason: collision with other inner class name */
            public final class C0551a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.u4$b$a$a$a  reason: collision with other inner class name */
                public final class C0552a {
                    private final rqe a;

                    /* renamed from: com.spotify.ubi.specification.factories.u4$b$a$a$a$a  reason: collision with other inner class name */
                    public final class C0553a {
                        private final rqe a;

                        C0553a(C0552a aVar, a aVar2) {
                            rqe.b p = aVar.a.p();
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

                    /* renamed from: com.spotify.ubi.specification.factories.u4$b$a$a$a$b  reason: collision with other inner class name */
                    public final class C0554b {
                        private final rqe a;

                        C0554b(C0552a aVar, String str, a aVar2) {
                            rqe.b p = aVar.a.p();
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

                    C0552a(C0551a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("sort_sheet", p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public C0553a b() {
                        return new C0553a(this, null);
                    }

                    public mqe c() {
                        mqe.b e = mqe.e();
                        e.e(this.a);
                        return (mqe) e.c();
                    }

                    public C0554b d(String str) {
                        return new C0554b(this, str, null);
                    }
                }

                C0551a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("sort_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe b() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }

                public C0552a c() {
                    return new C0552a(this, null);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.u4$b$a$b  reason: collision with other inner class name */
            public final class C0555b {
                private final rqe a;

                C0555b(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.q("view_density_toggle", str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("controls", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0551a b() {
                return new C0551a(this, null);
            }

            public C0555b c(String str) {
                return new C0555b(this, str, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.u4$b$b  reason: collision with other inner class name */
        public final class C0556b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.u4$b$b$a */
            public final class a {
                private final rqe a;

                a(C0556b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("grid_item", num, str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.u4$b$b$b  reason: collision with other inner class name */
            public final class C0557b {
                private final rqe a;

                C0557b(C0556b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("list_item", num, str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
                }
            }

            C0556b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("items", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }

            public C0557b c(Integer num, String str) {
                return new C0557b(this, num, str, null);
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.u4$b$c$a$a  reason: collision with other inner class name */
                public final class C0558a {
                    private final rqe a;

                    C0558a(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("clear_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("remove_recent_searches_item", 1, "hit", f);
                    }
                }

                a(c cVar, Integer num, String str, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.o("recent_item", num, str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0558a b() {
                    return new C0558a(this, null);
                }
            }

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("recent_items", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }
        }

        b(u4 u4Var, a aVar) {
            rqe.b p = u4Var.a.p();
            je.l("content", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0556b c() {
            return new C0556b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        public final class b {
            private final rqe a;

            b(c cVar, String str, Integer num, a aVar) {
                rqe.b p = cVar.a.p();
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

        c(u4 u4Var, a aVar) {
            rqe.b p = u4Var.a.p();
            je.l("filters", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c(String str, Integer num) {
            return new b(this, str, num, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("create_button", str, p);
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

        public final class b {
            private final rqe a;

            b(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("profile_button", str, p);
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

            c(d dVar, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.s("search_button", str, p);
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

        d(u4 u4Var, a aVar) {
            rqe.b p = u4Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public nqe c() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("quick_scroll", 1, "hit", f);
        }

        public b d(String str) {
            return new b(this, str, null);
        }

        public c e(String str) {
            return new c(this, str, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("cancel_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_navigate_back", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("text_filter", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "key_stroke", f);
            }
        }

        public final class c {
            private final rqe a;

            c(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

        e(u4 u4Var, a aVar) {
            rqe.b p = u4Var.a.p();
            je.l("search_bar", p);
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
}
