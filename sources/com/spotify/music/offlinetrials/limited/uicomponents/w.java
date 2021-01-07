package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;

public class w {
    private final u a;
    private final t b;
    private final y c;

    public interface a {
        void a();
    }

    public w(u uVar, t tVar, y yVar) {
        this.a = uVar;
        this.b = tVar;
        this.c = yVar;
    }

    public static void a(w wVar) {
        wVar.b.e(n.a("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne").a());
    }

    public void b(UserMixDataSource.TrackState trackState, a aVar) {
        int ordinal = trackState.ordinal();
        if (ordinal == 0) {
            this.c.b();
        } else if (ordinal == 1) {
            this.c.c();
        } else if (ordinal != 2) {
            this.a.d(n.a, new q(aVar));
        } else {
            this.a.e(p.a, new o(this));
        }
    }
}
