package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class d2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("connect_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.d2$b$b  reason: collision with other inner class name */
        public final class C0419b {
            private final rqe a;

            C0419b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("share_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        b(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
            je.l("bottom_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0419b c() {
            return new C0419b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("play_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.PAUSE, 1, "hit"), "item_to_be_paused", str, f);
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.RESUME, 1, "hit"), "item_to_be_resumed", str, f);
            }
        }

        public final class b {
            private final rqe a;

            b(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.d2$c$c  reason: collision with other inner class name */
        public final class C0420c {
            private final rqe a;

            C0420c(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        public final class d {
            private final rqe a;

            d(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
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

        public final class e {
            private final rqe a;

            e(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_next_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
            }
        }

        public final class f {
            private final rqe a;

            f(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_previous_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "skip_to_previous", 1, "hit"), "item_to_be_skipped", str, f);
            }
        }

        public final class g {
            private final rqe a;

            g(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("sleep_timer_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        c(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
            je.l("main_controls", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public b c() {
            return new b(this, null);
        }

        public C0420c d() {
            return new C0420c(this, null);
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

    public final class d {
        private final rqe a;

        d(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
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

    public final class e {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.d2$e$a$a  reason: collision with other inner class name */
            public final class C0421a {
                private final rqe a;

                C0421a(a aVar, a aVar2) {
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

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("heart_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_element_toggle", 1, "hit", f);
                }
            }

            a(e eVar, Integer num, String str, a aVar) {
                rqe.b p = eVar.a.p();
                je.o("item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0421a b() {
                return new C0421a(this, null);
            }

            public b c() {
                return new b(this, null);
            }

            public nqe d(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
            }
        }

        e(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
            je.l("segments_list", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe b() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public a c(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

        public final class b {
            private final rqe a;

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

            c(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("playback_source_label", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "ui_navigate", 1, "hit"), "destination", str, f);
            }
        }

        f(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
            je.l("top_bar", p);
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
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("heart_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_element_toggle", 1, "hit", f);
            }
        }

        g(d2 d2Var, a aVar) {
            rqe.b p = d2Var.a.p();
            je.l("track_information", p);
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

    public d2(String str, String str2) {
        this.a = je.Y("music", "mobile-now-playing-view-mt-show", "0.0.1", str, str2);
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

    public f f() {
        return new f(this, null);
    }

    public g g() {
        return new g(this, null);
    }
}
