package com.spotify.music.features.assistedcuration.search;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.assistedcuration.proto.EntityType;

public class g implements yta<EntityType> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
    @Override // defpackage.yta
    public Optional a(EntityType entityType, String str) {
        String str2;
        EntityType entityType2 = entityType;
        int ordinal = entityType2.ordinal();
        if (ordinal == 1) {
            str2 = "artists";
        } else if (ordinal == 2) {
            str2 = "tracks";
        } else if (ordinal != 3) {
            StringBuilder V0 = je.V0("Could not resolve path for entity type: ");
            V0.append(entityType2.name());
            Assertion.g(V0.toString());
            str2 = null;
        } else {
            str2 = "albums";
        }
        return Optional.fromNullable(str2).transform(new b(str));
    }
}
