package com.spotify.music.libs.collection.model;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.util.UriBuilder;

public final class b {
    private static final SortOption e;
    private final String a;
    private boolean b;
    private SortOption c = e;
    private boolean d;

    static {
        SortOption sortOption = new SortOption("discNumber");
        sortOption.i(new SortOption("trackNumber"));
        e = sortOption;
    }

    private b(String str) {
        this.a = str;
    }

    public static b a(String str) {
        return new b(str);
    }

    public String b() {
        return this.a;
    }

    public UriBuilder c() {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/@/view/album/<b62-album-id>");
        uriBuilder.x(500);
        uriBuilder.p(this.a);
        uriBuilder.u(this.c);
        uriBuilder.c(this.b);
        uriBuilder.d(this.d);
        uriBuilder.o(UriBuilder.Format.JSON);
        return uriBuilder;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public b e(boolean z) {
        this.b = z;
        return this;
    }
}
