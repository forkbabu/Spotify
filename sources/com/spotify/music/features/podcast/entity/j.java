package com.spotify.music.features.podcast.entity;

import android.content.Context;
import com.spotify.mobile.android.util.EntitySorting;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

public class j extends EntitySorting {
    private static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("podcast");

    public j(Context context, i iVar, g gVar) {
        super(context, iVar, gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.EntitySorting
    public SpSharedPreferences.b<Object, String> b() {
        return e;
    }
}
