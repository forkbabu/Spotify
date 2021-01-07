package defpackage;

import com.spotify.searchview.proto.Entity;
import defpackage.s81;

/* renamed from: hxa  reason: default package */
public class hxa implements axa<Entity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [s81$a, java.lang.Object] */
    @Override // defpackage.axa
    public s81.a a(s81.a aVar, Entity entity) {
        Entity entity2 = entity;
        return entity2.m() == Entity.EntityCase.TRACK && entity2.q().q() ? aVar.d("label", "premium") : aVar;
    }
}
