package com.spotify.music.nowplaying.core.util;

import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import java.util.List;

public class CoverArtFetcher {
    private final Picasso a;

    public enum CoverArtSize {
        REGULAR,
        LARGE
    }

    CoverArtFetcher(Picasso picasso) {
        this.a = picasso;
    }

    public void a(List<ContextTrack> list, CoverArtSize coverArtSize) {
        String str;
        for (ContextTrack contextTrack : list) {
            Picasso picasso = this.a;
            int ordinal = coverArtSize.ordinal();
            if (ordinal == 0) {
                str = kxd.c(contextTrack);
            } else if (ordinal == 1) {
                str = kxd.d(contextTrack);
            } else {
                throw new IllegalStateException("Unsupported cover art size: " + coverArtSize);
            }
            picasso.m(str).h(null);
        }
    }
}
