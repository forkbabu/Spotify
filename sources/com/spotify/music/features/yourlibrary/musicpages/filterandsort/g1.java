package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public class g1 {
    private static final SpSharedPreferences.b<Object, String> c = SpSharedPreferences.b.e("music_pages_filtering");
    private final Context a;
    private final i b;

    public g1(Context context, i iVar) {
        this.a = context;
        this.b = iVar;
    }
}
