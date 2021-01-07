package com.spotify.encore.consumer.components.podcastinteractivity.impl.replycard;

import android.view.View;
import com.spotify.encore.consumer.components.podcastinteractivity.api.replycard.ReplyCardEpisodePage;

final class DefaultReplyCardEpisodePage$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;

    DefaultReplyCardEpisodePage$onEvent$1(nmf nmf) {
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.$event.invoke(ReplyCardEpisodePage.Events.CardClicked);
    }
}
