package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class j2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(j2 j2Var, a aVar) {
            rqe.b p = j2Var.a.p();
            je.l("add_songs_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
        }
    }

    public final class c {
        private final rqe a;

        c(j2 j2Var, a aVar) {
            rqe.b p = j2Var.a.p();
            je.l("back_button", p);
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

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("add_episode_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        public final class b {
            private final rqe a;

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class c {
            private final rqe a;

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("cover_art", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play_preview", 1, "hit", "item_to_be_previewed", str));
                return (nqe) bVar.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.j2$d$d  reason: collision with other inner class name */
        public final class C0462d {
            private final rqe a;

            C0462d(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("dislike_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("dislike", 1, "hit", "item_to_be_disliked", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("remove_dislike", 1, "hit", "item_no_longer_disliked", str));
                return (nqe) bVar.c();
            }
        }

        public final class e {
            private final rqe a;

            e(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("download_button", p);
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

        public final class f {
            private final rqe a;

            f(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("like_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("remove_like", 1, "hit", "item_no_longer_liked", str));
                return (nqe) bVar.c();
            }
        }

        public final class g {
            private final rqe a;

            g(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("profile_picture", p);
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

        d(j2 j2Var, Integer num, String str, a aVar) {
            rqe.b p = j2Var.a.p();
            je.o("episode_or_track", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d() {
            return new c(this, null);
        }

        public C0462d e() {
            return new C0462d(this, null);
        }

        public e f() {
            return new e(this, null);
        }

        public nqe g(String str) {
            nqe.b f2 = nqe.f();
            f2.e(this.a);
            nqe.b bVar = f2;
            bVar.h(je.W("play_preview", 1, "hit", "item_to_be_previewed", str));
            return (nqe) bVar.c();
        }

        public f h() {
            return new f(this, null);
        }

        public g i() {
            return new g(this, null);
        }
    }

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
                je.l("close_button", p);
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

        e(j2 j2Var, a aVar) {
            rqe.b p = j2Var.a.p();
            je.l("toolbar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class f {
        private final rqe a;

        f(j2 j2Var, a aVar) {
            rqe.b p = j2Var.a.p();
            je.l("transition_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public j2(String str, String str2) {
        this.a = je.Y("music", "mobile-playlist-all-songs", "4.0.0", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d(Integer num, String str) {
        return new d(this, num, str, null);
    }

    public e e() {
        return new e(this, null);
    }

    public f f() {
        return new f(this, null);
    }
}
