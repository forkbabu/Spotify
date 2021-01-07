package com.spotify.encore.consumer.components.podcast;

import android.app.Activity;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.squareup.picasso.Picasso;

public interface PodcastEncoreConsumerComponent {

    public interface Factory {
        PodcastEncoreConsumerComponent create(Activity activity, Picasso picasso);
    }

    ComponentFactory<Component<EpisodeRow.Model, EpisodeRow.Events>, EpisodeRow.Configuration> episodeRowFactory();
}
