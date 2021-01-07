package com.spotify.music.features.entityselector.container;

import com.spotify.music.features.entityselector.common.b;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class EntitySelectorFragmentModule$UserSelectionModule$provideEntitySelectorResultProvider$1 extends Lambda implements cmf<List<? extends ty4>> {
    final /* synthetic */ b $userSelectionManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EntitySelectorFragmentModule$UserSelectionModule$provideEntitySelectorResultProvider$1(b bVar) {
        super(0);
        this.$userSelectionManager = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public List<? extends ty4> invoke() {
        return this.$userSelectionManager.c();
    }
}
