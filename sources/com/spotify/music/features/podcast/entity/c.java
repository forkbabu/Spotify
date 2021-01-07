package com.spotify.music.features.podcast.entity;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.util.filterheader.b;
import java.util.List;
import kotlin.jvm.internal.h;

public final class c {
    private final List<b> a;
    private final List<SortOption> b;
    private final SortOption c;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.util.filterheader.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.mobile.android.util.SortOption> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends b> list, List<? extends SortOption> list2, SortOption sortOption) {
        h.e(list, "filterParams");
        h.e(list2, "sortParams");
        h.e(sortOption, "defaultSortOption");
        this.a = list;
        this.b = list2;
        this.c = sortOption;
    }

    public final SortOption a() {
        return this.c;
    }

    public final List<b> b() {
        return this.a;
    }

    public final List<SortOption> c() {
        return this.b;
    }
}
