package org.slf4j.event;

import com.spotify.voiceassistant.player.models.SearchResponse;

public enum Level {
    ERROR(40, SearchResponse.RESULT_ERROR),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    
    private int levelInt;
    private String levelStr;

    private Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.levelStr;
    }
}
