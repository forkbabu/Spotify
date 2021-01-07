package com.spotify.music.features.queue.logging;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.m3;

public class c implements erd {
    private final ere a;
    private final m3 b;
    private final InteractionLogger c;
    private final wlf<LegacyPlayerState> d;

    public c(ere ere, m3 m3Var, InteractionLogger interactionLogger, wlf<LegacyPlayerState> wlf) {
        ere.getClass();
        this.a = ere;
        this.b = m3Var;
        interactionLogger.getClass();
        this.c = interactionLogger;
        wlf.getClass();
        this.d = wlf;
    }

    private String a() {
        return PlayerStateUtil.getTrackUri(b());
    }

    private LegacyPlayerState b() {
        return this.d.get();
    }

    private void h(String str, QueueLogConstants$SectionId queueLogConstants$SectionId, QueueLogConstants$UserIntent queueLogConstants$UserIntent, InteractionLogger.InteractionType interactionType) {
        String str2;
        InteractionLogger interactionLogger = this.c;
        LegacyPlayerState b2 = b();
        if (b2 == null) {
            str2 = null;
        } else {
            str2 = b2.playbackId();
        }
        interactionLogger.c(str2, str, queueLogConstants$SectionId.toString(), 0, interactionType, queueLogConstants$UserIntent.toString());
    }

    public void c() {
        h(null, QueueLogConstants$SectionId.TRACKS, QueueLogConstants$UserIntent.ADD_TO_QUEUE, InteractionLogger.InteractionType.HIT);
        this.a.a(this.b.b().b().a(-1));
    }

    public void d() {
        h(null, QueueLogConstants$SectionId.BACK_BUTTON, QueueLogConstants$UserIntent.CLOSE, InteractionLogger.InteractionType.HIT);
    }

    public void e(int i) {
        this.a.a(this.b.e().b().a(Integer.valueOf(i)));
    }

    public void f() {
        this.a.a(this.b.f().b().a());
        h(null, QueueLogConstants$SectionId.CLOSE_BUTTON, QueueLogConstants$UserIntent.CLOSE, InteractionLogger.InteractionType.HIT);
    }

    public void g() {
        h(null, QueueLogConstants$SectionId.CONTENT, QueueLogConstants$UserIntent.SCROLL, InteractionLogger.InteractionType.SCROLL);
    }

    public void i() {
        this.a.a(this.b.c().e().a(a()));
        LegacyPlayerState b2 = b();
        String str = null;
        if (b2 != null) {
            PlayerTrack[] future = b2.future();
            if (future.length > 0) {
                str = future[0].uri();
            }
        }
        h(str, QueueLogConstants$SectionId.NEXT_BUTTON, QueueLogConstants$UserIntent.SKIP_TO_NEXT, InteractionLogger.InteractionType.HIT);
    }

    public void j(String str) {
        this.a.a(this.b.d().b(str).a(PageIdentifiers.NOWPLAYING.path()));
    }

    public void k(int i, String str) {
        this.a.a(this.b.e().c(Integer.valueOf(i), str).c(str));
    }

    public void l(boolean z) {
        String a2 = a();
        if (z) {
            this.a.a(this.b.c().b().b(a2));
        } else {
            this.a.a(this.b.c().b().a(a2));
        }
        h(a2, QueueLogConstants$SectionId.PLAY_BUTTON, z ? QueueLogConstants$UserIntent.PLAY : QueueLogConstants$UserIntent.PAUSE, InteractionLogger.InteractionType.HIT);
    }

    public void m() {
        this.a.a(this.b.c().f().a(a()));
        h(null, QueueLogConstants$SectionId.PREVIOUS_BUTTON, QueueLogConstants$UserIntent.SKIP_TO_PREVIOUS, InteractionLogger.InteractionType.HIT);
    }

    public void n() {
        h(null, QueueLogConstants$SectionId.TRACKS, QueueLogConstants$UserIntent.REMOVE_FROM_QUEUE, InteractionLogger.InteractionType.HIT);
        this.a.a(this.b.b().c().a(-1));
    }

    public void o(int i, String str) {
        h(str, QueueLogConstants$SectionId.TRACKS, QueueLogConstants$UserIntent.DESELECT_TRACK, InteractionLogger.InteractionType.HIT);
        this.a.a(this.b.e().c(Integer.valueOf(i), str).b(str));
    }

    public void p(int i, String str, boolean z, boolean z2) {
        QueueLogConstants$UserIntent queueLogConstants$UserIntent = QueueLogConstants$UserIntent.CHANGE_ORDER;
        InteractionLogger.InteractionType interactionType = InteractionLogger.InteractionType.DRAG;
        QueueLogConstants$SectionId queueLogConstants$SectionId = QueueLogConstants$SectionId.TRACKS;
        if (z) {
            if (z2) {
                h(null, queueLogConstants$SectionId, queueLogConstants$UserIntent, interactionType);
            } else {
                h(null, queueLogConstants$SectionId, QueueLogConstants$UserIntent.MOVE_TO_NEXT_FROM, interactionType);
            }
        } else if (z2) {
            h(null, queueLogConstants$SectionId, QueueLogConstants$UserIntent.MOVE_TO_UP_NEXT, interactionType);
        } else {
            h(null, queueLogConstants$SectionId, queueLogConstants$UserIntent, interactionType);
        }
        this.a.a(this.b.e().c(Integer.valueOf(i), str).a());
    }

    public void q(int i, String str) {
        h(str, QueueLogConstants$SectionId.TRACKS, QueueLogConstants$UserIntent.SELECT_TRACK, InteractionLogger.InteractionType.HIT);
        this.a.a(this.b.e().c(Integer.valueOf(i), str).d(str));
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.a(this.b.f().c().a(str));
        h(str, QueueLogConstants$SectionId.HEADER_CONTEXT_TITLE, QueueLogConstants$UserIntent.OPEN_PLAY_CONTEXT_PAGE, InteractionLogger.InteractionType.HIT);
    }
}
