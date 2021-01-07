package com.spotify.music.libs.search.ondemand.editorial;

import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ f a;
    public final /* synthetic */ EditorialOnDemandInfo b;

    public /* synthetic */ b(f fVar, EditorialOnDemandInfo editorialOnDemandInfo) {
        this.a = fVar;
        this.b = editorialOnDemandInfo;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
