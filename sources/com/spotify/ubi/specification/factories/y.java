package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class y {
    private final rqe a = je.X("music", "mobile-behind-the-lyrics", "2.0.0");

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.q("annotation", str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
                return (nqe) bVar.c();
            }

            public mqe b() {
                mqe.b e = mqe.e();
                e.e(this.a);
                return (mqe) e.c();
            }
        }

        b(y yVar, String str, a aVar) {
            rqe.b p = yVar.a.p();
            je.s("behind_the_lyrics_carousel", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(String str) {
            return new a(this, str, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(String str) {
        return new b(this, str, null);
    }
}
