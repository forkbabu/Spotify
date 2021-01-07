package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.searchview.assistedcuration.proto.EntityType;

/* renamed from: sta  reason: default package */
public class sta implements rta<EntityType> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.rta
    public String a(EntityType entityType) {
        PageIdentifiers pageIdentifiers;
        int ordinal = entityType.ordinal();
        if (ordinal == 1) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTISTS;
        } else if (ordinal == 2) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_SONGS;
        } else if (ordinal != 3) {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH;
        } else {
            pageIdentifiers = PageIdentifiers.ASSISTED_CURATION_SEARCH_ALBUMS;
        }
        return pageIdentifiers.path();
    }
}
