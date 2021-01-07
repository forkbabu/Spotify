package com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.podcast.impl.episoderow.elements.description.EpisodeRowDescription;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class DescriptionTagLineIconFactory {
    private static final float ICON_SIZE_DP = 16.0f;
    public static final DescriptionTagLineIconFactory INSTANCE = new DescriptionTagLineIconFactory();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            EpisodeRowDescription.TagLineType.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            EpisodeRowDescription.TagLineType tagLineType = EpisodeRowDescription.TagLineType.Music;
            iArr[0] = 1;
        }
    }

    private DescriptionTagLineIconFactory() {
    }

    private final SpotifyIconDrawable createDrawableWithIcon(Context context, SpotifyIconV2 spotifyIconV2) {
        return new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(ICON_SIZE_DP, context.getResources()));
    }

    public final Drawable createIconDrawable(Context context, EpisodeRowDescription.TagLineType tagLineType) {
        h.e(context, "context");
        h.e(tagLineType, "type");
        if (tagLineType.ordinal() != 0) {
            return null;
        }
        return createDrawableWithIcon(context, SpotifyIconV2.PLAYLIST);
    }
}
