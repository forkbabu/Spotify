package com.spotify.music.features.settings.adapter;

import com.spotify.music.features.settings.model.OfflineResource;
import com.spotify.music.features.settings.model.OfflineResources;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class c1 implements l {
    public static final /* synthetic */ c1 a = new c1();

    private /* synthetic */ c1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = p2.l1;
        List<OfflineResource> list = ((OfflineResources) obj).mResources;
        return Integer.valueOf(list == null ? 0 : list.size());
    }
}
