package com.spotify.encore.consumer.components.podcastinteractivity.impl.replyrow;

import android.view.View;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replyrow.ReplyRowQnA;
import kotlin.jvm.internal.h;

final class DefaultReplyRowQnA$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultReplyRowQnA$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.d(view, "it");
        Object tag = view.getTag();
        if (tag == ReplyButtonType.REPLY) {
            this.$event.invoke(ReplyRowQnA.Events.ReplyButtonClicked);
        } else if (tag == ReplyButtonType.REPLIED) {
            this.$event.invoke(ReplyRowQnA.Events.RepliedButtonClicked);
        }
    }
}
