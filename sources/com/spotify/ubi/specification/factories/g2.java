package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class g2 {
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

        /* renamed from: com.spotify.ubi.specification.factories.g2$b$b  reason: collision with other inner class name */
        public final class C0449b {
            private final rqe a;

            C0449b(b bVar, a aVar) {
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

        b(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
            je.l("bottom_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0449b c() {
            return new C0449b(this, null);
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

            b(c cVar, a aVar) {
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

        /* renamed from: com.spotify.ubi.specification.factories.g2$c$c  reason: collision with other inner class name */
        public final class C0450c {
            private final rqe a;

            C0450c(c cVar, a aVar) {
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

        public final class d {
            private final rqe a;

            d(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_next_button", p);
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

        public final class e {
            private final rqe a;

            e(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("skip_previous_button", p);
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

        c(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
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

        public C0450c d() {
            return new C0450c(this, null);
        }

        public d e() {
            return new d(this, null);
        }

        public e f() {
            return new e(this, null);
        }
    }

    public final class d {
        private final rqe a;

        d(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
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
        }

        public final class b {
            private final rqe a;

            b(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

            c(e eVar, a aVar) {
                rqe.b p = eVar.a.p();
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

        e(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
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

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

            b(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
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

        f(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
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

    public final class g {
        private final rqe a;

        g(g2 g2Var, a aVar) {
            rqe.b p = g2Var.a.p();
            je.l("video", p);
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

    public g2(String str, String str2) {
        this.a = je.Y("music", "mobile-now-playing-view-video-show", "0.0.4", str, str2);
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
