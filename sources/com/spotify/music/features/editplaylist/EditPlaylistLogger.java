package com.spotify.music.features.editplaylist;

import com.spotify.instrumentation.a;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.w0;

public class EditPlaylistLogger {
    private final InteractionLogger a;
    private final ere b;
    private final w0 c;
    private final String d;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        CLOSE("close"),
        SAVE("save"),
        REMOVE("remove"),
        UNDO("undo"),
        CANCEL("cancel"),
        DISCARD("discard"),
        NAME_CHANGE("name-change"),
        DESCRIPTION_CHANGE("description-change"),
        PICTURE_CHANGE("picture-change"),
        MOVE("move"),
        BACK_NAVIGATION("back-navigation");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public EditPlaylistLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, a aVar, tx4 tx4, ere ere) {
        this.a = interactionLogger;
        this.b = ere;
        String a2 = tx4.a();
        this.d = a2;
        this.c = new w0(aVar.path(), a2);
    }

    private void i(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.a.a(null, str2, i, interactionType, userIntent.toString());
    }

    public void a(boolean z) {
        nqe nqe;
        i(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION);
        ere ere = this.b;
        if (z) {
            nqe = this.c.b().b();
        } else {
            nqe = this.c.b().a();
        }
        ere.a(nqe);
    }

    public void b() {
        i(null, "discard-changes-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.CANCEL);
        this.b.a(this.c.c().a());
    }

    public void c() {
        this.b.a(this.c.d().b().a());
    }

    public void d() {
        this.b.a(this.c.d().c().a());
    }

    public void e(boolean z) {
        nqe nqe;
        i(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, UserIntent.CLOSE);
        ere ere = this.b;
        if (z) {
            nqe = this.c.e().b();
        } else {
            nqe = this.c.e().a();
        }
        ere.a(nqe);
    }

    public void f() {
        i(null, "header", 0, InteractionLogger.InteractionType.HIT, UserIntent.PICTURE_CHANGE);
        this.b.a(this.c.f().a());
    }

    public void g() {
        i(null, "discard-changes-dialog", 0, InteractionLogger.InteractionType.HIT, UserIntent.DISCARD);
        this.b.a(this.c.h().a());
    }

    public void h() {
        this.b.a(this.c.i().e().a());
    }

    public void j(String str) {
        i(null, "items", 0, InteractionLogger.InteractionType.HIT, UserIntent.MOVE);
        this.b.a(this.c.j(str).b());
    }

    public void k() {
        i(null, "header", 0, InteractionLogger.InteractionType.HIT, UserIntent.DESCRIPTION_CHANGE);
        this.b.a(this.c.g().a(this.d));
    }

    public void l() {
        i(null, "header", 0, InteractionLogger.InteractionType.HIT, UserIntent.NAME_CHANGE);
        this.b.a(this.c.k().a(this.d));
    }

    public void m() {
        this.b.a(this.c.d().d().a());
    }

    public void n(String str) {
        i(null, "items", 0, InteractionLogger.InteractionType.HIT, UserIntent.REMOVE);
        this.b.a(this.c.j(str).c().a(str));
    }

    public void o() {
        this.b.a(this.c.i().b().a());
    }

    public void p() {
        this.b.a(this.c.i().d().a());
    }

    public void q() {
        i(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, UserIntent.SAVE);
        this.b.a(this.c.l().a());
    }

    public void r() {
        this.b.a(this.c.i().c());
    }

    public void s() {
        this.b.a(this.c.d().e().a());
    }

    public void t() {
        i(null, "item-removed-toast", 0, InteractionLogger.InteractionType.HIT, UserIntent.UNDO);
        this.b.a(this.c.m().a());
    }
}
