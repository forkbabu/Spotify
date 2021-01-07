package com.spotify.music.features.queue.service;

import com.google.common.collect.FluentIterable;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return FluentIterable.from((List) obj).transform(n.a).transform(l.a).toList();
    }
}
