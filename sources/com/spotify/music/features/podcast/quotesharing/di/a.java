package com.spotify.music.features.podcast.quotesharing.di;

import java.util.Comparator;
import kotlin.jvm.internal.h;

final class a<T> implements Comparator<com.spotify.mobile.android.share.menu.preview.api.a> {
    final /* synthetic */ PodcastEpisodeQuotesModule$Companion$provideSortShareDestinations$1 a;

    a(PodcastEpisodeQuotesModule$Companion$provideSortShareDestinations$1 podcastEpisodeQuotesModule$Companion$provideSortShareDestinations$1) {
        this.a = podcastEpisodeQuotesModule$Companion$provideSortShareDestinations$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(com.spotify.mobile.android.share.menu.preview.api.a aVar, com.spotify.mobile.android.share.menu.preview.api.a aVar2) {
        return h.g(this.a.$destinationList.indexOf(aVar.a()), this.a.$destinationList.indexOf(aVar2.a()));
    }
}
