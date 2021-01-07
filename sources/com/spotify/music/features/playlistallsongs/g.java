package com.spotify.music.features.playlistallsongs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.navigation.b;

public class g implements f {
    private final Context a;
    private final Bundle b;
    private final b c;

    public g(Context context, b bVar) {
        this.a = context;
        this.b = androidx.core.app.b.a(context, 17432576, 17432577).c();
        this.c = bVar;
    }

    @Override // com.spotify.music.features.playlistallsongs.f
    public void a(String str, c cVar) {
        b bVar = this.c;
        Context context = this.a;
        int i = PlaylistAllSongsActivity.P;
        if (MoreObjects.isNullOrEmpty(str)) {
            Assertion.p("No playlistUri provided. A playlistUri MUST be provided.");
        }
        Intent y = je.y(context, PlaylistAllSongsActivity.class, "playlist_uri", str);
        y.putExtra("include_episodes", cVar);
        bVar.a(y, this.b);
    }
}
