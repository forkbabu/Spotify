package com.spotify.music.features.search.mobius;

import com.google.common.base.MoreObjects;

public class r implements a71 {
    private final c8b a;
    private final z b;

    public r(c8b c8b, z zVar) {
        c8b.getClass();
        this.a = c8b;
        this.b = zVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.a.a();
        String string = o81.data().string("uri");
        int intValue = o81.data().intValue("position").intValue();
        if (!MoreObjects.isNullOrEmpty(string)) {
            this.b.b(string, intValue);
        }
    }
}
