package com.spotify.ubi.specification.factories;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.nqe;
import defpackage.rqe;

public final class q3 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q3$b$a$a  reason: collision with other inner class name */
            public final class C0512a {
                private final rqe a;

                C0512a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("retry_button", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public rqe a() {
                    return this.a;
                }
            }

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r(AppProtocol.LogMessage.SEVERITY_ERROR, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0512a b() {
                return new C0512a(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.q3$b$b  reason: collision with other inner class name */
        public final class C0513b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.q3$b$b$a */
            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.q3$b$b$a$a  reason: collision with other inner class name */
                public final class C0514a {
                    private final rqe a;

                    C0514a(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("clear_recents", p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public rqe a() {
                        return this.a;
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.q3$b$b$a$b  reason: collision with other inner class name */
                public final class C0515b {
                    private final rqe a;

                    C0515b(Integer num, String str, a aVar) {
                        rqe.b p = a.this.a.p();
                        je.o("recent_item", num, str, p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public rqe a() {
                        return this.a;
                    }

                    public nqe b() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.f(q3.this.b);
                        return (nqe) je.S("remove_recent_searches_item", 1, "hit", bVar);
                    }
                }

                a(a aVar) {
                    rqe.b p = C0513b.this.a.p();
                    je.l("recents", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public C0514a b() {
                    return new C0514a(this, null);
                }

                public C0515b c(Integer num, String str) {
                    return new C0515b(num, str, null);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q3$b$b$b  reason: collision with other inner class name */
            public final class C0516b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.q3$b$b$b$a */
                public final class a {
                    private final rqe a;

                    a(C0516b bVar, Integer num, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.m("trending_item", num, p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public rqe a() {
                        return this.a;
                    }
                }

                C0516b(C0513b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("trending", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public a b(Integer num) {
                    return new a(this, num, null);
                }
            }

            C0513b(a aVar) {
                rqe.b p = b.this.a.p();
                je.l("initial_view", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(null);
            }

            public C0516b c() {
                return new C0516b(this, null);
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(c cVar, Integer num, String str, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.o("result_item", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public rqe a() {
                    return this.a;
                }
            }

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("offline_results", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(d dVar, Integer num, String str, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.o("see_all_item", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public rqe a() {
                    return this.a;
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.q3$b$d$b  reason: collision with other inner class name */
            public final class C0517b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.q3$b$d$b$a */
                public final class a {
                    private final rqe a;

                    /* renamed from: com.spotify.ubi.specification.factories.q3$b$d$b$a$a  reason: collision with other inner class name */
                    public final class C0518a {
                        private final rqe a;

                        C0518a(a aVar, Integer num, String str, a aVar2) {
                            rqe.b p = aVar.a.p();
                            je.o("recommendation_item", num, str, p);
                            p.f(Boolean.TRUE);
                            this.a = p.d();
                        }

                        public rqe a() {
                            return this.a;
                        }
                    }

                    a(C0517b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("recommendation_results", p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public C0518a b(Integer num, String str) {
                        return new C0518a(this, num, str, null);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.q3$b$d$b$b  reason: collision with other inner class name */
                public final class C0519b {
                    private final rqe a;

                    C0519b(C0517b bVar, Integer num, String str, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.o("result_item", num, str, p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public rqe a() {
                        return this.a;
                    }
                }

                C0517b(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("top_results", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public a b() {
                    return new a(this, null);
                }

                public C0519b c(Integer num, String str) {
                    return new C0519b(this, num, str, null);
                }
            }

            d(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("online_results", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }

            public C0517b c() {
                return new C0517b(this, null);
            }
        }

        b(a aVar) {
            rqe.b p = q3.this.a.p();
            je.l("content", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0513b c() {
            return new C0513b(null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e(String str) {
            return new d(this, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(a aVar) {
                rqe.b p = c.this.a.p();
                je.l("cancel_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(q3.this.b);
                return (nqe) je.S("ui_hide", 1, "hit", bVar);
            }
        }

        public final class b {
            private final rqe a;

            b(a aVar) {
                rqe.b p = c.this.a.p();
                je.l("input_field", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(q3.this.b);
                nqe.b bVar2 = bVar;
                bVar2.h(je.W("change_search_query", 1, "key_stroke", "search_query_string", str));
                return (nqe) bVar2.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(q3.this.b);
                return (nqe) je.S("text_clear", 1, "key_stroke", bVar);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.q3$c$c  reason: collision with other inner class name */
        public final class C0520c {
            private final rqe a;

            C0520c(a aVar) {
                rqe.b p = c.this.a.p();
                je.l("scannables_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(q3.this.b);
                return (nqe) je.S("ui_reveal", 1, "hit", bVar);
            }
        }

        c(a aVar) {
            rqe.b p = q3.this.a.p();
            je.l("search_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(null);
        }

        public b c() {
            return new b(null);
        }

        public C0520c d() {
            return new C0520c(null);
        }
    }

    public final class d {
        private final rqe a;

        d(String str, a aVar) {
            rqe.b p = q3.this.a.p();
            je.s("voice_button", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(q3.this.b);
            return (nqe) je.S("ui_reveal", 1, "hit", bVar);
        }
    }

    public q3() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-search");
        e.m("5.0.0");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(null);
    }

    public c d() {
        return new c(null);
    }

    public d e(String str) {
        return new d(str, null);
    }
}
