package com.spotify.music.features.languagepicker.presenter;

import com.spotify.music.features.languagepicker.model.g;
import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, g.a);
        return list;
    }
}
