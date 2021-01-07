package com.spotify.music.features.createplaylist;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import java.util.Collections;

public class g implements blb {
    private final Context a;

    public g(Context context) {
        this.a = context;
    }

    public Intent a(Intent intent, c cVar) {
        Context context = this.a;
        int i = CreatePlaylistActivity.P;
        return CreatePlaylistActivity.U0(context, null, Collections.emptyList(), "spotify:new:playlist", "spotify:new:playlist");
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).h(LinkType.NEW_PLAYLIST, "", new b(this));
    }
}
