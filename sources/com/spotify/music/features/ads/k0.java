package com.spotify.music.features.ads;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.api.c;

public class k0 implements blb {
    private c a;

    public k0(c cVar) {
        this.a = cVar;
    }

    public /* synthetic */ elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        this.a.a(l0.z(intent.getDataString()));
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.AD), "Handle ad routing.", new fkb(new i(this)));
    }
}
