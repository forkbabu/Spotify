package com.spotify.music.features.settings.adapter;

import com.google.common.base.Predicate;
import com.spotify.music.features.settings.adapter.Item;

/* access modifiers changed from: package-private */
public final class x2 implements Predicate<Item> {
    x2() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.common.base.Predicate
    public boolean apply(Item item) {
        Item.For g = item.g();
        boolean z = false;
        boolean z2 = g == Item.For.ANY_USER;
        if (g == Item.For.REGISTERED_USER) {
            z = true;
        }
        return z2 | z;
    }
}
