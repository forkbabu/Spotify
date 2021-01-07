package com.spotify.music.features.nowplaying;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.mainactivity.t;
import com.spotify.music.mainactivity.z;
import com.spotify.music.navigation.i;

public class b implements blb {
    private final i a;
    private final z b;
    private final t c;

    public b(i iVar, z zVar, t tVar) {
        this.a = iVar;
        this.b = zVar;
        this.c = tVar;
    }

    public /* synthetic */ elb a(Intent intent, c cVar, SessionState sessionState) {
        if (this.a.u() == null) {
            this.c.a(cVar, sessionState);
        }
        this.b.a();
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        a aVar = new a(this);
        xkb xkb = (xkb) glb;
        xkb.getClass();
        xkb.f(new ilb("com.spotify.mobile.android.ui.action.player.SHOW"), "Show player", aVar);
    }
}
