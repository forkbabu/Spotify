package com.spotify.music.podcastinteractivity.qna.carousel;

import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PodcastQnACarouselImpl$bindReplyRowComponent$$inlined$with$lambda$1 extends Lambda implements nmf<ReplyRowQnA.Events, f> {
    final /* synthetic */ ReplyRowQnA.Model $model$inlined;
    final /* synthetic */ PodcastQnACarouselImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PodcastQnACarouselImpl$bindReplyRowComponent$$inlined$with$lambda$1(PodcastQnACarouselImpl podcastQnACarouselImpl, ReplyRowQnA.Model model) {
        super(1);
        this.this$0 = podcastQnACarouselImpl;
        this.$model$inlined = model;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ReplyRowQnA.Events events) {
        ReplyRowQnA.Events events2 = events;
        h.e(events2, "it");
        int ordinal = events2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            PodcastQnACarouselImpl.c(this.this$0).e();
        }
        return f.a;
    }
}
