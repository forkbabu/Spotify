package com.spotify.music.nowplaying.common.view.logging;

/* access modifiers changed from: package-private */
public enum NowPlayingLogConstants$SectionId {
    ARTIST_NAME("artist_name"),
    BACKGROUND("background"),
    BACK_BUTTON("back_button"),
    BAN_BUTTON("ban_button"),
    CAROUSEL("carousel"),
    CLOSE_BUTTON("close_button"),
    CONNECT_BUTTON("connect_button"),
    CONTEXT_MENU("context_menu"),
    CONTEXT_MENU_BUTTON("context_menu_button"),
    HEADER_CONTEXT_TITLE("header_context_title"),
    HEART_BUTTON("heart_button"),
    NEXT_BUTTON("next_button"),
    PLAY_BUTTON("play_button"),
    PREVIOUS_BUTTON("previous_button"),
    QUEUE_BUTTON("queue_button"),
    REPEAT_BUTTON("repeat_button"),
    SAVE_BUTTON("save_button"),
    SCROLL("scroll"),
    SEEK_BACKWARD_BUTTON("seek_backward_button"),
    SEEK_BAR("seek_bar"),
    SEEK_FORWARD_BUTTON("seek_forward_button"),
    SHARE_BUTTON("share_button"),
    SHUFFLE_BUTTON("shuffle_button"),
    SLEEP_TIMER_BUTTON("sleep_timer_button"),
    SPEED_CONTROL_BUTTON("speed_control_button"),
    TRACK_TITLE("track_title");
    
    private final String mStrValue;

    private NowPlayingLogConstants$SectionId(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
