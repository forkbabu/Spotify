package com.spotify.music.features.playlistentity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.o;

public class r implements yec {
    private final Bundle a;
    private final b b;
    private final o c;

    public r(Context context, b bVar, o oVar) {
        this.a = androidx.core.app.b.a(context, 17432576, 17432577).c();
        this.b = bVar;
        this.c = oVar;
    }

    @Override // defpackage.yec
    public void a(String str) {
        Intent b2 = this.c.b(n.a(str).a());
        int i = PlaylistFragment.k0;
        this.b.a(b2.putExtra("open_all_songs_dialog", true), this.a);
    }
}
