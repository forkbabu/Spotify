package defpackage;

import com.google.common.base.Predicate;
import com.spotify.searchview.proto.Entity;

/* renamed from: ota  reason: default package */
public final /* synthetic */ class ota implements Predicate {
    public static final /* synthetic */ ota a = new ota();

    private /* synthetic */ ota() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Entity entity = (Entity) obj;
        return (entity == null || entity.m() == Entity.EntityCase.ENTITY_NOT_SET) ? false : true;
    }
}
