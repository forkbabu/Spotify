package com.spotify.ubi.specification.factories;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.nqe;
import defpackage.rqe;

public final class v {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.v$b$a$a  reason: collision with other inner class name */
            public final class C0559a {
                private final rqe a;

                C0559a(a aVar, a aVar2) {
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

            public C0559a b() {
                return new C0559a(this, null);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.v$b$b  reason: collision with other inner class name */
        public final class C0560b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.v$b$b$a */
            public final class a {
                private final rqe a;

                a(C0560b bVar, Integer num, String str, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.o("see_all_item", num, str, p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public rqe a() {
                    return this.a;
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.v$b$b$b  reason: collision with other inner class name */
            public final class C0561b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.v$b$b$b$a */
                public final class a {
                    private final rqe a;

                    a(C0561b bVar, Integer num, String str, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.o("result_item", num, str, p);
                        p.f(Boolean.TRUE);
                        this.a = p.d();
                    }

                    public rqe a() {
                        return this.a;
                    }
                }

                C0561b(C0560b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("top_results", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public a b(Integer num, String str) {
                    return new a(this, num, str, null);
                }
            }

            C0560b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.r("online_results", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(Integer num, String str) {
                return new a(this, num, str, null);
            }

            public C0561b c() {
                return new C0561b(this, null);
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(c cVar, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.l("clear_recents", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public rqe a() {
                    return this.a;
                }
            }

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("recents", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }
        }

        b(v vVar, a aVar) {
            rqe.b p = vVar.a.p();
            je.l("content", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public C0560b c(String str) {
            return new C0560b(this, str, null);
        }

        public c d() {
            return new c(this, null);
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
                bVar.f(v.this.b);
                return (nqe) je.S("text_clear", 1, "hit", bVar);
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
                bVar.f(v.this.b);
                nqe.b bVar2 = bVar;
                bVar2.h(je.W("change_search_query", 1, "key_stroke", "search_query_string", str));
                return (nqe) bVar2.c();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(v.this.b);
                return (nqe) je.S("text_clear", 1, "key_stroke", bVar);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.v$c$c  reason: collision with other inner class name */
        public final class C0562c {
            private final rqe a;

            C0562c(a aVar) {
                rqe.b p = c.this.a.p();
                je.l("scannables_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.f(v.this.b);
                return (nqe) je.S("ui_reveal", 1, "hit", bVar);
            }
        }

        c(a aVar) {
            rqe.b p = v.this.a.p();
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

        public C0562c d() {
            return new C0562c(null);
        }
    }

    public final class d {
        private final rqe a;

        d(String str, a aVar) {
            rqe.b p = v.this.a.p();
            je.s("voice_button", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(v.this.b);
            return (nqe) je.S("ui_reveal", 1, "hit", bVar);
        }
    }

    public v() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-assisted-curation-search");
        e.m("4.0.0");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c() {
        return new b(this, null);
    }

    public c d() {
        return new c(null);
    }

    public d e(String str) {
        return new d(str, null);
    }
}
