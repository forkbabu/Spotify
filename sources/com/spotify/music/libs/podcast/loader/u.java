package com.spotify.music.libs.podcast.loader;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.util.UriBuilder;
import com.spotify.playlist.models.Show;

public final class u {
    private final String a;
    private SortOption b;
    private Show.MediaType c;

    private u(String str) {
        this.a = str;
    }

    public static u a(String str) {
        return new u(str);
    }

    public void b(Show.MediaType mediaType) {
        this.c = mediaType;
    }

    public UriBuilder c() {
        UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/<username>/list/shows/all");
        uriBuilder.x(100);
        uriBuilder.y(this.a);
        uriBuilder.u(this.b);
        uriBuilder.t(null, null);
        uriBuilder.h(false);
        uriBuilder.c(false);
        uriBuilder.n(false);
        uriBuilder.o(UriBuilder.Format.PROTOBUF);
        Show.MediaType mediaType = this.c;
        if (mediaType != null) {
            uriBuilder.q(mediaType.ordinal());
        }
        return uriBuilder;
    }

    public String d() {
        return this.a;
    }

    public void e(SortOption sortOption) {
        this.b = sortOption;
    }
}
