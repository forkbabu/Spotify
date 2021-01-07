package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class k2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("add_songs_button", p);
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

        c(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("algolinking", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("refresh_content", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        d(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("deeplinking", p);
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

    public final class e {
        private final rqe a;

        e(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("download_toggle", p);
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

        public nqe c(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class f {
        private final rqe a;

        f(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("edit_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("add_songs_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("find_playlists_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
                }
            }

            b(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("forbidden_view", p);
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
        }

        public final class c {
            private final rqe a;

            c(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("home_button", p);
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

            public final class a {
                private final rqe a;

                a(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("find_playlists_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
                }
            }

            d(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("lookup_failed_view", p);
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
        }

        public final class e {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("remove_button", p);
                    p.f(Boolean.TRUE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("delete_playlist", 1, "hit", "playlist_to_be_deleted", str));
                    return (nqe) bVar.c();
                }

                public mqe b() {
                    mqe.b e = mqe.e();
                    e.e(this.a);
                    return (mqe) e.c();
                }
            }

            e(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("not_found_view", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c() {
                return new a(this, null);
            }
        }

        g(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("empty_view", p);
            p.f(Boolean.TRUE);
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

        public mqe e() {
            mqe.b e2 = mqe.e();
            e2.e(this.a);
            return (mqe) e2.c();
        }

        public d f() {
            return new d(this, null);
        }

        public e g() {
            return new e(this, null);
        }
    }

    public final class h {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("cancel_text_filter_button", p);
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

            b(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
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

        public final class c {
            private final rqe a;

            c(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("filter_option", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "hit", f);
            }
        }

        public final class d {
            private final rqe a;

            d(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("filter_or_sort_option_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class e {
            private final rqe a;

            e(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("sort_option", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("sort", 1, "hit", f);
            }
        }

        public final class f {
            private final rqe a;

            f(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("text_filter", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("filter", 1, "key_stroke", f);
            }
        }

        public final class g {
            private final rqe a;

            g(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
                je.l("text_filter_clear_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("text_clear", 1, "hit", f);
            }
        }

        h(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("filter_and_sort", p);
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

        public d e() {
            return new d(this, null);
        }

        public e f() {
            return new e(this, null);
        }

        public f g() {
            return new f(this, null);
        }

        public g h() {
            return new g(this, null);
        }
    }

    public final class i {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("collaborators", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("cover_art", p);
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

            c(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("follow_button", p);
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

        public final class d {
            private final rqe a;

            d(i iVar, a aVar) {
                rqe.b p = iVar.a.p();
                je.l("owner", p);
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

        i(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
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

        public c d() {
            return new c(this, null);
        }

        public d e() {
            return new d(this, null);
        }
    }

    public final class j {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.k2$j$a$a  reason: collision with other inner class name */
            public final class C0468a {
                private final rqe a;

                C0468a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("ban_button", p);
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

            public final class c {
                private final rqe a;

                c(a aVar, a aVar2) {
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

            public final class d {
                private final rqe a;

                d(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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

            public final class e {
                private final rqe a;

                e(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("education_footer", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class f {
                private final rqe a;

                f(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("heart_button", p);
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

                g(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("play_button", p);
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

            public final class h {
                private final rqe a;

                h(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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

            a(j jVar, Integer num, String str, a aVar) {
                rqe.b p = jVar.a.p();
                je.o("item", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0468a b() {
                return new C0468a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public c d() {
                return new c(this, null);
            }

            public d e() {
                return new d(this, null);
            }

            public e f() {
                return new e(this, null);
            }

            public f g() {
                return new f(this, null);
            }

            public nqe h(String str) {
                nqe.b f2 = nqe.f();
                f2.e(this.a);
                nqe.b bVar = f2;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }

            public nqe i(String str) {
                nqe.b f2 = nqe.f();
                f2.e(this.a);
                nqe.b bVar = f2;
                bVar.h(je.W("play_preview", 1, "hit", "item_to_be_previewed", str));
                return (nqe) bVar.c();
            }

            public mqe j() {
                mqe.b e2 = mqe.e();
                e2.e(this.a);
                return (mqe) e2.c();
            }

            public g k() {
                return new g(this, null);
            }

            public h l() {
                return new h(this, null);
            }
        }

        public final class b {
            private final rqe a;

            b(j jVar, a aVar) {
                rqe.b p = jVar.a.p();
                je.l("shuffle_education", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        public final class c {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(c cVar, a aVar) {
                    rqe.b p = cVar.a.p();
                    je.l("recommendation_explanation_dialog", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_hide", 1, "hit", f);
                }
            }

            c(j jVar, a aVar) {
                rqe.b p = jVar.a.p();
                je.l("we_added_section_header", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe b() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }

            public a c() {
                return new a(this, null);
            }
        }

        j(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }

        public b c() {
            return new b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class k {
        private final rqe a;

        k(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
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

    public final class l {
        private final rqe a;

        l(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("preview_button", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class m {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(m mVar, a aVar) {
                rqe.b p = mVar.a.p();
                je.l("back_button", p);
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

            public final class a {
                private final rqe a;

                a(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("add_songs_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.k2$m$b$b  reason: collision with other inner class name */
            public final class C0469b {
                private final rqe a;

                C0469b(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("add_to_home_screen_option", p);
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

                c(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("collaborative_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("make_playlist_collaborative", 1, "hit", "playlist_to_be_made_collaborative", str));
                    return (nqe) bVar.c();
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("make_playlist_non_collaborative", 1, "hit", "playlist_to_be_made_non_collaborative", str));
                    return (nqe) bVar.c();
                }
            }

            public final class d {
                private final rqe a;

                public final class a {
                    private final rqe a;

                    a(d dVar, a aVar) {
                        rqe.b p = dVar.a.p();
                        je.l("cancel", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_hide", 1, "hit", f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.k2$m$b$d$b  reason: collision with other inner class name */
                public final class C0470b {
                    private final rqe a;

                    C0470b(d dVar, a aVar) {
                        rqe.b p = dVar.a.p();
                        je.l("confirm_deletion", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("delete_playlist", 1, "hit", "playlist_to_be_deleted", str));
                        return (nqe) bVar.c();
                    }
                }

                d(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("delete_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public a b() {
                    return new a(this, null);
                }

                public C0470b c() {
                    return new C0470b(this, null);
                }

                public nqe d() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class e {
                private final rqe a;

                e(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("download_central_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class f {
                private final rqe a;

                f(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("download_option", p);
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

            public final class g {
                private final rqe a;

                g(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("edit_playlist_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class h {
                private final rqe a;

                h(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("find_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class i {
                private final rqe a;

                i(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("heart_button", p);
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

            public final class j {
                private final rqe a;

                j(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("privacy_and_permissions_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class k {
                private final rqe a;

                k(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("published_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("make_playlist_public", 1, "hit", "playlist_to_be_made_public", str));
                    return (nqe) bVar.c();
                }

                public nqe b(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("make_playlist_secret", 1, "hit", "playlist_to_be_made_secret", str));
                    return (nqe) bVar.c();
                }
            }

            public final class l {
                private final rqe a;

                l(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("radio_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.k2$m$b$m  reason: collision with other inner class name */
            public final class C0471m {
                private final rqe a;

                C0471m(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("recommendation_education_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class n {
                private final rqe a;

                n(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("rename_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class o {
                private final rqe a;

                o(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("report_abuse_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class p {
                private final rqe a;

                p(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("share_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class q {
                private final rqe a;

                q(b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("sort_option", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            b(m mVar, a aVar) {
                rqe.b p2 = mVar.a.p();
                je.l("context_menu_button", p2);
                p2.f(Boolean.FALSE);
                this.a = p2.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0469b c() {
                return new C0469b(this, null);
            }

            public c d() {
                return new c(this, null);
            }

            public d e() {
                return new d(this, null);
            }

            public e f() {
                return new e(this, null);
            }

            public f g() {
                return new f(this, null);
            }

            public g h() {
                return new g(this, null);
            }

            public h i() {
                return new h(this, null);
            }

            public i j() {
                return new i(this, null);
            }

            public nqe k() {
                nqe.b f2 = nqe.f();
                f2.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f2);
            }

            public j l() {
                return new j(this, null);
            }

            public k m() {
                return new k(this, null);
            }

            public l n() {
                return new l(this, null);
            }

            public C0471m o() {
                return new C0471m(this, null);
            }

            public n p() {
                return new n(this, null);
            }

            public o q() {
                return new o(this, null);
            }

            public p r() {
                return new p(this, null);
            }

            public q s() {
                return new q(this, null);
            }
        }

        public final class c {
            private final rqe a;

            c(m mVar, a aVar) {
                rqe.b p = mVar.a.p();
                je.l("heart_button", p);
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

        public final class d {
            private final rqe a;

            d(m mVar, a aVar) {
                rqe.b p = mVar.a.p();
                je.l("invite_friends_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class e {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("make_collaborative_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str) {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    nqe.b bVar = f;
                    bVar.h(je.W("make_playlist_collaborative", 1, "hit", "playlist_to_be_made_collaborative", str));
                    return (nqe) bVar.c();
                }
            }

            public final class b {
                private final rqe a;

                b(e eVar, a aVar) {
                    rqe.b p = eVar.a.p();
                    je.l("maybe_later_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            e(m mVar, a aVar) {
                rqe.b p = mVar.a.p();
                je.l("invite_friends_dialog", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public a c() {
                return new a(this, null);
            }

            public b d() {
                return new b(this, null);
            }
        }

        m(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("toolbar", p);
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

        public d e() {
            return new d(this, null);
        }

        public e f() {
            return new e(this, null);
        }
    }

    public final class n {
        private final rqe a;

        n(k2 k2Var, a aVar) {
            rqe.b p = k2Var.a.p();
            je.l("track_cloud", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public k2(String str, String str2, String str3) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-playlist-entity");
        e2.m("4.3.0");
        e2.g(str);
        e2.j(str2);
        e2.i(str3);
        this.a = e2.d();
    }

    public rqe a() {
        return this.a;
    }

    public b c() {
        return new b(this, null);
    }

    public c d() {
        return new c(this, null);
    }

    public d e() {
        return new d(this, null);
    }

    public e f() {
        return new e(this, null);
    }

    public f g() {
        return new f(this, null);
    }

    public g h() {
        return new g(this, null);
    }

    public h i() {
        return new h(this, null);
    }

    public i j() {
        return new i(this, null);
    }

    public j k() {
        return new j(this, null);
    }

    public k l() {
        return new k(this, null);
    }

    public l m() {
        return new l(this, null);
    }

    public m n() {
        return new m(this, null);
    }

    public n o() {
        return new n(this, null);
    }
}
