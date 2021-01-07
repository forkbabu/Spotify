package com.spotify.encore.consumer.components.podcastinteractivity.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow.DefaultReplyRowQnA;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class EncoreConsumerReplyRowQnAExtensions$replyRowQnAFactory$1 implements ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration> {
    final /* synthetic */ EncoreConsumerEntryPoint.Rows $this_replyRowQnAFactory;

    EncoreConsumerReplyRowQnAExtensions$replyRowQnAFactory$1(EncoreConsumerEntryPoint.Rows rows) {
        this.$this_replyRowQnAFactory = rows;
    }

    @Override // com.spotify.encore.ComponentFactory
    public Component<ReplyRowQnA.Model, ReplyRowQnA.Events> make() {
        return ComponentFactory.DefaultImpls.make(this);
    }

    public DefaultReplyRowQnA make(ReplyRowQnA.Configuration configuration) {
        return new DefaultReplyRowQnA(this.$this_replyRowQnAFactory.getActivity());
    }
}
