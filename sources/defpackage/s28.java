package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.i;

/* renamed from: s28  reason: default package */
public class s28 implements blb {
    private final i a;
    private final nsb b;
    private final nfd c;

    public s28(i iVar, nsb nsb, nfd nfd) {
        this.a = iVar;
        this.b = nsb;
        this.c = nfd;
    }

    public elb a(Intent intent, c cVar, SessionState sessionState) {
        String a2 = agd.a(l0.z(intent.getDataString()).B());
        this.c.c(new String[]{a2}, ViewUris.c, false, true, -1, kfd.a1, yn0.a(kfd.a(this.a.u())), null);
        this.b.a();
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        r28 r28 = new r28(this);
        ((xkb) glb).k(mlb.b(LinkType.ALBUM_RADIO), "Handle radio uri routing", new fkb(r28));
        xkb xkb = (xkb) glb;
        xkb.k(mlb.b(LinkType.ARTIST_RADIO), "Handle radio uri routing", new fkb(r28));
        xkb.k(mlb.b(LinkType.GENRE_RADIO), "Handle radio uri routing", new fkb(r28));
        xkb.k(mlb.b(LinkType.PLAYLIST_RADIO), "Handle radio uri routing", new fkb(r28));
        xkb.k(mlb.b(LinkType.TRACK_RADIO), "Handle radio uri routing", new fkb(r28));
        xkb.k(mlb.b(LinkType.USER_PLAYLIST_RADIO), "Handle radio uri routing", new fkb(r28));
    }
}
