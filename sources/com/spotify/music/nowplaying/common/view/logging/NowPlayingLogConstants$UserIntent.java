package com.spotify.music.nowplaying.common.view.logging;

import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public enum NowPlayingLogConstants$UserIntent {
    ADD_FEEDBACK("add_feedback"),
    CLOSE("close"),
    OPEN_ALBUM("open_album"),
    OPEN_ARTIST("open_artist"),
    OPEN_CONNECT("open_connect"),
    OPEN_CONTEXT_MENU("open_context_menu"),
    OPEN_IMMERSIVE_LYRICS("open_immersive_lyrics"),
    OPEN_PLAY_CONTEXT_PAGE("open_play_context_page"),
    OPEN_QUEUE("open_queue"),
    OPEN_SLEEP_TIMER_MENU("open_sleep_timer_menu"),
    OPEN_SPEED_CONTROL_MENU("open_speed_control_menu"),
    PAUSE(ContextTrack.TrackAction.PAUSE),
    PLAY("play"),
    REMOVE_FEEDBACK("remove_feedback"),
    REPEAT_CONTEXT("repeat_context"),
    REPEAT_DISABLED("repeat_disabled"),
    REPEAT_ONE_TRACK("repeat_one_track"),
    SAVE("save"),
    SCROLL("scroll"),
    SEEK("seek"),
    SHARE("share"),
    SHUFFLE_DISABLED("shuffle_disabled"),
    SHUFFLE_ENABLED("shuffle_enabled"),
    SKIP_TO_NEXT("skip_to_next"),
    SKIP_TO_PREVIOUS("skip_to_previous"),
    UNSAVE("unsave");
    
    private final String mStrValue;

    private NowPlayingLogConstants$UserIntent(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
