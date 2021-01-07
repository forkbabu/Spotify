package com.spotify.encore.consumer.components.artist.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtist;
import com.spotify.encore.consumer.components.artist.api.playlistcard.PlaylistCardArtistConfiguration;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerExtensions {
    public static final ComponentFactory<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>, ComponentConfiguration> artistCardFollowFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$artistCardFollowFactory");
        return new EncoreConsumerExtensions$artistCardFollowFactory$1(cards);
    }

    public static final ComponentFactory<Component<PlaylistCardArtist.Model, PlaylistCardArtist.Events>, PlaylistCardArtistConfiguration> playlistCardArtistFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$playlistCardArtistFactory");
        return new EncoreConsumerExtensions$playlistCardArtistFactory$1(cards);
    }
}
