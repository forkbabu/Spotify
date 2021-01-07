package com.spotify.music.featues.stationspromo;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.remoteconfig.cb;

public class c implements blb, flb {
    private final cb a;

    public c(cb cbVar) {
        this.a = cbVar;
    }

    @Override // defpackage.flb
    public elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        if (this.a.a()) {
            return elb.d(new StationsPromoFragment());
        }
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.STATIONS_PROMO), "Station Promo Routine", new fkb(this));
    }
}
