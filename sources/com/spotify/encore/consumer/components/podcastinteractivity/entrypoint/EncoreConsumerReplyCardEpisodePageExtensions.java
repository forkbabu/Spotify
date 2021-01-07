package com.spotify.encore.consumer.components.podcastinteractivity.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerReplyCardEpisodePageExtensions {
    public static final ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration> replyCardEpisodePageFactory(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$replyCardEpisodePageFactory");
        return new EncoreConsumerReplyCardEpisodePageExtensions$replyCardEpisodePageFactory$1(cards);
    }
}
