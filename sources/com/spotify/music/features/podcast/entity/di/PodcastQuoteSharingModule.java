package com.spotify.music.features.podcast.entity.di;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.h;

public interface PodcastQuoteSharingModule {
    public static final Companion a = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final nmf<Set<a>, List<a>> a(List<String> list) {
            h.e(list, "destinationList");
            return new PodcastQuoteSharingModule$Companion$provideSortShareDestinations$1(list);
        }
    }
}
