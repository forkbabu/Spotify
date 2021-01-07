package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play;

import android.content.res.Resources;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.play.PlayElement;
import kotlin.jvm.internal.h;

public final class ContentDescriptionHelperKt {
    public static final String buildContentDescription(Resources resources, PlayElement.Model model) {
        h.e(resources, "resources");
        h.e(model, "model");
        if (model.isPlaying()) {
            String string = resources.getString(R.string.content_description_episode_card_action_pause_with_param, model.getTitle());
            h.d(string, "resources.getString(\n   …    model.title\n        )");
            return string;
        }
        String string2 = resources.getString(R.string.content_description_episode_card_action_play_with_param, model.getTitle());
        h.d(string2, "resources.getString(\n   …    model.title\n        )");
        return string2;
    }
}
