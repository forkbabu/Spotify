package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class a3 {
    private final rqe a;

    public final class b {
        private final rqe a;

        public final class a {
            private final rqe a;

            a(b bVar, a aVar) {
                rqe.b p = bVar.a.p();
                je.l("mark_as_played_button", p);
                p.f(Boolean.FALSE);
                this.a = p.d();
            }

            public nqe a() {
                nqe.b f = nqe.f();
                f.e(this.a);
                return (nqe) je.S("ui_hide", 1, "hit", f);
            }
        }

        b(a3 a3Var, Integer num, String str, a aVar) {
            rqe.b p = a3Var.a.p();
            je.o("unfinished_episode_card_container", num, str, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, ContextTrack.TrackAction.PAUSE, 1, "hit"), "item_to_be_paused", str, f);
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            return (nqe) je.R(je.T(f, this.a, "play", 1, "hit"), "item_to_be_played", str, f);
        }

        public a d() {
            return new a(this, null);
        }
    }

    public a3(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-unfinished-episode-card");
        e.m("0.1.0");
        e.j(str);
        this.a = e.d();
    }

    public b b(Integer num, String str) {
        return new b(this, num, str, null);
    }
}
