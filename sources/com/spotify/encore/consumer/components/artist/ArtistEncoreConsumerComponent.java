package com.spotify.encore.consumer.components.artist;

import android.app.Activity;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.trackrow.TrackRowArtist;
import com.squareup.picasso.Picasso;

public interface ArtistEncoreConsumerComponent {

    public interface Factory {
        ArtistEncoreConsumerComponent create(Activity activity, Picasso picasso);
    }

    ComponentFactory<TrackRowArtist, ComponentConfiguration> trackRowArtistFactory();
}
