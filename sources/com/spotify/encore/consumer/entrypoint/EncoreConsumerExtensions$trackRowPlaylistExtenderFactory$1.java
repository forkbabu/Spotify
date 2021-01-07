package com.spotify.encore.consumer.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.encore.consumer.components.impl.trackrowplaylistextender.DefaultTrackRowPlaylistExtender;
import com.spotify.encore.consumer.components.impl.trackrowplaylistextender.DefaultTrackRowPlaylistExtenderViewBinder;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerExtensions$trackRowPlaylistExtenderFactory$1 implements ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_trackRowPlaylistExtenderFactory;

    EncoreConsumerExtensions$trackRowPlaylistExtenderFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_trackRowPlaylistExtenderFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<TrackRowPlaylistExtender.Model, Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    /* Return type fixed from 'com.spotify.encore.consumer.components.impl.trackrowplaylistextender.DefaultTrackRowPlaylistExtender' to match base method */
    @Override // com.spotify.encore.ComponentFactory
    public Component<TrackRowPlaylistExtender.Model, Events> make(ComponentConfiguration componentConfiguration) {
        return new DefaultTrackRowPlaylistExtender(new DefaultTrackRowPlaylistExtenderViewBinder(this.$this_trackRowPlaylistExtenderFactory.getActivity(), this.$this_trackRowPlaylistExtenderFactory.getPicasso()));
    }
}
