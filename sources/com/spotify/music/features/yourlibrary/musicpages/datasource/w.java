package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.a;
import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.b;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class w implements l {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<a> a2 = ((b) obj).a();
        ArrayList arrayList = new ArrayList(a2.size());
        for (a aVar : a2) {
            arrayList.add(aVar.a());
        }
        return arrayList;
    }
}
