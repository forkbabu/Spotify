package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import defpackage.s81;

/* renamed from: ywa  reason: default package */
public class ywa implements axa<Entity> {
    private final pwa<Entity> a;

    public ywa(pwa<Entity> pwa) {
        this.a = pwa;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [s81$a, java.lang.Object] */
    @Override // defpackage.axa
    public s81.a a(s81.a aVar, Entity entity) {
        Entity entity2 = entity;
        s81.a d = aVar.d("searchHistorySubtitle", this.a.f(entity2));
        return entity2.i() == Entity.EntityCase.TRACK ? d.k("album_uri", entity2.n().n().l()) : d;
    }
}
