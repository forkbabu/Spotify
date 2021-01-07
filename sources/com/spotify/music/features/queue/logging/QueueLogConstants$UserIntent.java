package com.spotify.music.features.queue.logging;

import com.spotify.player.model.ContextTrack;

/* access modifiers changed from: package-private */
public enum QueueLogConstants$UserIntent {
    ADD_TO_QUEUE("add_to_queue"),
    CHANGE_ORDER("change_order"),
    CLOSE("close"),
    DESELECT_TRACK("deselect_track"),
    MOVE_TO_NEXT_FROM("move_to_next_from"),
    MOVE_TO_UP_NEXT("move_to_up_next"),
    OPEN_PLAY_CONTEXT_PAGE("open_play_context_page"),
    PAUSE(ContextTrack.TrackAction.PAUSE),
    PLAY("play"),
    REMOVE_FROM_QUEUE("remove_from_queue"),
    SCROLL("scroll"),
    SELECT_TRACK("select_track"),
    SKIP_TO_NEXT("skip_to_next"),
    SKIP_TO_PREVIOUS("skip_to_previous");
    
    private final String mStrValue;

    private QueueLogConstants$UserIntent(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
