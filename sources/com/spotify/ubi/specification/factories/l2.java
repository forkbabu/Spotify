package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class l2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("header", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.l2$b$b  reason: collision with other inner class name */
        public final class C0483b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.l2$b$b$a */
            public final class a {
                private final rqe a;

                a(C0483b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("add_songs_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str, String str2) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    qqe.b b = qqe.b();
                    b.c("add_to_playlist");
                    b.e(1);
                    b.b("hit");
                    b.d("playlist", str);
                    return (nqe) je.R(b, "item_to_be_added", str2, f);
                }
            }

            C0483b(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.s("item", str, p);
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
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("refresh_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("refresh_content", 1, "hit", f);
            }
        }

        b(l2 l2Var, a aVar) {
            rqe.b p = l2Var.a.p();
            je.l("extender_item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0483b c(String str) {
            return new C0483b(this, str, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public l2(String str, String str2) {
        this.a = je.Y("music", "mobile-playlist-extender", "1.0.1", str, str2);
    }

    public b b() {
        return new b(this, null);
    }
}
