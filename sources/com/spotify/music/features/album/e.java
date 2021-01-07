package com.spotify.music.features.album;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;

public class e implements blb, k {
    private final epd a;

    public e(epd epd) {
        this.a = epd;
    }

    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        if (this.a.b(intent)) {
            this.a.a(intent, l0Var);
            throw null;
        } else if (LinkType.COLLECTION_ALBUM == l0Var.q()) {
            String G = l0Var.G();
            G.getClass();
            return AlbumFragment.K4(G, cVar, false, null);
        } else {
            String F = l0Var.F();
            F.getClass();
            return AlbumFragment.K4(F, cVar, l0Var.s(), l0Var.e());
        }
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.ALBUM, "Album routines", this);
        xkb.i(LinkType.ALBUM_AUTOPLAY, "Album AutoPlay routines", this);
        xkb.i(LinkType.COLLECTION_ALBUM, "Collection Album routines", this);
    }
}
