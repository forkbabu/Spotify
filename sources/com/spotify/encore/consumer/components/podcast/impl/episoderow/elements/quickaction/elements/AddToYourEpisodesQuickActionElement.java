package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.quickaction.elements;

import android.content.Context;
import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRowQuickAction;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.elements.addtobutton.AddToButtonView;
import kotlin.jvm.internal.h;

public final class AddToYourEpisodesQuickActionElement extends EpisodeRowQuickActionElement<EpisodeRowQuickAction.AddToYourEpisodes> {
    private final AddToButtonView addToButtonView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToYourEpisodesQuickActionElement(Context context) {
        super(context, null, 0, 6, null);
        h.e(context, "context");
        AddToButtonView addToButtonView2 = new AddToButtonView(context, null, 0, 6, null);
        addToButtonView2.setDrawableSize(context.getResources().getDimension(R.dimen.episode_quick_action_icon_size));
        this.addToButtonView = addToButtonView2;
    }

    public void render(EpisodeRowQuickAction.AddToYourEpisodes addToYourEpisodes) {
        h.e(addToYourEpisodes, "model");
        setQuickAction(addToYourEpisodes);
        this.addToButtonView.render(addToYourEpisodes.getData());
        addView(this.addToButtonView);
        setEnabled(addToYourEpisodes.isEnabled());
    }
}
