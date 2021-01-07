package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: a19  reason: default package */
public class a19 implements blb {
    private final wbb a;

    public a19(wbb wbb) {
        this.a = wbb;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        r09 r09 = r09.a;
        v09 v09 = v09.a;
        p09 p09 = p09.a;
        t09 t09 = t09.a;
        q09 q09 = q09.a;
        s09 s09 = s09.a;
        u09 u09 = u09.a;
        if (!this.a.g()) {
            ((xkb) glb).i(LinkType.COLLECTION_ROOT, "Collection root: Your Library.", r09);
        }
        ((xkb) glb).k(mlb.b(LinkType.COLLECTION_ROOTLIST), "Collection rootlist: Playlists tab in Your Library.", new fkb(v09));
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.COLLECTION_ALBUM_OVERVIEW, "Collection album overview: Albums tab in Your Library.", p09);
        xkb.i(LinkType.COLLECTION_ARTIST_OVERVIEW, "Collection artist overview: Artists tab in Your Library.", t09);
        xkb.k(mlb.b(LinkType.COLLECTION_PODCASTS_EPISODES), "Collection podcasts episodes: episodes tab", new fkb(s09));
        xkb.k(mlb.b(LinkType.COLLECTION_PODCASTS_DOWNLOADS), "Collection podcasts downloads: downloads tab or old library downloads page", new fkb(s09));
        xkb.k(mlb.b(LinkType.COLLECTION_PODCASTS_FOLLOWING), "Collection podcasts following: following tab or old library following page", new fkb(s09));
        xkb.k(mlb.b(LinkType.COLLECTION_PODCASTS), "Collection podcasts tab", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_PODCASTS_EPISODES_UNFINISHED), "Old unfinished uri fallback navigate to episodes tab", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_UNPLAYED_PODCASTS_EPISODES), "Old unplayed uri fallback navigate to episodes tab", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_UNPLAYED_EPISODES), "Old unplayed uri fallback navigate to episodes tab", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_OFFLINED_EPISODES), "Old downloads uri fallback navigate to downloads tab", new fkb(u09));
        xkb.k(mlb.b(LinkType.COLLECTION_OFFLINE_EPISODES), "Old downloads uri fallback navigate to downloads tab", new fkb(u09));
        xkb.k(mlb.b(LinkType.COLLECTION_SHOWS), "Collection podcasts tab", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_LISTENLATER_EPISODES), "Collection podcasts downloads: downloads tab or old library downloads page", new fkb(q09));
        xkb.k(mlb.b(LinkType.COLLECTION_UNPLAYED_VIDEOS), "Collection podcasts downloads: downloads tab or old library downloads page", new fkb(q09));
    }
}
