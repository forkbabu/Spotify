package defpackage;

import com.google.common.base.Predicate;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: jva  reason: default package */
public final /* synthetic */ class jva implements Predicate {
    public static final /* synthetic */ jva a = new jva();

    private /* synthetic */ jva() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        EntityType entityType = (EntityType) obj;
        return (entityType == EntityType.UNRECOGNIZED || entityType == EntityType.ENTITY_TYPE_UNKNOWN) ? false : true;
    }
}
