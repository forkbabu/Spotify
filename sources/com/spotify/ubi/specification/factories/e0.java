package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class e0 {
    private final rqe a = je.X("music", "mobile-car-mode-now-playing-view", "5.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("close_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.e0$b$b  reason: collision with other inner class name */
        public final class C0424b {
            private final rqe a;

            C0424b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("context_header", p);
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

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("cover_art", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("skip_to_next", 1, "swipe_left", "item_to_be_skipped", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("skip_to_previous", 1, "swipe_right", "item_to_be_skipped", str));
                return (nqe) bVar.c();
            }
        }

        public final class d {
            private final rqe a;

            public final class a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$a$a  reason: collision with other inner class name */
                public final class C0425a {
                    private final rqe a;

                    C0425a(a aVar, a aVar2) {
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

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$a$b  reason: collision with other inner class name */
                public final class C0426b {
                    private final rqe a;

                    C0426b(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("opt_out_button", p);
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

                    c(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("playback_speed_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_reveal", 1, "hit", f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$a$d  reason: collision with other inner class name */
                public final class C0427d {
                    private final rqe a;

                    C0427d(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("repeat_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("repeat_disable", 1, "hit", f);
                    }

                    public nqe b() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("repeat_enable", 1, "hit", f);
                    }

                    public nqe c() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("repeat_one_enable", 1, "hit", f);
                    }
                }

                public final class e {
                    private final rqe a;

                    e(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("shuffle_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("shuffle_disable", 1, "hit", f);
                    }

                    public nqe b() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("shuffle_enable", 1, "hit", f);
                    }
                }

                public final class f {
                    private final rqe a;

                    f(a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("voice_search_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a() {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        return (nqe) je.S("ui_reveal", 1, "hit", f);
                    }
                }

                a(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("bottom_row", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0425a b() {
                    return new C0425a(this, null);
                }

                public C0426b c() {
                    return new C0426b(this, null);
                }

                public c d() {
                    return new c(this, null);
                }

                public C0427d e() {
                    return new C0427d(this, null);
                }

                public e f() {
                    return new e(this, null);
                }

                public f g() {
                    return new f(this, null);
                }
            }

            /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b  reason: collision with other inner class name */
            public final class C0428b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b$a */
                public final class a {
                    private final rqe a;

                    a(C0428b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("next_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("skip_to_next", 1, "hit", "item_to_be_skipped", str));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b$b  reason: collision with other inner class name */
                public final class C0429b {
                    private final rqe a;

                    C0429b(C0428b bVar, a aVar) {
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
                        bVar.h(je.W(ContextTrack.TrackAction.RESUME, 1, "hit", "item_to_be_resumed", str));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b$c */
                public final class c {
                    private final rqe a;

                    c(C0428b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("previous_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("skip_to_previous", 1, "hit", "item_to_be_skipped", str));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b$d  reason: collision with other inner class name */
                public final class C0430d {
                    private final rqe a;

                    C0430d(C0428b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("seek_backward_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(Integer num) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.U("seek_by_time", 1, "hit", "ms_seeked_offset", num));
                        return (nqe) bVar.c();
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$d$b$e */
                public final class e {
                    private final rqe a;

                    e(C0428b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("seek_forward_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(Integer num) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.U("seek_by_time", 1, "hit", "ms_seeked_offset", num));
                        return (nqe) bVar.c();
                    }
                }

                C0428b(d dVar, a aVar) {
                    rqe.b p = dVar.a.p();
                    je.l("top_row", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public a b() {
                    return new a(this, null);
                }

                public C0429b c() {
                    return new C0429b(this, null);
                }

                public c d() {
                    return new c(this, null);
                }

                public C0430d e() {
                    return new C0430d(this, null);
                }

                public e f() {
                    return new e(this, null);
                }
            }

            d(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("main_controls", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0428b c() {
                return new C0428b(this, null);
            }
        }

        public final class e {
            private final rqe a;

            e(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("playback_progress", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(Integer num) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.U("seek_to_time", 1, "drag", "ms_to_seek_to", num));
                return (nqe) bVar.c();
            }
        }

        public final class f {
            private final rqe a;

            public final class a {
                private final rqe a;

                a(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
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

            /* renamed from: com.spotify.ubi.specification.factories.e0$b$f$b  reason: collision with other inner class name */
            public final class C0431b {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$f$b$a */
                public final class a {
                    private final rqe a;

                    a(C0431b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("artist_label", p);
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

                /* renamed from: com.spotify.ubi.specification.factories.e0$b$f$b$b  reason: collision with other inner class name */
                public final class C0432b {
                    private final rqe a;

                    C0432b(C0431b bVar, a aVar) {
                        rqe.b p = bVar.a.p();
                        je.l("title_label", p);
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

                C0431b(f fVar, a aVar) {
                    rqe.b p = fVar.a.p();
                    je.l("labels", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public a b() {
                    return new a(this, null);
                }

                public C0432b c() {
                    return new C0432b(this, null);
                }
            }

            f(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("track_information", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0431b c() {
                return new C0431b(this, null);
            }
        }

        b(e0 e0Var, String str, a aVar) {
            rqe.b p = e0Var.a.p();
            je.q("mode", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0424b c() {
            return new C0424b(this, null);
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
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
