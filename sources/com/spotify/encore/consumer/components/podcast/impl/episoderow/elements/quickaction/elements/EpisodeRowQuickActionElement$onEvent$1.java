package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.view.View;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;

/* access modifiers changed from: package-private */
public final class EpisodeRowQuickActionElement$onEvent$1 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ EpisodeRowQuickActionElement this$0;

    EpisodeRowQuickActionElement$onEvent$1(EpisodeRowQuickActionElement episodeRowQuickActionElement, nmf nmf) {
        this.this$0 = episodeRowQuickActionElement;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EpisodeRowQuickAction quickAction = this.this$0.getQuickAction();
        if (quickAction != null) {
            this.$event.invoke(quickAction);
        }
    }
}
