package com.spotify.music.superbird.setup.domain;

import com.spotify.music.superbird.setup.domain.f;
import defpackage.ooe;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class l<T, R> implements io.reactivex.functions.l<ooe, f> {
    public static final l a = new l();

    l() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public f apply(ooe ooe) {
        f kVar;
        ooe ooe2 = ooe;
        h.e(ooe2, "event");
        if (ooe2 instanceof ooe.d) {
            return f.m.a;
        }
        if (ooe2 instanceof ooe.a) {
            ooe.a aVar = (ooe.a) ooe2;
            String i = aVar.i();
            h.d(i, "downloadCompleted.serial()");
            String h = aVar.h();
            h.d(h, "downloadCompleted.packageName()");
            String k = aVar.k();
            h.d(k, "downloadCompleted.version()");
            String g = aVar.g();
            h.d(g, "downloadCompleted.hash()");
            kVar = new f.j(i, h, k, g, aVar.j());
        } else if (ooe2 instanceof ooe.b) {
            ooe.b bVar = (ooe.b) ooe2;
            String i2 = bVar.i();
            h.d(i2, "downloadFailed.serial()");
            String h2 = bVar.h();
            h.d(h2, "downloadFailed.packageName()");
            String k2 = bVar.k();
            h.d(k2, "downloadFailed.version()");
            String g2 = bVar.g();
            h.d(g2, "downloadFailed.hash()");
            kVar = new f.k(i2, h2, k2, g2, bVar.j());
        } else {
            throw new IllegalArgumentException("Unknown OTA event passed to Setup flow.");
        }
        return kVar;
    }
}
