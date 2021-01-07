package com.spotify.encore.consumer.components.album.api.trackrow;

import com.spotify.encore.ComponentConfiguration;

public interface TrackRowAlbumConfiguration extends ComponentConfiguration {

    public static final class DefaultTrackRowAlbumConfiguration implements TrackRowAlbumConfiguration {
        public static final DefaultTrackRowAlbumConfiguration INSTANCE = new DefaultTrackRowAlbumConfiguration();

        private DefaultTrackRowAlbumConfiguration() {
        }
    }
}
