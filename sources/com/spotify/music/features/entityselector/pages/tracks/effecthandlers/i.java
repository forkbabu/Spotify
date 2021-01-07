package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTracksResponse;
import com.spotify.music.preview.v;
import defpackage.c05;
import io.reactivex.android.schedulers.a;
import io.reactivex.w;
import io.reactivex.z;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class i {
    public static final w<c05, d05> a(nmf<uy4, f> nmf, z<EntitySelector$CarePackageTracksResponse> zVar, v vVar, sz4 sz4, dz4 dz4) {
        h.e(nmf, "addTrackAction");
        h.e(zVar, "tracksResponse");
        h.e(vVar, "previewPlayer");
        h.e(sz4, "search");
        h.e(dz4, "entitySelectorLogger");
        m f = com.spotify.mobius.rx2.i.f();
        h.e(zVar, "tracksResponse");
        f.h(c05.b.class, new c(zVar));
        f.d(c05.a.class, new d(dz4, nmf));
        f.e(c05.e.class, new e(vVar), a.b());
        f.e(c05.d.class, new f(vVar), a.b());
        f.d(c05.c.class, new g(sz4));
        f.e(c05.f.class, new h(vVar), a.b());
        return f.i();
    }
}
