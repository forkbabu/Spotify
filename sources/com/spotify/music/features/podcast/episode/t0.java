package com.spotify.music.features.podcast.episode;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

public final class t0 {
    public static String a(PlayerState playerState) {
        Optional<ContextTrack> track = playerState.track();
        if (track.isPresent()) {
            String str = track.get().metadata().get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
            if (str == null) {
                Logger.n(" [parent_episode.uri] key missing for track [%s]", track.get().uri());
                return "";
            }
            Logger.g(" [parent_episode.uri] for track [%s] is [%s]", track.get().uri(), str);
            return str;
        }
        Logger.n("PlayerState has no current track", new Object[0]);
        return "";
    }
}
