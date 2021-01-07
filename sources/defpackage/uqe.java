package defpackage;

import com.spotify.player.model.ContextTrack;
import defpackage.mqe;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

/* renamed from: uqe  reason: default package */
public final class uqe {
    private final rqe a;

    /* renamed from: uqe$b */
    public final class b {
        private final String a;

        b(String str, a aVar) {
            this.a = str;
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            nqe.b bVar = f;
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("clear_recent_searches");
            b2.e(1);
            bVar.h(b2.a());
            return (nqe) bVar.c();
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("download");
            b2.e(1);
            return (nqe) je.R(b2, "item_to_download", str, f);
        }

        public nqe c(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c(ContextTrack.TrackAction.PAUSE);
            b2.e(1);
            return (nqe) je.R(b2, "item_to_be_paused", str, f);
        }

        public nqe d(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("play");
            b2.e(1);
            return (nqe) je.R(b2, "item_to_be_played", str, f);
        }

        public nqe e(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("remove_download");
            b2.e(1);
            return (nqe) je.R(b2, "item_to_remove_from_downloads", str, f);
        }

        public nqe f(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c(ContextTrack.TrackAction.RESUME);
            b2.e(1);
            return (nqe) je.R(b2, "item_to_be_resumed", str, f);
        }

        public nqe g() {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            nqe.b bVar = f;
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("retry");
            b2.e(1);
            bVar.h(b2.a());
            return (nqe) bVar.c();
        }

        public nqe h(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("shuffle_play");
            b2.e(1);
            return (nqe) je.R(b2, "context_to_be_played", str, f);
        }

        public nqe i(String str) {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("ui_navigate");
            b2.e(1);
            return (nqe) je.R(b2, "destination", str, f);
        }

        public nqe j() {
            nqe.b f = nqe.f();
            f.e(uqe.this.a);
            nqe.b bVar = f;
            qqe.b b2 = qqe.b();
            b2.b(this.a);
            b2.c("ui_reveal");
            b2.e(1);
            bVar.h(b2.a());
            return (nqe) bVar.c();
        }
    }

    private uqe(rqe rqe) {
        this.a = rqe;
    }

    public static uqe b(rqe.b bVar) {
        bVar.getClass();
        return new uqe(bVar.d());
    }

    public b c() {
        return new b("hit", null);
    }

    public mqe d() {
        mqe.b e = mqe.e();
        e.e(this.a);
        return (mqe) e.c();
    }

    public b e() {
        return new b("long_hit", null);
    }

    public b f() {
        return new b("", null);
    }
}
