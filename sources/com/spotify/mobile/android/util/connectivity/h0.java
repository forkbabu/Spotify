package com.spotify.mobile.android.util.connectivity;

import com.spotify.mobile.android.util.connectivity.q;

public abstract class h0 {

    public interface a {
        h0 build();
    }

    public static a a() {
        q.b bVar = new q.b();
        bVar.a(ConnectionType.CONNECTION_TYPE_UNKNOWN);
        q.b bVar2 = bVar;
        bVar2.b(false);
        q.b bVar3 = bVar2;
        bVar3.c(false);
        return bVar3;
    }

    public abstract ConnectionType b();

    public abstract boolean c();

    public abstract boolean d();
}
