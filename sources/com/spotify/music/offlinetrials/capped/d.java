package com.spotify.music.offlinetrials.capped;

import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = n.k;
        return Integer.valueOf(((com.spotify.music.libs.collection.model.d) obj).getItems().size());
    }
}
