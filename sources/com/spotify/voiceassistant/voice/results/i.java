package com.spotify.voiceassistant.voice.results;

import com.spotify.voice.results.model.e;
import io.reactivex.functions.n;
import java.util.List;
import kotlin.jvm.internal.h;

final class i<T> implements n<List<? extends e.a>> {
    public static final i a = new i();

    i() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.n
    public boolean test(List<? extends e.a> list) {
        List<? extends e.a> list2 = list;
        h.e(list2, "it");
        return list2.size() >= 5;
    }
}
