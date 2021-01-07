package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1;
import defpackage.di9;

class y0 implements b1.a {
    private final di9.d a = b1.e("name", C0707R.string.your_library_sort_order_artist_name_alphabetically_in_artists);
    final /* synthetic */ b1 b;

    y0(b1 b1Var) {
        this.b = b1Var;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public ane a() {
        return this.a.c();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.filterandsort.b1.a
    public di9 b() {
        ImmutableList of = ImmutableList.of(this.a, b1.e("addTime", C0707R.string.sort_order_recently_added));
        String string = this.b.f.getString(C0707R.string.your_library_music_pages_find_in_artists_hint);
        di9.a a2 = di9.a();
        a2.e(this.b.f.getString(C0707R.string.your_library_music_pages_artists_show_sort_options_title));
        a2.f(this.b.f.getString(C0707R.string.your_library_music_pages_artists_show_text_filter_title));
        a2.g(of);
        a2.h(string);
        a2.d(true);
        a2.c(false);
        return a2.a();
    }
}
