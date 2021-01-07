package com.spotify.ubi.specification.factories;

import defpackage.mqe;
import defpackage.nqe;
import defpackage.rqe;
import defpackage.sqe;

public final class e1 {
    private final rqe a = je.X("music", "mobile-fullscreen-story-view", "5.0.0");

    public final class b {
        private final rqe a;

        b(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("audio_playing", str, num, str2, p);
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

        c(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("back_button", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class d {
        private final rqe a;

        d(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("context_player_resumed", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_hide", 1, "hit", f);
        }
    }

    public final class e {
        private final rqe a;

        e(e1 e1Var, String str, a aVar) {
            rqe.b p = e1Var.a.p();
            je.s("empty_chapter", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class f {
        private final rqe a;

        f(e1 e1Var, String str, a aVar) {
            rqe.b p = e1Var.a.p();
            je.s("empty_story", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class g {
        private final rqe a;

        g(e1 e1Var, String str, a aVar) {
            rqe.b p = e1Var.a.p();
            je.s("entire_story_shown", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class h {
        private final rqe a;

        h(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("next_chapter_requested", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "skip_to_next", 1, "hit"), "item_to_be_skipped", str, f);
        }
    }

    public final class i {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(i iVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = iVar.a.p();
                je.u("context_menu", str, num, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_reveal", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(i iVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = iVar.a.p();
                je.u("follow_button", str, num, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
                return (nqe) bVar.c();
            }
        }

        public final class c {
            private final rqe a;

            c(i iVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = iVar.a.p();
                je.u("heart_button", str, num, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("like", 1, "hit", "item_to_be_liked", str));
                return (nqe) bVar.c();
            }

            public nqe b(String str) {
                nqe.b f = nqe.f();
                f.e(this.a);
                nqe.b bVar = f;
                bVar.h(je.W("remove_like", 1, "hit", "item_no_longer_liked", str));
                return (nqe) bVar.c();
            }
        }

        i(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("overlay", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, Integer num, String str2) {
            return new a(this, str, num, str2, null);
        }

        public b c(String str, Integer num, String str2) {
            return new b(this, str, num, str2, null);
        }

        public c d(String str, Integer num, String str2) {
            return new c(this, str, num, str2, null);
        }

        public nqe e(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar.c();
        }
    }

    public final class j {
        private final rqe a;

        j(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("playback_error", str, num, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class k {
        private final rqe a;

        k(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("previous_chapter_requested", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "skip_to_previous", 1, "hit"), "item_to_be_skipped", str, f);
        }
    }

    public final class l {
        private final rqe a;

        l(e1 e1Var, String str, a aVar) {
            rqe.b p = e1Var.a.p();
            je.s("story_fetched", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class m {
        private final rqe a;

        m(e1 e1Var, String str, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            sqe.b c = sqe.c();
            c.c("story_fetching_failed");
            c.f(str);
            c.e(str2);
            p.n(c.a());
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class n {
        private final rqe a;

        n(e1 e1Var, String str, a aVar) {
            rqe.b p = e1Var.a.p();
            je.s("story_shown", str, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public final class o {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(o oVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = oVar.a.p();
                je.u("close_button", str, num, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        public final class b {
            private final rqe a;

            b(o oVar, String str, Integer num, String str2, a aVar) {
                rqe.b p = oVar.a.p();
                je.u("playlist_cover_button", str, num, str2, p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        o(e1 e1Var, a aVar) {
            rqe.b p = e1Var.a.p();
            je.l("top_container_view", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public a b(String str, Integer num, String str2) {
            return new a(this, str, num, str2, null);
        }

        public b c(String str, Integer num, String str2) {
            return new b(this, str, num, str2, null);
        }
    }

    public final class p {
        private final rqe a;

        p(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("video_context_menu", str, num, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            return (nqe) je.S("ui_reveal", 1, "hit", f);
        }
    }

    public final class q {
        private final rqe a;

        q(e1 e1Var, String str, Integer num, String str2, a aVar) {
            rqe.b p = e1Var.a.p();
            je.u("video_playing", str, num, str2, p);
            p.f(Boolean.TRUE);
            this.a = p.d();
        }

        public mqe a() {
            mqe.b e = mqe.e();
            e.e(this.a);
            return (mqe) e.c();
        }
    }

    public b b(String str, Integer num, String str2) {
        return new b(this, str, num, str2, null);
    }

    public c c(String str, Integer num, String str2) {
        return new c(this, str, num, str2, null);
    }

    public d d(String str, Integer num, String str2) {
        return new d(this, str, num, str2, null);
    }

    public e e(String str) {
        return new e(this, str, null);
    }

    public f f(String str) {
        return new f(this, str, null);
    }

    public g g(String str) {
        return new g(this, str, null);
    }

    public h h(String str, Integer num, String str2) {
        return new h(this, str, num, str2, null);
    }

    public i i(String str, Integer num, String str2) {
        return new i(this, str, num, str2, null);
    }

    public j j(String str, Integer num, String str2) {
        return new j(this, str, num, str2, null);
    }

    public k k(String str, Integer num, String str2) {
        return new k(this, str, num, str2, null);
    }

    public l l(String str) {
        return new l(this, str, null);
    }

    public m m(String str, String str2) {
        return new m(this, str, str2, null);
    }

    public n n(String str) {
        return new n(this, str, null);
    }

    public o o() {
        return new o(this, null);
    }

    public p p(String str, Integer num, String str2) {
        return new p(this, str, num, str2, null);
    }

    public q q(String str, Integer num, String str2) {
        return new q(this, str, num, str2, null);
    }
}
