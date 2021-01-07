package com.spotify.music.features.queue;

import com.spotify.music.sociallistening.models.b;
import io.reactivex.functions.n;

public final /* synthetic */ class j implements n {
    public final /* synthetic */ y a;

    public /* synthetic */ j(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.q((b) obj);
    }
}
