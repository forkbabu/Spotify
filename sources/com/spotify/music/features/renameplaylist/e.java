package com.spotify.music.features.renameplaylist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.navigation.b;

public class e implements d {
    private final Context a;
    private final Bundle b;
    private final b c;

    public e(Context context, b bVar) {
        this.a = context;
        this.b = androidx.core.app.b.a(context, 17432576, 17432577).c();
        this.c = bVar;
    }

    @Override // com.spotify.music.features.renameplaylist.d
    public void a(String str, String str2) {
        b bVar = this.c;
        Context context = this.a;
        int i = RenamePlaylistActivity.M;
        Intent y = je.y(context, RenamePlaylistActivity.class, "playlist_uri", str);
        y.putExtra("playlist_name", str2);
        bVar.a(y, this.b);
    }
}
