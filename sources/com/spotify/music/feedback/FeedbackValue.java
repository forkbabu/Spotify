package com.spotify.music.feedback;

import com.spotify.music.features.ads.model.Ad;

public enum FeedbackValue {
    ON("1"),
    OFF(Ad.DEFAULT_SKIPPABLE_AD_DELAY),
    UNDEFINED(null);
    
    final String mFeedbackValue;

    private FeedbackValue(String str) {
        this.mFeedbackValue = str;
    }

    public static FeedbackValue d(String str) {
        FeedbackValue feedbackValue = ON;
        if (feedbackValue.mFeedbackValue.equals(str)) {
            return feedbackValue;
        }
        FeedbackValue feedbackValue2 = OFF;
        if (feedbackValue2.mFeedbackValue.equals(str)) {
            return feedbackValue2;
        }
        return UNDEFINED;
    }
}
