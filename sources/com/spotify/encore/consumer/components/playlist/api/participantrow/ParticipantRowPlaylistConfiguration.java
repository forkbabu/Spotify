package com.spotify.encore.consumer.components.playlist.api.participantrow;

import com.spotify.encore.ComponentConfiguration;
import kotlin.jvm.internal.f;

public abstract class ParticipantRowPlaylistConfiguration implements ComponentConfiguration {

    public static final class DefaultParticipantRowPlaylistConfiguration extends ParticipantRowPlaylistConfiguration {
        public static final DefaultParticipantRowPlaylistConfiguration INSTANCE = new DefaultParticipantRowPlaylistConfiguration();

        private DefaultParticipantRowPlaylistConfiguration() {
            super(null);
        }
    }

    private ParticipantRowPlaylistConfiguration() {
    }

    public /* synthetic */ ParticipantRowPlaylistConfiguration(f fVar) {
        this();
    }
}
