package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.models.j;

public class k0 {
    private final boolean a;
    private final boolean b;

    public k0(boolean z, boolean z2) {
        this.b = z2;
        this.a = z;
    }

    public boolean a(j jVar, String str) {
        if (this.b || this.a) {
            return true;
        }
        l0 z = l0.z(str);
        if (LinkType.SHOW_SHOW == z.q() || LinkType.SHOW_EPISODE == z.q()) {
            return true;
        }
        if (jVar == null || jVar.v() == null || !jVar.v().booleanValue()) {
            return false;
        }
        return true;
    }
}
