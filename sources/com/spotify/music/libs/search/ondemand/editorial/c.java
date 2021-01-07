package com.spotify.music.libs.search.ondemand.editorial;

import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ f a;
    public final /* synthetic */ EditorialOnDemandInfo b;

    public /* synthetic */ c(f fVar, EditorialOnDemandInfo editorialOnDemandInfo) {
        this.a = fVar;
        this.b = editorialOnDemandInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d(this.b);
    }
}
