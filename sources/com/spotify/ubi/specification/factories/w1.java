package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class w1 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("pause_resume_action", p);
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

        /* renamed from: com.spotify.ubi.specification.factories.w1$b$b  reason: collision with other inner class name */
        public final class C0568b {
            private final rqe a;

            C0568b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("skip_next_action", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
            }
        }

        public final class c {
            private final rqe a;

            c(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("skip_prev_action", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                return (nqe) je.R(je.T(f, this.a, "skip_to_previous", 1, "hit"), "item_to_be_skipped", str, f);
            }
        }

        b(w1 w1Var, String str, a aVar) {
            rqe.b p = w1Var.a.p();
            je.q("horizontal_container", str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0568b c() {
            return new C0568b(this, null);
        }

        public c d() {
            return new c(this, null);
        }
    }

    public w1(String str, String str2) {
        this.a = je.Y("music", "mobile-notifications-playback-controls-feedback-android", "2.0.0", str, str2);
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
