package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1;
import com.spotify.playlist.endpoints.p;
import defpackage.di9;

class x0 implements b1.a {
    private final di9.d a;
    private final di9.d b;
    final /* synthetic */ b1 c;

    x0(b1 b1Var) {
        this.c = b1Var;
        String c2 = p.a.c.e.c();
        ane ane = p.a.c.c;
        String c3 = ane.c();
        ane ane2 = p.a.c.b;
        this.a = b1.c(c2, C0707R.string.sort_order_recently_played, b1.b(c3, b1.a(ane2.c())));
        this.b = b1.c(p.a.c.d.c(), C0707R.string.your_library_sort_order_relevance, b1.b(ane.c(), b1.a(ane2.c())));
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public ane a() {
        if (this.c.e.f()) {
            return this.b.c();
        }
        return this.a.c();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public di9 b() {
        ane ane = p.a.c.a;
        di9.d e = b1.e(ane.c(), C0707R.string.your_library_sort_order_custom_in_playlists);
        String c2 = p.a.c.c.c();
        ane ane2 = p.a.c.b;
        ImmutableList of = ImmutableList.of(this.b, e, b1.c(c2, C0707R.string.your_library_sort_order_name_alphabetically, b1.a(ane2.c())), this.a, b1.c(ane2.c(), C0707R.string.sort_order_recently_added, b1.a(ane.c())));
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (this.c.e.e()) {
            di9.b.a c3 = di9.b.c();
            c3.d("available_offline_only");
            c3.f(this.c.f.getString(C0707R.string.your_library_music_pages_filtered_offline_only_indicator_title));
            c3.b(this.c.f.getString(C0707R.string.your_library_music_pages_filtered_offline_only_indicator_title));
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.FILTER;
            c3.e(spotifyIconV2);
            c3.a(spotifyIconV2);
            c3.g(false);
            builder.mo53add((ImmutableList.Builder) c3.c());
        }
        String string = this.c.f.getString(C0707R.string.your_library_music_pages_find_in_playlists_hint);
        di9.a a2 = di9.a();
        a2.e(this.c.f.getString(C0707R.string.your_library_music_pages_playlists_show_sort_options_title));
        a2.f(this.c.f.getString(C0707R.string.your_library_music_pages_playlists_show_text_filter_title));
        a2.g(of);
        a2.b(builder.build());
        a2.h(string);
        a2.d(true);
        a2.c(false);
        return a2.a();
    }
}
