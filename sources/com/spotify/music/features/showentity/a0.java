package com.spotify.music.features.showentity;

import com.spotify.mobile.android.util.LinkType;

public class a0 implements blb {
    @Override // defpackage.blb
    public void b(glb glb) {
        n nVar = n.a;
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.SHOW_EPISODE), "Handle show episode links", new fkb(nVar));
        xkb.k(mlb.b(LinkType.SHOW_EPISODE_TIMESTAMP), "Handle show episode timestamp links", new fkb(nVar));
        xkb.k(mlb.b(LinkType.EPISODE_AUTOPLAY), "Handle episode autoplay links", new fkb(nVar));
        xkb.k(mlb.b(LinkType.SHOW_EPISODE_AUTOPLAY), "Handle episode autoplay links with show context", new fkb(m.a));
        o oVar = o.a;
        xkb xkb2 = (xkb) glb;
        xkb2.k(mlb.b(LinkType.VIDEO_EPISODE), "Fallback routing for spotify:internal:video:episode:<id>", new fkb(oVar));
        xkb2.k(mlb.b(LinkType.SHOW_VIDEO), "Fallback routing for spotify:internal:video<id>", new fkb(oVar));
    }
}
