package defpackage;

import com.google.common.base.Predicate;
import com.spotify.searchview.proto.EntityType;

/* renamed from: pta  reason: default package */
public final /* synthetic */ class pta implements Predicate {
    public static final /* synthetic */ pta a = new pta();

    private /* synthetic */ pta() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        EntityType entityType = (EntityType) obj;
        return (entityType == EntityType.UNRECOGNIZED || entityType == EntityType.ENTITY_TYPE_UNKNOWN) ? false : true;
    }
}
