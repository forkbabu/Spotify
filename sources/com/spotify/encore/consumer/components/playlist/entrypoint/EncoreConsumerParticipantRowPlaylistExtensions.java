package com.spotify.encore.consumer.components.playlist.entrypoint;

import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.DaggerPlaylistEncoreConsumerComponent;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerParticipantRowPlaylistExtensions {
    public static final ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> participantRowPlaylistFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$participantRowPlaylistFactory");
        return DaggerPlaylistEncoreConsumerComponent.factory().create(rows.getActivity(), rows.getPicasso()).participantRowPlaylistFactory();
    }
}
