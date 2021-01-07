package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class f1 {
    private final rqe a = je.X("music", "mobile-hidden-content", "0.2.2");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.f1$b$a$a  reason: collision with other inner class name */
            public final class C0437a {
                private final rqe a;

                C0437a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("ban_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            a(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("artist_item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0437a b() {
                return new C0437a(this, null);
            }

            public nqe c(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.f1$b$b  reason: collision with other inner class name */
        public final class C0438b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.f1$b$b$a */
            public final class a {
                private final rqe a;

                a(C0438b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("album_cover", p);
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

            /* renamed from: com.spotify.ubi.specification.factories.f1$b$b$b  reason: collision with other inner class name */
            public final class C0439b {
                private final rqe a;

                C0439b(C0438b bVar, a aVar) {
                    rqe.b p = bVar.a.p();
                    je.l("ban_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            C0438b(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("song_item", num, str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public a b() {
                return new a(this, null);
            }

            public C0439b c() {
                return new C0439b(this, null);
            }

            public nqe d(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W(ContextTrack.TrackAction.PAUSE, 1, "hit", "item_to_be_paused", str));
                return (nqe) bVar.c();
            }

            public nqe e(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("play", 1, "hit", "item_to_be_played", str));
                return (nqe) bVar.c();
            }
        }

        b(f1 f1Var, String str, a aVar) {
            rqe.b p = f1Var.a.p();
            je.q("item_list", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }

        public C0438b d(Integer num, String str) {
            return new C0438b(this, num, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.q("tab_item", str, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        c(f1 f1Var, a aVar) {
            rqe.b p = f1Var.a.p();
            je.l("tabs", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, a aVar) {
                rqe.b p = dVar.a.p();
                je.l("undo_button", p);
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
        }

        d(f1 f1Var, String str, a aVar) {
            rqe.b p = f1Var.a.p();
            je.s("undo_snackbar", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }

    public c c() {
        return new c(this, null);
    }

    public d d(String str) {
        return new d(this, str, null);
    }
}
