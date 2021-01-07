package com.spotify.encore.consumer.yourepisodes;

import android.app.Activity;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;

public interface YourEpisodesEncoreConsumerComponent {

    public interface Factory {
        YourEpisodesEncoreConsumerComponent create(Activity activity);
    }

    ComponentFactory<YourEpisodesHeader, YourEpisodesHeader.Configuration> yourEpisodesHeaderFactory();
}
