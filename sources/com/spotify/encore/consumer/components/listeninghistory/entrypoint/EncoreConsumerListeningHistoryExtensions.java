package com.spotify.encore.consumer.components.listeninghistory.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.listeninghistory.api.albumrow.AlbumRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.artistcollectionrow.ArtistCollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.artistrow.ArtistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.collectionrow.CollectionRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.entityrow.Events;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.internalrow.InternalRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.playlistrow.PlaylistRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.podcastrow.PodcastRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.radiorow.RadioRowListeningHistory;
import com.spotify.encore.consumer.components.listeninghistory.api.searchrow.SearchRowListeningHistory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerListeningHistoryExtensions {
    public static final ComponentFactory<Component<AlbumRowListeningHistory.Model, Events>, ComponentConfiguration> albumRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$albumRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$albumRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<ArtistCollectionRowListeningHistory.Model, Events>, ComponentConfiguration> artistCollectionRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$artistCollectionRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$artistCollectionRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<ArtistRowListeningHistory.Model, Events>, ComponentConfiguration> artistRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$artistRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$artistRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<CollectionRowListeningHistory.Model, Events>, ComponentConfiguration> collectionRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$collectionRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$collectionRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<EpisodeRowListeningHistory.Model, EpisodeRowListeningHistory.Events>, ComponentConfiguration> episodeRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$episodeRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$episodeRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<InternalRowListeningHistory.Model, Events>, ComponentConfiguration> internalRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$internalRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$internalRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<PlaylistRowListeningHistory.Model, Events>, ComponentConfiguration> playlistRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$playlistRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$playlistRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<PodcastRowListeningHistory.Model, Events>, ComponentConfiguration> podcastRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$podcastRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$podcastRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<RadioRowListeningHistory.Model, Events>, ComponentConfiguration> radioRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$radioRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$radioRowListeningHistoryFactory$1(rows);
    }

    public static final ComponentFactory<Component<SearchRowListeningHistory.Model, Events>, ComponentConfiguration> searchRowListeningHistoryFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$searchRowListeningHistoryFactory");
        return new EncoreConsumerListeningHistoryExtensions$searchRowListeningHistoryFactory$1(rows);
    }
}
