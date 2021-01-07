package com.spotify.encore.consumer.components.podcastinteractivity.entrypoint;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

public final class EncoreConsumerReplyRowQnAExtensions {
    public static final ComponentFactory<Component<ReplyRowQnA.Model, ReplyRowQnA.Events>, ReplyRowQnA.Configuration> replyRowQnAFactory(EncoreConsumerEntryPoint.Rows rows) {
        h.e(rows, "$this$replyRowQnAFactory");
        return new EncoreConsumerReplyRowQnAExtensions$replyRowQnAFactory$1(rows);
    }
}
