package com.spotify.mobile.android.service.feature;

import com.spotify.base.java.logging.Logger;
import com.spotify.remoteconfig.nj;

public class q {
    private final boolean a;

    q(nj njVar) {
        boolean a2 = njVar.a();
        this.a = a2;
        Logger.g("Project Flash isEnabled: %b", Boolean.valueOf(a2));
    }

    public boolean a() {
        return this.a;
    }
}
