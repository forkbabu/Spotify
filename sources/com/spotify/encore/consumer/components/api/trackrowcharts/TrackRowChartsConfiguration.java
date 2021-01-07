package com.spotify.encore.consumer.components.api.trackrowcharts;

import com.spotify.encore.ComponentConfiguration;

public interface TrackRowChartsConfiguration extends ComponentConfiguration {

    public static final class DefaultTrackRowChartsConfiguration implements TrackRowChartsConfiguration {
        public static final DefaultTrackRowChartsConfiguration INSTANCE = new DefaultTrackRowChartsConfiguration();

        private DefaultTrackRowChartsConfiguration() {
        }
    }
}
