package com.spotify.music.nowplaying.common.view.logging;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.player.options.RepeatMode;

public class c {
    private final InteractionLogger a;
    private final wlf<LegacyPlayerState> b;
    private final String c;

    public c(InteractionLogger interactionLogger, wlf<LegacyPlayerState> wlf, String str) {
        interactionLogger.getClass();
        this.a = interactionLogger;
        wlf.getClass();
        this.b = wlf;
        str.getClass();
        this.c = str;
    }

    private LegacyPlayerState a() {
        return this.b.get();
    }

    private static NowPlayingLogConstants$UserIntent b(RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return NowPlayingLogConstants$UserIntent.REPEAT_DISABLED;
        }
        if (ordinal == 1) {
            return NowPlayingLogConstants$UserIntent.REPEAT_CONTEXT;
        }
        if (ordinal == 2) {
            return NowPlayingLogConstants$UserIntent.REPEAT_ONE_TRACK;
        }
        throw new IllegalArgumentException("Unsupported RepeatMode " + repeatMode);
    }

    private void l(String str, NowPlayingLogConstants$SectionId nowPlayingLogConstants$SectionId, NowPlayingLogConstants$UserIntent nowPlayingLogConstants$UserIntent, InteractionLogger.InteractionType interactionType, boolean z, InteractionAction interactionAction) {
        String str2;
        String str3;
        InteractionLogger interactionLogger = this.a;
        LegacyPlayerState a2 = a();
        if (a2 == null) {
            str2 = null;
        } else {
            str2 = a2.playbackId();
        }
        if (z) {
            str3 = je.I0(new StringBuilder(), this.c, nowPlayingLogConstants$SectionId.toString());
        } else {
            str3 = nowPlayingLogConstants$SectionId.toString();
        }
        interactionLogger.d(str2, str, str3, 0, interactionType, nowPlayingLogConstants$UserIntent.toString(), interactionAction);
    }

    private void m(String str, NowPlayingLogConstants$SectionId nowPlayingLogConstants$SectionId, NowPlayingLogConstants$UserIntent nowPlayingLogConstants$UserIntent, InteractionLogger.InteractionType interactionType) {
        l(str, nowPlayingLogConstants$SectionId, nowPlayingLogConstants$UserIntent, interactionType, true, null);
    }

    public void A(String str) {
        m(str, NowPlayingLogConstants$SectionId.SPEED_CONTROL_BUTTON, NowPlayingLogConstants$UserIntent.OPEN_SPEED_CONTROL_MENU, InteractionLogger.InteractionType.HIT);
    }

    public void B(String str) {
        m(str, NowPlayingLogConstants$SectionId.HEADER_CONTEXT_TITLE, NowPlayingLogConstants$UserIntent.OPEN_PLAY_CONTEXT_PAGE, InteractionLogger.InteractionType.HIT);
    }

    public void C(String str) {
        m(str, NowPlayingLogConstants$SectionId.ARTIST_NAME, NowPlayingLogConstants$UserIntent.OPEN_ARTIST, InteractionLogger.InteractionType.HIT);
    }

    public void D(String str) {
        m(str, NowPlayingLogConstants$SectionId.TRACK_TITLE, NowPlayingLogConstants$UserIntent.OPEN_ALBUM, InteractionLogger.InteractionType.HIT);
    }

    public void c(String str, boolean z) {
        m(str, NowPlayingLogConstants$SectionId.BAN_BUTTON, z ? NowPlayingLogConstants$UserIntent.REMOVE_FEEDBACK : NowPlayingLogConstants$UserIntent.ADD_FEEDBACK, InteractionLogger.InteractionType.HIT);
    }

    public void d(String str) {
        m(str, NowPlayingLogConstants$SectionId.CAROUSEL, NowPlayingLogConstants$UserIntent.SKIP_TO_NEXT, InteractionLogger.InteractionType.SWIPE_LEFT);
    }

    public void e(String str) {
        m(str, NowPlayingLogConstants$SectionId.CAROUSEL, NowPlayingLogConstants$UserIntent.SKIP_TO_PREVIOUS, InteractionLogger.InteractionType.SWIPE_RIGHT);
    }

    public void f() {
        m(null, NowPlayingLogConstants$SectionId.CLOSE_BUTTON, NowPlayingLogConstants$UserIntent.CLOSE, InteractionLogger.InteractionType.HIT);
    }

    public void g() {
        m(null, NowPlayingLogConstants$SectionId.CONNECT_BUTTON, NowPlayingLogConstants$UserIntent.OPEN_CONNECT, InteractionLogger.InteractionType.HIT);
    }

    public void h() {
        m(isb.a(a()), NowPlayingLogConstants$SectionId.CONTEXT_MENU_BUTTON, NowPlayingLogConstants$UserIntent.OPEN_CONTEXT_MENU, InteractionLogger.InteractionType.HIT);
    }

    public void i(RepeatMode repeatMode) {
        l(isb.a(a()), NowPlayingLogConstants$SectionId.CONTEXT_MENU, b(repeatMode), InteractionLogger.InteractionType.HIT, false, null);
    }

    public void j(boolean z) {
        l(isb.a(a()), NowPlayingLogConstants$SectionId.CONTEXT_MENU, z ? NowPlayingLogConstants$UserIntent.SHUFFLE_DISABLED : NowPlayingLogConstants$UserIntent.SHUFFLE_ENABLED, InteractionLogger.InteractionType.HIT, false, null);
    }

    public void k(String str, boolean z) {
        l(str, NowPlayingLogConstants$SectionId.HEART_BUTTON, z ? NowPlayingLogConstants$UserIntent.REMOVE_FEEDBACK : NowPlayingLogConstants$UserIntent.ADD_FEEDBACK, InteractionLogger.InteractionType.HIT, true, z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
    }

    public void n(String str) {
        m(str, NowPlayingLogConstants$SectionId.NEXT_BUTTON, NowPlayingLogConstants$UserIntent.SKIP_TO_NEXT, InteractionLogger.InteractionType.HIT);
    }

    public void o(String str) {
        m(str, NowPlayingLogConstants$SectionId.PLAY_BUTTON, NowPlayingLogConstants$UserIntent.PAUSE, InteractionLogger.InteractionType.HIT);
    }

    public void p(String str) {
        m(str, NowPlayingLogConstants$SectionId.PLAY_BUTTON, NowPlayingLogConstants$UserIntent.PLAY, InteractionLogger.InteractionType.HIT);
    }

    public void q() {
        m(null, NowPlayingLogConstants$SectionId.PREVIOUS_BUTTON, NowPlayingLogConstants$UserIntent.SKIP_TO_PREVIOUS, InteractionLogger.InteractionType.HIT);
    }

    public void r() {
        m(null, NowPlayingLogConstants$SectionId.QUEUE_BUTTON, NowPlayingLogConstants$UserIntent.OPEN_QUEUE, InteractionLogger.InteractionType.HIT);
    }

    public void s(String str, RepeatMode repeatMode) {
        m(str, NowPlayingLogConstants$SectionId.REPEAT_BUTTON, b(repeatMode), InteractionLogger.InteractionType.HIT);
    }

    public void t() {
        m(isb.a(a()), NowPlayingLogConstants$SectionId.SCROLL, NowPlayingLogConstants$UserIntent.SCROLL, InteractionLogger.InteractionType.SCROLL);
    }

    public void u(String str) {
        m(str, NowPlayingLogConstants$SectionId.SEEK_BACKWARD_BUTTON, NowPlayingLogConstants$UserIntent.SEEK, InteractionLogger.InteractionType.HIT);
    }

    public void v(String str) {
        m(str, NowPlayingLogConstants$SectionId.SEEK_FORWARD_BUTTON, NowPlayingLogConstants$UserIntent.SEEK, InteractionLogger.InteractionType.HIT);
    }

    public void w(String str) {
        m(str, NowPlayingLogConstants$SectionId.SEEK_BAR, NowPlayingLogConstants$UserIntent.SEEK, InteractionLogger.InteractionType.DRAG);
    }

    public void x() {
        m(isb.a(a()), NowPlayingLogConstants$SectionId.SHARE_BUTTON, NowPlayingLogConstants$UserIntent.SHARE, InteractionLogger.InteractionType.HIT);
    }

    public void y(String str, boolean z) {
        m(str, NowPlayingLogConstants$SectionId.SHUFFLE_BUTTON, z ? NowPlayingLogConstants$UserIntent.SHUFFLE_DISABLED : NowPlayingLogConstants$UserIntent.SHUFFLE_ENABLED, InteractionLogger.InteractionType.HIT);
    }

    public void z(String str) {
        m(str, NowPlayingLogConstants$SectionId.SLEEP_TIMER_BUTTON, NowPlayingLogConstants$UserIntent.OPEN_SLEEP_TIMER_MENU, InteractionLogger.InteractionType.HIT);
    }
}
