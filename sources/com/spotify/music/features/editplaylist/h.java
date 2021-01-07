package com.spotify.music.features.editplaylist;

import android.content.Context;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.navigation.b;

public class h implements g {
    private final Context a;
    private final Bundle b;
    private final b c;

    public h(Context context, b bVar) {
        this.a = context;
        this.b = androidx.core.app.b.a(context, 17432576, 17432577).c();
        this.c = bVar;
    }

    @Override // com.spotify.music.features.editplaylist.g
    public void a(String str) {
        b bVar = this.c;
        Context context = this.a;
        int i = EditPlaylistActivity.O;
        if (MoreObjects.isNullOrEmpty(str)) {
            Assertion.p("No playlistUri provided. A playlistUri MUST be provided.");
        }
        bVar.a(je.y(context, EditPlaylistActivity.class, "playlist_uri", str), this.b);
    }
}
