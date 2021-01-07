package com.spotify.music.features.playlistentity.premiumminidownloaded.toolbar;

import com.google.common.collect.ImmutableList;
import defpackage.zt6;
import java.util.Collection;
import kotlin.jvm.internal.h;

public final class d implements zt6.d<gu6> {
    private final a a;
    private final PremiumMiniRemoveAllSongsItem b;

    public d(a aVar, PremiumMiniRemoveAllSongsItem premiumMiniRemoveAllSongsItem) {
        h.e(aVar, "premiumMiniAddSongsItem");
        h.e(premiumMiniRemoveAllSongsItem, "premiumMiniRemoveAllItem");
        this.a = aVar;
        this.b = premiumMiniRemoveAllSongsItem;
    }

    @Override // defpackage.zt6.d
    public ImmutableList<gu6> a(ImmutableList<gu6> immutableList) {
        h.e(immutableList, "original");
        ImmutableList<gu6> copyOf = ImmutableList.copyOf((Collection) kotlin.collections.d.C(kotlin.collections.d.u(this.a, this.b), immutableList));
        h.d(copyOf, "ImmutableList.copyOf(lis…eAllItem).plus(original))");
        return copyOf;
    }
}
