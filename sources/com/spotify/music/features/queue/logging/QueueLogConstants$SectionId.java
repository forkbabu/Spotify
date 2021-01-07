package com.spotify.music.features.queue.logging;

/* access modifiers changed from: package-private */
public enum QueueLogConstants$SectionId {
    BACK_BUTTON("back_button"),
    CLOSE_BUTTON("close_button"),
    CONTENT("content"),
    HEADER_CONTEXT_TITLE("header_context_title"),
    NEXT_BUTTON("next_button"),
    PLAY_BUTTON("play_button"),
    PREVIOUS_BUTTON("previous_button"),
    TRACKS("tracks");
    
    private final String mStrValue;

    private QueueLogConstants$SectionId(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
