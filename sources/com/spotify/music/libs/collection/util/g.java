package com.spotify.music.libs.collection.util;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import java.util.Map;

public final /* synthetic */ class g implements Predicate {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((CollectionStateProvider.a) ((Map.Entry) obj).getValue()).a();
    }
}
