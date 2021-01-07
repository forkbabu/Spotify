package com.spotify.music.features.languagepicker.logger;

enum LogInfo$UserIntent {
    NAVIGATE_FORWARD("navigate-forward"),
    RETRY("retry"),
    SELECT("select-enable"),
    DESELECT("select-disable"),
    DISMISS("dismiss"),
    BACK_BUTTON("device-back-button"),
    SCROLL("scroll");
    
    private final String mStrValue;

    private LogInfo$UserIntent(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
