package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class p {
    private final rqe a = je.X("music", "mobile-android-widget", "1.0.2");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.p$b$a$a  reason: collision with other inner class name */
            public final class C0496a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.p$b$a$a$a  reason: collision with other inner class name */
                public final class C0497a {
                    private final rqe a;

                    C0497a(C0496a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("play_pause", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.PAUSE, 1, "hit"), "item_to_be_paused", str, f);
                    }

                    public nqe b(String str) {
                        nqe.b f = nqe.f();
                        return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.p$b$a$a$b  reason: collision with other inner class name */
                public final class C0498b {
                    private final rqe a;

                    C0498b(C0496a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("skip_next", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.p$b$a$a$c */
                public final class c {
                    private final rqe a;

                    c(C0496a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("skip_prev", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        return (nqe) je.R(je.T(f, this.a, "skip_to_previous", 1, "hit"), "item_to_be_skipped", str, f);
                    }
                }

                C0496a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("playback_controls", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0497a b() {
                    return new C0497a(this, null);
                }

                public C0498b c() {
                    return new C0498b(this, null);
                }

                public c d() {
                    return new c(this, null);
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("controls_container", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0496a b() {
                return new C0496a(this, null);
            }
        }

        b(p pVar, a aVar) {
            rqe.b p = pVar.a.p();
            je.l("vertical_container", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public b b() {
        return new b(this, null);
    }
}
