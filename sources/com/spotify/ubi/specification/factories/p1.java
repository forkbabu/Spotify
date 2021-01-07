package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class p1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("continue_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.p1$b$b  reason: collision with other inner class name */
        public final class C0499b {
            private final rqe a;

            C0499b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("stop_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        b(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
            je.l("discard_dialog", p);
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

        public C0499b d() {
            return new C0499b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        c(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
            je.l("everything_imported_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c() {
            return new a(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class b {
            private final rqe a;

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("view_button", p);
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

        d(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
            je.l("import_confirmation_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c() {
            return new a(this, null);
        }

        public b d() {
            return new b(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

        e(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
            je.l("no_files_dialog", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c() {
            return new a(this, null);
        }
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.p1$f$a$a  reason: collision with other inner class name */
            public final class C0500a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.p1$f$a$a$a  reason: collision with other inner class name */
                public final class C0501a {
                    private final rqe a;

                    C0501a(C0500a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("deselect_all_toggle_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.p1$f$a$a$b */
                public final class b {
                    private final rqe a;

                    b(C0500a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("select_all_toggle_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                    }
                }

                C0500a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("bottom_bar", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0501a b() {
                    return new C0501a(this, null);
                }

                public b c() {
                    return new b(this, null);
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, Integer num, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.m("item", num, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            a(f fVar, String str, a aVar) {
                rqe.b p = fVar.a.p();
                je.q("section", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0500a b() {
                return new C0500a(this, null);
            }

            public mqe c() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public b d(Integer num) {
                return new b(this, num, null);
            }
        }

        f(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
            je.l("sections", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public nqe c() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "swipe", f);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
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

        public final class b {
            private final rqe a;

            b(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("import_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        g(p1 p1Var, a aVar) {
            rqe.b p = p1Var.a.p();
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

    public p1(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-local-files-import");
        e2.m("1.0.1");
        e2.g(str);
        this.a = e2.d();
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
