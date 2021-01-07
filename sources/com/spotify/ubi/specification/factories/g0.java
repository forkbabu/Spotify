package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class g0 {
    private final rqe a = je.X("music", "mobile-collection-artist", "3.0.1");

    public final class b {
        private final rqe a;

        b(g0 g0Var, String str, a aVar) {
            rqe.b p = g0Var.a.p();
            je.r("empty_view", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("follow_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
                return (nqe) bVar.c();
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.s("play_button", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("shuffle_play", 1, "hit", "context_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        c(g0 g0Var, a aVar) {
            rqe.b p = g0Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("album_item", num, str, p);
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
                je.s("download_toggle", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("download", 1, "hit", "item_to_download", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("remove_download", 1, "hit", "item_to_remove_from_downloads", str));
                return (nqe) bVar.c();
            }
        }

        public final class c {
            private final rqe a;

            c(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        d(g0 g0Var, a aVar) {
            rqe.b p = g0Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }

        public b c(String str) {
            return new b(this, str, null);
        }

        public c d(Integer num, String str) {
            return new c(this, num, str, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d() {
        return new d(this, null);
    }
}
