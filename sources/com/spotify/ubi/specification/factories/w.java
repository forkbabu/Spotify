package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;
import defpackage.sqe;

public final class w {
    private final rqe a = je.X("music", "mobile-audioplhs-addsong-modal", "1.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.w$b$a$a  reason: collision with other inner class name */
            public final class C0565a {
                private final rqe a;

                C0565a(a aVar, String str, String str2, a aVar2) {
                    rqe.b p = aVar.a.p();
                    sqe.b c = sqe.c();
                    c.c("add_podcast_button");
                    c.f(str);
                    c.e(str2);
                    p.n(c.a());
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str, String str2) {
                    nqe.b f = nqe.f();
                    qqe.b T = je.T(f, this.a, "add_to_playlist", 1, "hit");
                    T.d("playlist", str);
                    T.d("item_to_be_added", str2);
                    f.h(T.a());
                    return (nqe) f.c();
                }
            }

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("add_podcast_tab", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public C0565a b(String str, String str2) {
                return new C0565a(this, str, str2, null);
            }

            public mqe c() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        /* renamed from: com.spotify.ubi.specification.factories.w$b$b  reason: collision with other inner class name */
        public final class C0566b {
            private final rqe a;

            /* renamed from: com.spotify.ubi.specification.factories.w$b$b$a */
            public final class a {
                private final rqe a;

                a(C0566b bVar, String str, String str2, a aVar) {
                    rqe.b p = bVar.a.p();
                    sqe.b c = sqe.c();
                    c.c("add_song_button");
                    c.f(str);
                    c.e(str2);
                    p.n(c.a());
                    p.f(Boolean.FALSE);
                    this.a = p.d();
                }

                public nqe a(String str, String str2) {
                    nqe.b f = nqe.f();
                    qqe.b T = je.T(f, this.a, "add_to_playlist", 1, "hit");
                    T.d("playlist", str);
                    T.d("item_to_be_added", str2);
                    f.h(T.a());
                    return (nqe) f.c();
                }
            }

            C0566b(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("add_songs_tab", p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public a b(String str, String str2) {
                return new a(this, str, str2, null);
            }
        }

        b(w wVar, a aVar) {
            rqe.b p = wVar.a.p();
            je.l("modal", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b() {
            return new a(this, null);
        }

        public C0566b c() {
            return new C0566b(this, null);
        }

        public mqe d() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b() {
        return new b(this, null);
    }
}
