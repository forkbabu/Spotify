package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.music.libs.search.ondemand.editorial.e;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ e.a a;
    public final /* synthetic */ EditorialOnDemandInfo b;

    public /* synthetic */ a(e.a aVar, EditorialOnDemandInfo editorialOnDemandInfo) {
        this.a = aVar;
        this.b = editorialOnDemandInfo;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.accept(this.b);
    }
}
