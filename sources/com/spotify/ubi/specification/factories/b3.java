package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class b3 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.b3$b$b  reason: collision with other inner class name */
        public final class C0402b {
            private final rqe a;

            C0402b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
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

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("play_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W(ContextTrack.TrackAction.PAUSE, 1, "hit", "item_to_be_paused", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        public final class d {
            private final rqe a;

            d(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("share_button", p);
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

        b(b3 b3Var, a aVar) {
            rqe.b p = b3Var.a.p();
            je.l("actions", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0402b c() {
            return new C0402b(this, null);
        }

        public c d() {
            return new c(this, null);
        }

        public d e() {
            return new d(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.b3$c$a$a  reason: collision with other inner class name */
            public final class C0403a {
                private final rqe a;

                C0403a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("email_link", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("see_more_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.b3$c$a$c  reason: collision with other inner class name */
            public final class C0404c {
                private final rqe a;

                C0404c(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("spotify_link", p);
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

            public final class d {
                private final rqe a;

                d(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("timestamp", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(Integer num) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.U("seek_to_time", 1, "hit", "ms_to_seek_to", num));
                    return (nqe) bVar.c();
                }
            }

            public final class e {
                private final rqe a;

                e(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("web_link", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                    return (nqe) bVar.c();
                }
            }

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("episode_description", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0403a b() {
                return new C0403a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public C0404c d() {
                return new C0404c(this, null);
            }

            public d e() {
                return new d(this, null);
            }

            public e f() {
                return new e(this, null);
            }
        }

        c(b3 b3Var, a aVar) {
            rqe.b p = b3Var.a.p();
            je.l("episode_info", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("cover_art_image", p);
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

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("show_name_label", p);
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

        d(b3 b3Var, a aVar) {
            rqe.b p = b3Var.a.p();
            je.l("header", p);
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

    public final class e {
        private final rqe a;

        e(b3 b3Var, a aVar) {
            rqe.b p = b3Var.a.p();
            je.l("see_all_episodes_button", p);
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

    public b3(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-podcastepisode-entity");
        e2.m("3.2.0");
        e2.j(str);
        this.a = e2.d();
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

    public e e() {
        return new e(this, null);
    }
}
