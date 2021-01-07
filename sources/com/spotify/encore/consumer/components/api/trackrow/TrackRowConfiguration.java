package com.spotify.encore.consumer.components.api.trackrow;

import com.spotify.encore.ComponentConfiguration;

public interface TrackRowConfiguration extends ComponentConfiguration {

    public static final class DefaultTrackRowConfiguration implements TrackRowConfiguration {
        public static final DefaultTrackRowConfiguration INSTANCE = new DefaultTrackRowConfiguration();

        private DefaultTrackRowConfiguration() {
        }
    }
}
