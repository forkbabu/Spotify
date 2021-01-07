package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class q4 {
    private final rqe a = je.X("music", "mobile-your-library", "0.1.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q4$b$a$a  reason: collision with other inner class name */
            public final class C0521a {
                private final rqe a;

                C0521a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("action_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q4$b$a$b  reason: collision with other inner class name */
            public final class C0522b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.q4$b$a$b$a  reason: collision with other inner class name */
                public final class C0523a {
                    private final rqe a;

                    C0523a(C0522b bVar, Integer num, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.m("item", num, p);
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

                C0522b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("item_list", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0523a b(Integer num) {
                    return new C0523a(this, num, null);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("group_tab", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0521a b() {
                return new C0521a(this, null);
            }

            public C0522b c() {
                return new C0522b(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.q4$b$b  reason: collision with other inner class name */
        public final class C0524b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q4$b$b$a */
            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.q4$b$b$a$a  reason: collision with other inner class name */
                public final class C0525a {
                    private final rqe a;

                    C0525a(a aVar, Integer num, String str, a aVar2) {
                        rqe.b p = aVar.a.p();
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
                }

                a(C0524b bVar, Integer num, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.m("item_list", num, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0525a b(Integer num, String str) {
                    return new C0525a(this, num, str, null);
                }
            }

            C0524b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("page_tab", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b(Integer num) {
                return new a(this, num, null);
            }
        }

        b(q4 q4Var, a aVar) {
            rqe.b p = q4Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0524b c() {
            return new C0524b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("page_item", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        c(q4 q4Var, a aVar) {
            rqe.b p = q4Var.a.p();
            je.l("page_container", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "swipe", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
