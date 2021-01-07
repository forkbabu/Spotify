package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public final class PlayTrackQueueUtils {
    public static final String ITERATION_METADATA_KEY = "iteration";

    private PlayTrackQueueUtils() {
    }

    public static String getGloballyUniqueUid(PlayerTrack playerTrack) {
        if (playerTrack.uid().isEmpty()) {
            return playerTrack.uri() + playerTrack.provider();
        }
        return playerTrack.uid() + z42.s(playerTrack, "iteration");
    }
}
