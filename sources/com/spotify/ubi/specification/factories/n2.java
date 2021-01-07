package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class n2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.n2$b$b  reason: collision with other inner class name */
        public final class C0489b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.n2$b$b$a */
            public final class a {
                private final rqe a;

                a(C0489b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("make_private", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.n2$b$b$b  reason: collision with other inner class name */
            public final class C0490b {
                private final rqe a;

                C0490b(C0489b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("make_public", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.n2$b$b$c */
            public final class c {
                private final rqe a;

                c(C0489b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("make_unlisted", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            C0489b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("options", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0490b c() {
                return new C0490b(this, null);
            }

            public c d() {
                return new c(this, null);
            }
        }

        b(n2 n2Var, a aVar) {
            rqe.b p = n2Var.a.p();
            je.l("permissions_bottom_sheet", p);
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

        public C0489b d() {
            return new C0489b(this, null);
        }
    }

    public n2(String str, String str2) {
        this.a = je.Y("music", "mobile-playlist-permissions", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }
}
