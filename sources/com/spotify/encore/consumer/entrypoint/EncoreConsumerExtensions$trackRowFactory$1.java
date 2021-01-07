package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.components.api.trackrow.TrackRowConfiguration;
import com.spotify.encore.consumer.components.impl.trackrow.DefaultTrackRow;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$trackRowFactory$1 implements ComponentFactory<Component<TrackRow.Model, TrackRow.Events>, TrackRowConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_trackRowFactory;

    EncoreConsumerExtensions$trackRowFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_trackRowFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<TrackRow.Model, TrackRow.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultTrackRow make(TrackRowConfiguration trackRowConfiguration) {
        return new DefaultTrackRow(this.$this_trackRowFactory.getActivity(), this.$this_trackRowFactory.getPicasso());
    }
}
