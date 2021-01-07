package com.spotify.music.features.collectionartist;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.ubi.specification.factories.g0;

public class a0 {
    private final InteractionLogger a;
    private final g0 b;
    private final ere c;

    public a0(InteractionLogger interactionLogger, g0 g0Var, ere ere) {
        this.a = interactionLogger;
        this.b = g0Var;
        this.c = ere;
    }

    private void d(String str, boolean z) {
        this.a.b(str, "follow-button", -1, InteractionLogger.InteractionType.HIT, z ? "follow" : "unfollow", z ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW);
    }

    public void a(String str, boolean z) {
        nqe nqe;
        if (z) {
            nqe = this.b.d().c(str).a(str);
        } else {
            nqe = this.b.d().c(str).b(str);
        }
        this.c.a(nqe);
    }

    public void b(String str) {
        this.c.a(this.b.b(str).a());
    }

    public void c(String str) {
        this.c.a(this.b.c().b(str).a(str));
        d(str, true);
    }

    public void e(ContextMenuEvent contextMenuEvent, String str) {
        this.a.a(str, "toolbar-menu", -1, InteractionLogger.InteractionType.HIT, contextMenuEvent.toString());
    }

    public void f(String str, int i, long j) {
        this.c.a(this.b.d().b(Integer.valueOf(i), str).a(str));
        this.a.a(str, "album", (int) j, InteractionLogger.InteractionType.HIT, "navigate-forward");
    }

    public String g(String str, int i, long j) {
        nqe a2 = this.b.d().d(Integer.valueOf(i), str).a(str);
        this.c.a(a2);
        this.a.a(str, AppProtocol.TrackData.TYPE_TRACK, (int) j, InteractionLogger.InteractionType.HIT, "play");
        return a2.b();
    }

    public String h(String str) {
        nqe a2 = this.b.c().c(str).a(str);
        this.c.a(a2);
        this.a.a(null, "shuffle-play-button", -1, InteractionLogger.InteractionType.HIT, "shuffle-play");
        return a2.b();
    }

    public void i(String str) {
        this.c.a(this.b.c().b(str).b(str));
        d(str, false);
    }
}
