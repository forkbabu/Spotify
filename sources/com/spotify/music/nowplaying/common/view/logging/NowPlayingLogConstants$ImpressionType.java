package com.spotify.music.nowplaying.common.view.logging;

/* access modifiers changed from: package-private */
public enum NowPlayingLogConstants$ImpressionType {
    PAGE("page"),
    WIDGET("widget");
    
    private final String mStrValue;

    private NowPlayingLogConstants$ImpressionType(String str) {
        this.mStrValue = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mStrValue;
    }
}
