package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed.MarkAsPlayedButton;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.markasplayed.MarkAsPlayedButtonView;
import kotlin.jvm.internal.h;

public final class MarkAsPlayedQuickActionElement extends EpisodeRowQuickActionElement<EpisodeRowQuickAction.MarkAsPlayed> {
    private final MarkAsPlayedButtonView markAsPlayedView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarkAsPlayedQuickActionElement(Context context) {
        super(context, null, 0, 6, null);
        h.e(context, "context");
        this.markAsPlayedView = new MarkAsPlayedButtonView(context, null, 0, 6, null);
    }

    public void render(EpisodeRowQuickAction.MarkAsPlayed markAsPlayed) {
        h.e(markAsPlayed, "model");
        setQuickAction(markAsPlayed);
        this.markAsPlayedView.render(new MarkAsPlayedButton.Model(markAsPlayed.getEpisodeName()));
        setEnabled(markAsPlayed.isEnabled());
        addView(this.markAsPlayedView);
    }
}
