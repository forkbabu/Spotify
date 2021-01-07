package defpackage;

import com.google.common.base.Predicate;
import com.spotify.searchview.assistedcuration.proto.Entity;

/* renamed from: iva  reason: default package */
public final /* synthetic */ class iva implements Predicate {
    public static final /* synthetic */ iva a = new iva();

    private /* synthetic */ iva() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Entity entity = (Entity) obj;
        return (entity == null || entity.i() == Entity.EntityCase.ENTITY_NOT_SET) ? false : true;
    }
}
