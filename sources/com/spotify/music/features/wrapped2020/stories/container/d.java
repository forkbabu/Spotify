package com.spotify.music.features.wrapped2020.stories.container;

import com.spotify.mobile.android.share.menu.preview.api.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class d {
    public final nmf<Set<a>, List<a>> a(b bVar) {
        h.e(bVar, "configuration");
        return new ShareDestinationsConfiguration$order$1(bVar);
    }

    public final nmf<Set<a>, Set<a>> b(b bVar) {
        h.e(bVar, "configuration");
        return new ShareDestinationsConfiguration$filter$1(bVar);
    }
}
