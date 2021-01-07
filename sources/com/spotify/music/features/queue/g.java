package com.spotify.music.features.queue;

import com.google.common.base.Predicate;
import com.spotify.music.features.queue.v;

public final /* synthetic */ class g implements Predicate {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        int i = ((v.a) obj).a;
        return i == 2 || i == 3;
    }
}
