package defpackage;

import com.spotify.searchview.proto.Entity;
import defpackage.s81;

/* renamed from: dxa  reason: default package */
public class dxa implements axa<Entity> {
    private final pwa<Entity> a;

    public dxa(pwa<Entity> pwa) {
        this.a = pwa;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [s81$a, java.lang.Object] */
    @Override // defpackage.axa
    public s81.a a(s81.a aVar, Entity entity) {
        Entity entity2 = entity;
        s81.a d = aVar.d("searchHistorySubtitle", this.a.f(entity2));
        return entity2.m() == Entity.EntityCase.TRACK ? d.k("album_uri", entity2.q().o().l()) : d;
    }
}
