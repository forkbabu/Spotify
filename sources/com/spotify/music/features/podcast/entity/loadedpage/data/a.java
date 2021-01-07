package com.spotify.music.features.podcast.entity.loadedpage.data;

import android.net.Uri;
import com.spotify.playlist.models.Show;
import kotlin.jvm.internal.h;

public final class a {
    private final String a;
    private final String b;
    private final Uri c;
    private final Show.MediaType d;

    public a(String str, String str2, Uri uri, String str3, Show.MediaType mediaType) {
        h.e(str, "title");
        h.e(str2, "publisher");
        h.e(uri, "imageUri");
        h.e(str3, "showUri");
        h.e(mediaType, "mediatype");
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = mediaType;
    }

    public final Uri a() {
        return this.c;
    }

    public final Show.MediaType b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }
}
