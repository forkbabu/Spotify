package com.spotify.ubi.specification.factories;

import com.spotify.player.model.ContextTrack;
import defpackage.nqe;
import defpackage.rqe;

public final class v4 {
    private final rqe a;

    public final class b {
        private final rqe a;

        b(v4 v4Var, a aVar) {
            rqe.b p = v4Var.a.p();
            je.l("heart_button", p);
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

    public final class c {
        private final rqe a;

        c(v4 v4Var, a aVar) {
            rqe.b p = v4Var.a.p();
            je.l("play_button", p);
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
            bVar.h(je.W(ContextTrack.TrackAction.RESUME, 1, "hit", "item_to_be_resumed", str));
            return (nqe) bVar.c();
        }
    }

    public v4(String str, String str2) {
        this.a = je.Y("music", "now-playing-bar", "0.0.9", str, str2);
    }

    public b b() {
        return new b(this, null);
    }

    public nqe c() {
        nqe.b f = nqe.f();
        f.e(this.a);
        return (nqe) je.S("ui_reveal", 1, "hit", f);
    }

    public c d() {
        return new c(this, null);
    }

    public nqe e(String str) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.W("skip_to_next", 1, "swipe", "item_to_be_skipped", str));
        return (nqe) bVar.c();
    }

    public nqe f(String str) {
        nqe.b f = nqe.f();
        f.e(this.a);
        nqe.b bVar = f;
        bVar.h(je.W("skip_to_previous", 1, "swipe", "item_to_be_skipped", str));
        return (nqe) bVar.c();
    }
}
