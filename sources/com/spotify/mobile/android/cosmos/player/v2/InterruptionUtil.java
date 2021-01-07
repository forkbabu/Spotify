package com.spotify.mobile.android.cosmos.player.v2;

public final class InterruptionUtil {
    public static final String INTERRUPTION_PREFIX = "spotify:interruption:";

    private InterruptionUtil() {
    }

    public static boolean isInterruptionUri(String str) {
        return str.startsWith(INTERRUPTION_PREFIX);
    }
}
