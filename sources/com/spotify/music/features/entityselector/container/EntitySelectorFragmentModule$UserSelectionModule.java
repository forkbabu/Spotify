package com.spotify.music.features.entityselector.container;

import com.spotify.music.features.entityselector.common.b;
import java.util.List;
import kotlin.jvm.internal.h;

public final class EntitySelectorFragmentModule$UserSelectionModule {
    public static final cmf<List<ty4>> a(b bVar) {
        h.e(bVar, "userSelectionManager");
        return new EntitySelectorFragmentModule$UserSelectionModule$provideEntitySelectorResultProvider$1(bVar);
    }
}
