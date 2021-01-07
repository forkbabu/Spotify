package com.spotify.music.features.podcast.quotesharing.di;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.h;

public interface PodcastEpisodeQuotesModule {
    public static final Companion a = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final nmf<Set<a>, List<a>> a(List<String> list) {
            h.e(list, "destinationList");
            return new PodcastEpisodeQuotesModule$Companion$provideSortShareDestinations$1(list);
        }
    }
}
