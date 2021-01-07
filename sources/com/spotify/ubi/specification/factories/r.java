package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;

public final class r {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("about_biography", p);
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

            a(c cVar, Integer num, a aVar) {
                rqe.b p = cVar.a.p();
                je.m("carousel", num, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("move_image", 1, "swipe", f);
            }
        }

        c(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("gallery", p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public a b(Integer num) {
            return new a(this, num, null);
        }

        public mqe c() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class d {
        private final rqe a;

        d(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("social_facebook_link", p);
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

    public final class e {
        private final rqe a;

        e(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("social_instagram_link", p);
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

    public final class f {
        private final rqe a;

        f(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("social_twitter_link", p);
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

    public final class g {
        private final rqe a;

        g(r rVar, a aVar) {
            rqe.b p = rVar.a.p();
            je.l("social_wikipedia_link", p);
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

    public r(String str) {
        rqe.b e2 = rqe.e();
        e2.c("music");
        e2.l("mobile-artist-about");
        e2.m("3.0.0");
        e2.j(str);
        this.a = e2.d();
    }

    public b a() {
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
