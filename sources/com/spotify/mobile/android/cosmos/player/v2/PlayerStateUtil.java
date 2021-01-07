package com.spotify.mobile.android.cosmos.player.v2;

public final class PlayerStateUtil {
    private PlayerStateUtil() {
    }

    public static String getTrackUri(LegacyPlayerState legacyPlayerState) {
        PlayerTrack track = legacyPlayerState != null ? legacyPlayerState.track() : null;
        return track != null ? track.uri() : "";
    }
}
