package com.spotify.music.features.radio.common;

import com.spotify.mobile.android.util.LinkType;

public class f implements blb {
    @Override // defpackage.blb
    public void b(glb glb) {
        c cVar = c.a;
        ((xkb) glb).k(mlb.b(LinkType.STATION), "Display radio feature fragments.", new fkb(cVar));
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.STATION_CLUSTER), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.DAILYMIX), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.RADIO_ALBUM), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.RADIO_ARTIST), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.RADIO_PLAYLIST), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.RADIO_GENRE), "Display radio feature fragments.", new fkb(cVar));
        xkb.k(mlb.b(LinkType.RADIO_TRACK), "Display radio feature fragments.", new fkb(cVar));
    }
}
