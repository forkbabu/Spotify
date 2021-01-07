package com.spotify.music.features.yourepisodes.view;

import android.content.Context;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import kotlin.jvm.internal.h;

public final class c implements b {
    @Override // com.spotify.music.features.yourepisodes.view.b
    public a a(Context context, YourEpisodesHeader yourEpisodesHeader) {
        h.e(context, "context");
        h.e(yourEpisodesHeader, "headerViews");
        return new HeaderViewBinderImpl(context, yourEpisodesHeader);
    }
}
