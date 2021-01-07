package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class t {
    private final rqe a = je.X("music", "mobile-assisted-curation", "3.0.2");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.t$b$a$a  reason: collision with other inner class name */
            public final class C0545a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.t$b$a$a$a  reason: collision with other inner class name */
                public final class C0546a {
                    private final rqe a;

                    C0546a(C0545a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("add_button", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str, String str2) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        qqe.b b = qqe.b();
                        b.c("add_to_playlist");
                        b.e(1);
                        b.b("hit");
                        b.d("playlist", str);
                        return (nqe) je.R(b, "item_to_be_added", str2, f);
                    }
                }

                /* renamed from: com.spotify.ubi.specification.factories.t$b$a$a$b  reason: collision with other inner class name */
                public final class C0547b {
                    private final rqe a;

                    C0547b(C0545a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("album_cover", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        f.e(this.a);
                        nqe.b bVar = f;
                        bVar.h(je.W("play_preview", 1, "hit", "item_to_be_previewed", str));
                        return (nqe) bVar.c();
                    }
                }

                C0545a(a aVar, Integer num, String str, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.o("track_row", num, str, p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0546a b() {
                    return new C0546a(this, null);
                }

                public C0547b c() {
                    return new C0547b(this, null);
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
                    bVar.h(je.W("play_preview", 1, "hit", "item_to_be_previewed", str));
                    return (nqe) bVar.c();
                }
            }

            a(b bVar, String str, Integer num, a aVar) {
                rqe.b p = bVar.a.p();
                je.t("card", str, num, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }

            public C0545a c(Integer num, String str) {
                return new C0545a(this, num, str, null);
            }
        }

        b(t tVar, a aVar) {
            rqe.b p = tVar.a.p();
            je.l("card_container", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, Integer num) {
            return new a(this, str, num, null);
        }
    }

    public final class c {
        private final rqe a;

        c(t tVar, a aVar) {
            rqe.b p = tVar.a.p();
            je.l("empty_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class d {
        private final rqe a;

        d(t tVar, a aVar) {
            rqe.b p = tVar.a.p();
            je.l("offline_view", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class e {
        private final rqe a;

        e(t tVar, a aVar) {
            rqe.b p = tVar.a.p();
            je.l("search_box", p);
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

    public final class f {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(f fVar, a aVar) {
                rqe.b p = fVar.a.p();
                je.l("back_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_navigate_back", 1, "hit", f);
            }
        }

        f(t tVar, a aVar) {
            rqe.b p = tVar.a.p();
            je.l("toolbar", p);
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
}
