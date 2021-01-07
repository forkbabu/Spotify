package com.spotify.encore.consumer.components.artist.api.playlistcard;

import com.spotify.encore.ComponentConfiguration;

public interface PlaylistCardArtistConfiguration extends ComponentConfiguration {

    public static final class DefaultPlaylistCardArtistConfiguration implements PlaylistCardArtistConfiguration {
        public static final DefaultPlaylistCardArtistConfiguration INSTANCE = new DefaultPlaylistCardArtistConfiguration();

        private DefaultPlaylistCardArtistConfiguration() {
        }
    }
}
