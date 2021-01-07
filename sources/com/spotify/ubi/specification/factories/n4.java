package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class n4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(n4 n4Var, a aVar) {
            rqe.b p = n4Var.a.p();
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

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.n4$c$a$a  reason: collision with other inner class name */
            public final class C0491a {
                private final rqe a;

                /* renamed from: com.spotify.ubi.specification.factories.n4$c$a$a$a  reason: collision with other inner class name */
                public final class C0492a {
                    private final rqe a;

                    C0492a(C0491a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
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

                /* renamed from: com.spotify.ubi.specification.factories.n4$c$a$a$b */
                public final class b {
                    private final rqe a;

                    b(C0491a aVar, a aVar2) {
                        rqe.b p = aVar.a.p();
                        je.l("confirm_remove_downloads", p);
                        p.f(Boolean.FALSE);
                        this.a = p.d();
                    }

                    public nqe a(String str) {
                        nqe.b f = nqe.f();
                        return (nqe) je.R(je.T(f, this.a, "remove_download", 1, "hit"), "item_to_remove_from_downloads", str, f);
                    }
                }

                C0491a(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
                    je.l("download_button", p);
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public C0492a b() {
                    return new C0492a(this, null);
                }

                public b c() {
                    return new b(this, null);
                }

                public nqe d(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "download", 1, "hit"), "item_to_download", str, f);
                }

                public nqe e(String str) {
                    nqe.b f = nqe.f();
                    return (nqe) je.R(je.T(f, this.a, "stop_download", 1, "hit"), "item_to_stop_download", str, f);
                }

                public nqe f() {
                    nqe.b f = nqe.f();
                    f.e(this.a);
                    return (nqe) je.S("ui_reveal", 1, "hit", f);
                }
            }

            public final class b {
                private final rqe a;

                b(a aVar, a aVar2) {
                    rqe.b p = aVar.a.p();
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
                    return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
                }
            }

            a(c cVar, a aVar) {
                rqe.b p = cVar.a.p();
                je.l("actions", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public C0491a b() {
                return new C0491a(this, null);
            }

            public b c() {
                return new b(this, null);
            }
        }

        c(n4 n4Var, a aVar) {
            rqe.b p = n4Var.a.p();
            je.l("header", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }
    }

    public final class d {
        private final rqe a;

        d(n4 n4Var, a aVar) {
            rqe.b p = n4Var.a.p();
            je.l("item_list", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public n4(String str, String str2) {
        this.a = je.Y("music", "mobile-your-episodes", "2.0.0", str, str2);
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
