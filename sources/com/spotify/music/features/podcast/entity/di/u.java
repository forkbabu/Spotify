package com.spotify.music.features.podcast.entity.di;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.Comparator;
import kotlin.jvm.internal.h;

final class u<T> implements Comparator<a> {
    final /* synthetic */ PodcastQuoteSharingModule$Companion$provideSortShareDestinations$1 a;

    u(PodcastQuoteSharingModule$Companion$provideSortShareDestinations$1 podcastQuoteSharingModule$Companion$provideSortShareDestinations$1) {
        this.a = podcastQuoteSharingModule$Companion$provideSortShareDestinations$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(a aVar, a aVar2) {
        return h.g(this.a.$destinationList.indexOf(aVar.a()), this.a.$destinationList.indexOf(aVar2.a()));
    }
}
