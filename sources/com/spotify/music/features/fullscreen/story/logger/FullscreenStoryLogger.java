package com.spotify.music.features.fullscreen.story.logger;

import com.spotify.music.libs.fullscreen.story.domain.k;

public interface FullscreenStoryLogger {

    public enum Impression {
        VIDEO_PLAYING("video-playing"),
        AUDIO_PLAYING("audio-playing"),
        STORY_VIEW_SHOWN("story-shown"),
        ENTIRE_STORY_SHOWN("entire-story-shown"),
        STORY_FETCHED("story-fetched"),
        STORY_FETCHING_FAILED("story-fetching-failed"),
        OBSERVE_COLLECTION_STATE_FAILED("observe-collection-state-failed"),
        EMPTY_STORY("empty-story"),
        EMPTY_CHAPTER("empty-chapter"),
        PLAYBACK_ERROR("playback-error"),
        STORY_PARSING_FAILED("story-parsing-failed");
        
        private final String mStrValue;

        private Impression(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public enum Interaction {
        NEXT_CHAPTER("next-chapter"),
        PREVIOUS_CHAPTER("previous-chapter"),
        CLOSE("close"),
        CONTEXT_PLAYER("context-player"),
        BACK_BUTTON("back-button"),
        HEART_BUTTON("heart-button"),
        FOLLOW_BUTTON("follow-button"),
        TRACK_CONTEXT_MENU_BUTTON("track-context-menu-button"),
        VIDEO_CONTEXT_MENU_BUTTON("video-context-menu-button"),
        TRACK_OVERLAY_BUTTON("track-overlay-button"),
        PLAYLIST_COVER("playlist-cover");
        
        private final String mStrValue;

        private Interaction(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        NAVIGATE_FORWARD("navigate-forward"),
        NAVIGATE_BACKWARD("navigate-backward"),
        DISMISS("dismiss"),
        HEARTED("hearted"),
        UNHEARTED("unhearted"),
        FOLLOWED("followed"),
        UNFOLLOWED("unfollowed"),
        PLAY("play"),
        MORE("more");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    void a(k kVar);
}
