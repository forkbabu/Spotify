package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class f2 {
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

        /* renamed from: com.spotify.ubi.specification.factories.f2$b$b  reason: collision with other inner class name */
        public final class C0440b {
            private final rqe a;

            C0440b(b bVar, a aVar) {
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

        b(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
            je.l("bottom_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0440b c() {
            return new C0440b(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
            je.l("cover_art", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("skip_to_next", 1, "swipe", "item_to_be_skipped", str));
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("skip_to_previous", 1, "swipe", "item_to_be_skipped", str));
            return (nqe) bVar.c();
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class b {
            private final rqe a;

            b(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        public final class c {
            private final rqe a;

            c(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        /* renamed from: com.spotify.ubi.specification.factories.f2$d$d  reason: collision with other inner class name */
        public final class C0441d {
            private final rqe a;

            C0441d(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

            e(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        d(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
            je.l("main_controls", p);
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

        public C0441d e() {
            return new C0441d(this, null);
        }

        public e f() {
            return new e(this, null);
        }
    }

    public final class e {
        private final rqe a;

        e(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
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

            a(f fVar, String str, Integer num, a aVar) {
                rqe.b p = fVar.a.p();
                je.t("component", str, num, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe a() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        f(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
            je.l("scroll_components", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str, Integer num) {
            return new a(this, str, num, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class g {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
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

            b(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
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

            c(g gVar, a aVar) {
                rqe.b p = gVar.a.p();
                je.l("playback_source_label", p);
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

        g(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
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

    public final class h {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
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

        public final class b {
            private final rqe a;

            b(h hVar, a aVar) {
                rqe.b p = hVar.a.p();
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

        h(f2 f2Var, a aVar) {
            rqe.b p = f2Var.a.p();
            je.l("track_information", p);
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

    public f2(String str, String str2) {
        this.a = je.Y("music", "mobile-now-playing-view-podcast", "0.0.4", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public c c() {
        return new c(this, null);
    }

    public nqe d() {
        nqe.b f2 = nqe.f();
        f2.e(this.a);
        return (nqe) je.S("ui_reveal", 1, "drag", f2);
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
}
