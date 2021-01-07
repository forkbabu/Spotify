package defpackage;

import com.spotify.music.features.playlistentity.header.x0;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;
import defpackage.a07;
import defpackage.j17;
import defpackage.kz6;
import defpackage.nz6;
import defpackage.p07;
import defpackage.qb6;
import defpackage.zo6;
import defpackage.zt6;

/* renamed from: ez6  reason: default package */
public class ez6 implements zo6.c {
    private final wlf<qz6> a;
    private final wlf<nz6.a> b;
    private final wlf<x0.a> c;
    private final wlf<zt6.a> d;
    private final wlf<ui6> e;
    private final wlf<AndroidLibsPlaylistEntityModesVanillaProperties> f;
    private final wlf<qb6.a> g;
    private final wlf<kz6.c> h;
    private final wlf<p07.b> i;
    private final wlf<j17.b> j;
    private final wlf<a07.b> k;

    public ez6(wlf<qz6> wlf, wlf<nz6.a> wlf2, wlf<x0.a> wlf3, wlf<zt6.a> wlf4, wlf<ui6> wlf5, wlf<AndroidLibsPlaylistEntityModesVanillaProperties> wlf6, wlf<qb6.a> wlf7, wlf<kz6.c> wlf8, wlf<p07.b> wlf9, wlf<j17.b> wlf10, wlf<a07.b> wlf11) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        qz6 qz6 = this.a.get();
        a(qz6, 1);
        qz6 qz62 = qz6;
        nz6.a aVar = this.b.get();
        a(aVar, 2);
        nz6.a aVar2 = aVar;
        x0.a aVar3 = this.c.get();
        a(aVar3, 3);
        x0.a aVar4 = aVar3;
        zt6.a aVar5 = this.d.get();
        a(aVar5, 4);
        zt6.a aVar6 = aVar5;
        ui6 ui6 = this.e.get();
        a(ui6, 5);
        ui6 ui62 = ui6;
        AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties = this.f.get();
        a(androidLibsPlaylistEntityModesVanillaProperties, 6);
        AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties2 = androidLibsPlaylistEntityModesVanillaProperties;
        qb6.a aVar7 = this.g.get();
        a(aVar7, 7);
        qb6.a aVar8 = aVar7;
        kz6.c cVar = this.h.get();
        a(cVar, 8);
        kz6.c cVar2 = cVar;
        p07.b bVar = this.i.get();
        a(bVar, 9);
        p07.b bVar2 = bVar;
        j17.b bVar3 = this.j.get();
        a(bVar3, 10);
        j17.b bVar4 = bVar3;
        a07.b bVar5 = this.k.get();
        a(bVar5, 11);
        return new bz6(qz62, aVar2, aVar4, aVar6, ui62, androidLibsPlaylistEntityModesVanillaProperties2, aVar8, cVar2, bVar2, bVar4, bVar5);
    }
}
