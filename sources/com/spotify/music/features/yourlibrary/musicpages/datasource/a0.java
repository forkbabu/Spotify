package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Map;

public final /* synthetic */ class a0 implements l {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList(0);
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!((CollectionStateProvider.a) entry.getValue()).a() && !((CollectionStateProvider.a) entry.getValue()).b()) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }
}
