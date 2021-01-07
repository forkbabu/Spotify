package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.libs.search.ondemand.editorial.EditorialOnDemandInfo;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.OnDemand;
import defpackage.s81;

/* renamed from: bxa  reason: default package */
public class bxa implements axa<Entity> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [s81$a, java.lang.Object] */
    @Override // defpackage.axa
    public s81.a a(s81.a aVar, Entity entity) {
        Entity entity2 = entity;
        if (!(entity2.m() == Entity.EntityCase.TRACK && !MoreObjects.isNullOrEmpty(entity2.q().n().l()) && !MoreObjects.isNullOrEmpty(entity2.q().n().i()))) {
            return aVar;
        }
        OnDemand n = entity2.q().n();
        return aVar.d("editorialOnDemandInfo", EditorialOnDemandInfo.a(n.l(), n.i()));
    }
}
