package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.rqe;

public final class l {
    private final rqe a = je.X("music", "mobile-album-page", "9.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.l$b$a$a  reason: collision with other inner class name */
            public final class C0472a {
                private final rqe a;

                C0472a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("context_menu_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.l$b$a$b  reason: collision with other inner class name */
            public final class C0473b {
                private final rqe a;

                C0473b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("follow_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "follow", 1, "hit"), "item_to_be_followed", str, f);
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "unfollow", 1, "hit"), "item_to_be_unfollowed", str, f);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("top_bar", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0472a b() {
                return new C0472a(this, null);
            }

            public C0473b c() {
                return new C0473b(this, null);
            }
        }

        b(l lVar, a aVar) {
            rqe.b p = lVar.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(l lVar, a aVar) {
            rqe.b p = lVar.a.p();
            je.l("offline_switch", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "download", 1, "hit"), "item_to_download", str, f);
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "remove_download", 1, "hit"), "item_to_remove_from_downloads", str, f);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("track_row", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        d(l lVar, a aVar) {
            rqe.b p = lVar.a.p();
            je.l("track_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
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
}
