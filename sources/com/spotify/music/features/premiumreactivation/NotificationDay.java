package com.spotify.music.features.premiumreactivation;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

public enum NotificationDay {
    ONE_DAY("one_day_ahead_shown_key"),
    THREE_DAYS("three_days_ahead_shown_key"),
    FIVE_DAYS("five_days_ahead_shown_key");
    
    private final SpSharedPreferences.b<Object, Boolean> mPreferenceKey;

    private NotificationDay(String str) {
        this.mPreferenceKey = SpSharedPreferences.b.e(str);
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.mPreferenceKey.a();
    }

    public SpSharedPreferences.b<Object, Boolean> g() {
        return this.mPreferenceKey;
    }
}
