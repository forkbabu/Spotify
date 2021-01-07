package com.spotify.music.features.userplaylistresolver;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

public class f implements blb {
    private final Context a;

    public f(Context context) {
        this.a = context;
    }

    public Intent a(Intent intent, c cVar) {
        l0 z = l0.z(intent.getDataString());
        Context context = this.a;
        int i = ResolveUserPlaylistActivity.J;
        Intent intent2 = new Intent(context, ResolveUserPlaylistActivity.class);
        intent2.putExtra("source_link", z.B());
        return intent2;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).h(LinkType.RESOLVE_USER_PLAYLIST, "", new c(this));
    }
}
