package com.spotify.encore.consumer.album;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbum;
import com.spotify.encore.consumer.components.album.api.trackrow.TrackRowAlbumConfiguration;

public interface AlbumEncoreConsumerComponent {

    public interface Factory {
        AlbumEncoreConsumerComponent create(Activity activity);
    }

    ComponentFactory<TrackRowAlbum, TrackRowAlbumConfiguration> trackRowAlbumFactory();
}
