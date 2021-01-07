package com.spotify.pushnotifications;

import com.google.firebase.iid.FirebaseInstanceId;

public final class j implements fjf<i> {
    private final wlf<FirebaseInstanceId> a;

    public j(wlf<FirebaseInstanceId> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i(this.a);
    }
}
