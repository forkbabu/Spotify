package com.spotify.encore.consumer.components.playlist;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylist;
import com.spotify.encore.consumer.components.playlist.api.participantrow.ParticipantRowPlaylistConfiguration;
import com.squareup.picasso.Picasso;

public interface PlaylistEncoreConsumerComponent {

    public interface Factory {
        PlaylistEncoreConsumerComponent create(Activity activity, Picasso picasso);
    }

    ComponentFactory<ParticipantRowPlaylist, ParticipantRowPlaylistConfiguration> participantRowPlaylistFactory();
}
