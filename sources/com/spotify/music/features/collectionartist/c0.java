package com.spotify.music.features.collectionartist;

import com.google.common.collect.ImmutableMap;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.podcast.download.f0;

public final class c0 {
    private static final ImmutableMap<Integer, a> a;

    private static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put(Integer.valueOf((int) C0707R.string.collection_artist_section_my_albums), new a(C0707R.string.collection_artist_section_my_albums_your_library));
        builder.mo51put(Integer.valueOf((int) C0707R.string.placeholder_collection_empty_artist_only_not_following_body), new a(C0707R.string.placeholder_collection_empty_artist_only_not_following_body_your_library));
        a = builder.build();
    }

    public static int a(c cVar, int i) {
        a aVar = a.get(Integer.valueOf(i));
        if (aVar == null) {
            i = 0;
        } else if (f0.b(cVar)) {
            i = aVar.a;
        }
        Assertion.k(i != 0, "The requested string has no mapping. Add it to CollectionArtistStringsHelper", new Object[0]);
        return i;
    }
}
