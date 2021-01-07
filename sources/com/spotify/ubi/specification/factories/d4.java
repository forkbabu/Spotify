package com.spotify.ubi.specification.factories;

import defpackage.rqe;

public final class d4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, Integer num, String str, a aVar) {
                rqe.b p = bVar.a.p();
                je.o("episode_item", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        b(d4 d4Var, a aVar) {
            rqe.b p = d4Var.a.p();
            je.l("episodes", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class c {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(c cVar, Integer num, String str, a aVar) {
                rqe.b p = cVar.a.p();
                je.o("popular_episode_item", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        c(d4 d4Var, a aVar) {
            rqe.b p = d4Var.a.p();
            je.l("popular_episodes", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public final class d {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(d dVar, Integer num, String str, a aVar) {
                rqe.b p = dVar.a.p();
                je.o("related_topic_item", num, str, p);
                p.f(Boolean.TRUE);
                this.a = p.d();
            }

            public rqe a() {
                return this.a;
            }
        }

        d(d4 d4Var, a aVar) {
            rqe.b p = d4Var.a.p();
            je.l("related_topics", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(Integer num, String str) {
            return new a(this, num, str, null);
        }
    }

    public d4(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-topic");
        e.m("2.0.1");
        e.i(str);
        this.a = e.d();
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
