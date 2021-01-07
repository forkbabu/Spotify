package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1;
import defpackage.di9;

class a1 implements b1.a {
    private final di9.d a = b1.c("addTime", C0707R.string.sort_order_recently_added, b1.b("album.name", b1.b("album.artist.name", b1.b("discNumber", b1.a("trackNumber")))));
    final /* synthetic */ b1 b;

    a1(b1 b1Var) {
        this.b = b1Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public ane a() {
        return this.a.c();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public di9 b() {
        ImmutableList of = ImmutableList.of(b1.c("name", C0707R.string.your_library_sort_order_title_alphabetically, b1.a("addTime")), b1.c("artist.name", C0707R.string.your_library_sort_order_artist_name_alphabetically, b1.b("name", b1.a("addTime"))), b1.c("album.name", C0707R.string.your_library_sort_order_album_name_alphabetically_in_liked_songs, b1.b("album.artist.name", b1.b("discNumber", b1.a("trackNumber")))), this.a);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (this.b.e.e()) {
            di9.b.a c = di9.b.c();
            c.d("available_offline_only");
            c.f(this.b.f.getString(C0707R.string.your_library_music_pages_songs_available_downloads_only_filter_inactive_title));
            c.b(this.b.f.getString(C0707R.string.your_library_music_pages_songs_available_downloads_only_filter_active_title));
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.FILTER;
            c.e(spotifyIconV2);
            c.a(spotifyIconV2);
            c.g(false);
            builder.mo53add((ImmutableList.Builder) c.c());
        }
        di9.a a2 = di9.a();
        a2.e(this.b.f.getString(C0707R.string.your_library_music_pages_liked_songs_show_sort_options_title));
        a2.f(this.b.f.getString(C0707R.string.your_library_music_pages_liked_songs_show_text_filter_title));
        a2.g(of);
        a2.b(builder.build());
        a2.h(this.b.f.getString(C0707R.string.your_library_music_pages_find_in_liked_songs_hint));
        a2.d(false);
        a2.c(true);
        return a2.a();
    }
}
