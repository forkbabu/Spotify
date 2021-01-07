package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class g {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.g$b$a$a  reason: collision with other inner class name */
            public final class C0444a {
                private final rqe a;

                C0444a(a aVar, String str, String str2, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.w("ad_cover_art", str, str2, p);
                    p.f(Boolean.TRUE);
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

            /* renamed from: com.spotify.ubi.specification.factories.g$b$a$b  reason: collision with other inner class name */
            public final class C0445b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.g$b$a$b$a  reason: collision with other inner class name */
                public final class C0446a {
                    private final rqe a;

                    C0446a(C0445b bVar, String str, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.q("advertiser_name", str, p);
                        p.f(Boolean.TRUE);
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

                /* renamed from: com.spotify.ubi.specification.factories.g$b$a$b$b  reason: collision with other inner class name */
                public final class C0447b {
                    private final rqe a;

                    C0447b(C0445b bVar, String str, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.q("click_action_button", str, p);
                        p.f(Boolean.TRUE);
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

                C0445b(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.q("ad_details_container", str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0446a b(String str) {
                    return new C0446a(this, str, null);
                }

                public C0447b c(String str) {
                    return new C0447b(this, str, null);
                }
            }

            public final class c {
                private final rqe a;

                c(a aVar, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.q("external_link_button", str, p);
                    p.f(Boolean.TRUE);
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

            a(b bVar, Integer num, a aVar) {
                rqe.b p = bVar.a.p();
                je.m("bookmarked_ad_row", num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0444a b(String str, String str2) {
                return new C0444a(this, str, str2, null);
            }

            public C0445b c(String str) {
                return new C0445b(this, str, null);
            }

            public c d(String str) {
                return new c(this, str, null);
            }
        }

        b(g gVar, a aVar) {
            rqe.b p = gVar.a.p();
            je.l("bookmarked_ads_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num) {
            return new a(this, num, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("back_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_navigate_back", 1, "hit", f);
            }
        }

        c(g gVar, a aVar) {
            rqe.b p = gVar.a.p();
            je.l("top_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public g(String str, String str2) {
        this.a = je.Y("music", "mobile-ads-bookmark-hub-android", "1.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }
}
