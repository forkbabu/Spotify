package com.spotify.music.podcast.episode.util;

public interface DurationFormatter {

    public enum Format {
        SHORT_MINUTE_AND_SECOND,
        LONG_MINUTE_AND_SECOND,
        LONG_HOUR_AND_MINUTE
    }

    String a(Format format, int i);
}
