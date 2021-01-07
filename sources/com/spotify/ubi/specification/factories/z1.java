package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class z1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
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

        /* renamed from: com.spotify.ubi.specification.factories.z1$b$b  reason: collision with other inner class name */
        public final class C0575b {
            private final rqe a;

            C0575b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
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

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
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

        b(z1 z1Var, a aVar) {
            rqe.b p = z1Var.a.p();
            je.l("main_controls", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0575b c() {
            return new C0575b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public final class c {
        private final rqe a;

        c(z1 z1Var, a aVar) {
            rqe.b p = z1Var.a.p();
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

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
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

        d(z1 z1Var, a aVar) {
            rqe.b p = z1Var.a.p();
            je.l("top_bar", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public z1(String str, String str2) {
        this.a = je.Y("music", "mobile-now-playing-view-audio-ads", "2.0.0", str, str2);
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
