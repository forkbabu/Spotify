package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class n {
    private final rqe a = je.X("music", "mobile-allboarding-search", "2.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("empty_state_view", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.n$b$b  reason: collision with other inner class name */
        public final class C0487b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.n$b$b$a */
            public final class a {
                private final rqe a;

                a(C0487b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("artist_item", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.n$b$b$b  reason: collision with other inner class name */
            public final class C0488b {
                private final rqe a;

                C0488b(C0487b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("default_item", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            C0487b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("results", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }

            public C0488b c(Integer num, String str) {
                return new C0488b(this, num, str, null);
            }

            public mqe d() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(n nVar, a aVar) {
            rqe.b p = nVar.a.p();
            je.l("content", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public C0487b d() {
            return new C0487b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("input_field", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("text_clear", 1, "key_stroke", f);
            }
        }

        c(n nVar, a aVar) {
            rqe.b p = nVar.a.p();
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
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
