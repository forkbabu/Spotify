package com.spotify.music.features.freetierartist;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

public class q implements blb {
    private final epd a;

    public q(epd epd) {
        this.a = epd;
    }

    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        if (!this.a.b(intent)) {
            String F = l0Var.F();
            F.getClass();
            return ArtistFragment.K4(F, cVar, l0Var.s());
        }
        this.a.a(intent, l0Var);
        throw null;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        c cVar = new c(this);
        d dVar = d.a;
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.ARTIST, "Show artist fragment", cVar);
        xkb.i(LinkType.ARTIST_AUTOPLAY, "Show artist fragment", cVar);
        xkb.k(mlb.b(LinkType.ARTIST_ALBUMS), "Handle artist albums uri routing", new fkb(dVar));
        xkb.k(mlb.b(LinkType.ARTIST_APPEARS_ON), "Handle artist appears-on uri routing", new fkb(dVar));
        xkb.k(mlb.b(LinkType.ARTIST_COMPILATIONS), "Handle artist compilations uri routing", new fkb(dVar));
        xkb.k(mlb.b(LinkType.ARTIST_PLAYLISTS), "Handle artist playlists uri routing", new fkb(dVar));
        xkb.k(mlb.b(LinkType.ARTIST_RELATED), "Handle artist related uri routing", new fkb(dVar));
        xkb.k(mlb.b(LinkType.ARTIST_SINGLES), "Handle artist singles uri routing", new fkb(dVar));
    }
}
