package com.spotify.music.features.podcast.entity.di;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class PodcastQuoteSharingModule$Companion$provideSortShareDestinations$1 extends Lambda implements nmf<Set<? extends a>, List<? extends a>> {
    final /* synthetic */ List $destinationList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PodcastQuoteSharingModule$Companion$provideSortShareDestinations$1(List list) {
        super(1);
        this.$destinationList = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public List<? extends a> invoke(Set<? extends a> set) {
        Set<? extends a> set2 = set;
        h.e(set2, "shareDestinationSet");
        return d.J(set2, new u(this));
    }
}
