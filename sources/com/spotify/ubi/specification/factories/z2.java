package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class z2 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(z2 z2Var, a aVar) {
            rqe.b p = z2Var.a.p();
            je.l("playback_speed_x", p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(String str, Integer num) {
            nqe.b f = nqe.f();
            if (num.intValue() < 0) {
                f.g("Input parameter is negative");
            }
            f.e(this.a);
            nqe.b bVar = f;
            qqe.b b = qqe.b();
            b.c("set_playback_speed");
            b.e(1);
            b.b("hit");
            b.d("currently_played_item", str);
            b.d(ContextTrack.Metadata.KEY_PLAYBACK_SPEED, num);
            bVar.h(b.a());
            return (nqe) bVar.c();
        }
    }

    public z2(String str) {
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-podcast-speed-control");
        e.m("6.0.1");
        e.j(str);
        this.a = e.d();
    }

    public b b() {
        return new b(this, null);
    }
}
