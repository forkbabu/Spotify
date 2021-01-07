package com.spotify.music.features.yourlibraryx;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class c {
    public static final String a(b bVar, Context context) {
        h.e(bVar, "$this$displayName");
        h.e(context, "context");
        if (h.a(bVar, b.d.a)) {
            return "";
        }
        if (bVar instanceof b.e) {
            String string = context.getString(C0707R.string.your_library_content_filter_playlists);
            h.d(string, "context.getString(R.stri…content_filter_playlists)");
            return string;
        } else if (bVar instanceof b.C0269b) {
            String string2 = context.getString(C0707R.string.your_library_content_filter_artists);
            h.d(string2, "context.getString(R.stri…y_content_filter_artists)");
            return string2;
        } else if (bVar instanceof b.a) {
            String string3 = context.getString(C0707R.string.your_library_content_filter_albums);
            h.d(string3, "context.getString(R.stri…ry_content_filter_albums)");
            return string3;
        } else if (bVar instanceof b.f) {
            String string4 = context.getString(C0707R.string.your_library_content_filter_podcasts);
            h.d(string4, "context.getString(R.stri…_content_filter_podcasts)");
            return string4;
        } else if (h.a(bVar, b.c.a)) {
            String string5 = context.getString(C0707R.string.your_library_content_filter_downloads);
            h.d(string5, "context.getString(R.stri…content_filter_downloads)");
            return string5;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final String b(String str) {
        h.e(str, "$this$nullIfBlank");
        if (e.n(str)) {
            return null;
        }
        return str;
    }
}
