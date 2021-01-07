package com.spotify.music.features.chart.model;

public enum ChartEntryStatus {
    UNKNOWN,
    UP,
    DOWN,
    NEW,
    EQUAL;

    static {
        values();
    }
}
