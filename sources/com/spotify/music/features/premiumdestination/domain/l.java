package com.spotify.music.features.premiumdestination.domain;

import com.spotify.music.features.premiumdestination.domain.i;

public abstract class l {

    public interface a {
        l build();
    }

    public static a a(m mVar) {
        i.b bVar = new i.b();
        bVar.a(null);
        bVar.b(false);
        bVar.c(mVar);
        return bVar;
    }

    public abstract String b();

    public abstract boolean c();

    public abstract m d();

    public abstract a e();
}
