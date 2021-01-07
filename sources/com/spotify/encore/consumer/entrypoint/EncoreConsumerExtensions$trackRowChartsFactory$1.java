package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowChartsConfiguration;
import com.spotify.encore.consumer.components.impl.trackrowcharts.DefaultTrackRowCharts;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$trackRowChartsFactory$1 implements ComponentFactory<Component<TrackRowCharts.Model, TrackRowCharts.Events>, TrackRowChartsConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_trackRowChartsFactory;

    EncoreConsumerExtensions$trackRowChartsFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_trackRowChartsFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<TrackRowCharts.Model, TrackRowCharts.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultTrackRowCharts make(TrackRowChartsConfiguration trackRowChartsConfiguration) {
        return new DefaultTrackRowCharts(this.$this_trackRowChartsFactory.getActivity(), this.$this_trackRowChartsFactory.getPicasso());
    }
}
