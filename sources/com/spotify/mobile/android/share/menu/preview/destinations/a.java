package com.spotify.mobile.android.share.menu.preview.destinations;

import com.google.common.base.Optional;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a {
    private final Set<com.spotify.mobile.android.share.menu.preview.api.a> a;
    private final Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, Set<com.spotify.mobile.android.share.menu.preview.api.a>>> b;
    private final Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, List<com.spotify.mobile.android.share.menu.preview.api.a>>> c;

    public a(Set<com.spotify.mobile.android.share.menu.preview.api.a> set, Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, Set<com.spotify.mobile.android.share.menu.preview.api.a>>> optional, Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, List<com.spotify.mobile.android.share.menu.preview.api.a>>> optional2) {
        h.e(set, "shareDestinationsSet");
        h.e(optional, "shareDestinationFilter");
        h.e(optional2, "shareDestinationComparator");
        this.a = set;
        this.b = optional;
        this.c = optional2;
    }

    public final List<com.spotify.mobile.android.share.menu.preview.api.a> a() {
        Set<com.spotify.mobile.android.share.menu.preview.api.a> set = this.a;
        Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, Set<com.spotify.mobile.android.share.menu.preview.api.a>>> optional = this.b;
        if (optional.isPresent()) {
            set = optional.get().invoke(set);
        }
        Optional<nmf<Set<com.spotify.mobile.android.share.menu.preview.api.a>, List<com.spotify.mobile.android.share.menu.preview.api.a>>> optional2 = this.c;
        return d.Q(optional2.isPresent() ? optional2.get().invoke(set) : d.Q(set));
    }
}
