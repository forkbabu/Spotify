package com.spotify.music.spotlets.radio.model;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public enum ThumbState {
    NONE("none", "none", FeedbackState.NONE),
    UP(PlayerTrack.TRACK_THUMB_STATE_UP, "ups", FeedbackState.POSITIVE),
    DOWN(PlayerTrack.TRACK_THUMB_STATE_DOWN, "downs", FeedbackState.NEGATIVE);
    
    private final String mApolloValue;
    private final FeedbackState mFeedbackState;
    private final String mPlayerValue;

    private ThumbState(String str, String str2, FeedbackState feedbackState) {
        this.mPlayerValue = str;
        this.mApolloValue = str2;
        this.mFeedbackState = feedbackState;
    }

    public static ThumbState d(String str) {
        ThumbState thumbState = UP;
        if (thumbState.mPlayerValue.equals(str)) {
            return thumbState;
        }
        ThumbState thumbState2 = DOWN;
        if (thumbState2.mPlayerValue.equals(str)) {
            return thumbState2;
        }
        return NONE;
    }
}
