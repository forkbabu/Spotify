package com.spotify.music.podcastentityrow;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.h;

public interface w {

    public static final class a {
        private final PlayerContext a;
        private final PlayOptions b;

        public a(PlayerContext playerContext, PlayOptions playOptions) {
            h.e(playerContext, "playerContext");
            h.e(playOptions, "playOptions");
            this.a = playerContext;
            this.b = playOptions;
        }

        public final PlayOptions a() {
            return this.b;
        }

        public final PlayerContext b() {
            return this.a;
        }
    }

    a a(String str, int i, Episode[] episodeArr);
}
