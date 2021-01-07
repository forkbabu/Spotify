package com.spotify.encore.consumer.components.podcastinteractivity.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.replycard.DefaultReplyCardEpisodePage;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerReplyCardEpisodePageExtensions$replyCardEpisodePageFactory$1 implements ComponentFactory<Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events>, ReplyCardEpisodePage.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Cards $this_replyCardEpisodePageFactory;

    EncoreConsumerReplyCardEpisodePageExtensions$replyCardEpisodePageFactory$1(EncoreConsumerEntryPoint.Cards cards) {
        this.$this_replyCardEpisodePageFactory = cards;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ReplyCardEpisodePage.Model, ReplyCardEpisodePage.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultReplyCardEpisodePage make(ReplyCardEpisodePage.Configuration configuration) {
        return new DefaultReplyCardEpisodePage(this.$this_replyCardEpisodePageFactory.getActivity(), this.$this_replyCardEpisodePageFactory.getPicasso());
    }
}
