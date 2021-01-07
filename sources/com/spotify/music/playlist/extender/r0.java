package com.spotify.music.playlist.extender;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;

public final class r0 implements fjf<ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public r0(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> trackRowPlaylistExtenderFactory = EncoreConsumerExtensions.trackRowPlaylistExtenderFactory(this.a.get().getRows());
        yif.g(trackRowPlaylistExtenderFactory, "Cannot return null from a non-@Nullable @Provides method");
        return trackRowPlaylistExtenderFactory;
    }
}
