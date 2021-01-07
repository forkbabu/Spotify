package com.spotify.music.features.playlistentity.datasource.sorting;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public class b extends EntitySorting {
    private static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("playlist");

    public b(Context context, i iVar, g gVar) {
        super(context, iVar, gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.playlistentity.datasource.sorting.EntitySorting
    public SpSharedPreferences.b<Object, String> b() {
        return e;
    }
}
